package com.prikhodko.Codeabbey;
import java.util.Scanner;

public class BlackjackCounting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of sets");
        int n = s.nextInt();
        s.nextLine();
        int sum;
        int acecounter;
        String setValue;
        String[] card = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a set- ");
            card [i]= s.nextLine().trim();

        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            acecounter = 0;
            for (String e : card[i].split(" ")
                    ) {
                try {
                    sum += Integer.parseInt(e);
                } catch (NumberFormatException ex) {
                    if (e.equalsIgnoreCase("t") || e.equalsIgnoreCase("j")
                            || e.equalsIgnoreCase("q") || e.equalsIgnoreCase("k")) {
                        sum += 10;
                    } else if (e.equalsIgnoreCase("a")) {
                        acecounter++;
                    } else {
                        System.out.println("Wrong card!");
                        sum = 0;
                        acecounter = 0;
                        break;
                    }
                }
            }
            if ((sum + acecounter) > 21) {
                setValue = "Bust";
            } else if ((sum + 10 + acecounter) > 21) {
                setValue = String.valueOf(sum + acecounter);
            } else setValue = String.valueOf(Math.max(sum + acecounter, sum + 10 + acecounter));
            System.out.print(setValue + " ");
        }
    }
}
