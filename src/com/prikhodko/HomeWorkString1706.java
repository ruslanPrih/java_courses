package com.prikhodko;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by руслан on 17.06.2017.
 */
public class HomeWorkString1706 {
    public static void main(String[] args) {


//01

        String s = "sdmo123qd88dq 88 9";
        //снаружи добавляем пробелы
        s = (" ").concat(s).concat(" ");
        //находим позиции НЕ ЦИФР в строке
        int[] num = new int[s.length() + 2];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if (48 > c || c > 57) {
                num[j] = i;
                j++;
            }
        }
        //выводим цифры и суммируем
        int value;
        int sum = 0;
        String cut;
        //char one;
        for (int i = 0; i <= j; i++) {
            if (num[i + 1] - num[i] >= 2) {
                cut = s.substring(num[i] + 1, num[i + 1]);
                value = Integer.valueOf(cut);
                sum = sum + value;
            }
            /*
            //не нужно
            if (num[i + 1] - num[i] == 2) {
                one = s.charAt(num[i] + 1);
                value = Character.getNumericValue(one);
                sum = sum + value;
            }
            */
        }
        System.out.println("Sum of numbers in string= " + sum);


/*
        //02alfa
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount of lines - N");
        int n = s.nextInt();
        int[] vowelsNum = new int[n];
        String vowels = "aeiouyAEIOUY";
        String[] line = new String[n];
        Scanner l = new Scanner(System.in);
        //вводим массив линий
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a line:");
            line[i] = l.nextLine();
        }
        //анализ на гласные
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < line[i].length(); j++) {
                if (vowels.indexOf(line[i].charAt(j)) != -1) {
                    vowelsNum[i]++;
                }
            }
        }
        System.out.println("Answer:");
        System.out.println(Arrays.toString(vowelsNum));
        s.close();
*/
/*
        //02Beta
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount of lines - N");
        int n = s.nextInt();
        int[] vowelsNum = new int[n];
        String vowels = "aeiouyAEIOUY";

        //отдельный сканнер для String
        Scanner l = new Scanner(System.in);
        //ввод анализ на гласные
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a line:");
            String line = l.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (vowels.indexOf(line.charAt(j)) != -1) {
                    vowelsNum[i]++;
                }
            }
        }
        System.out.println("Answer:");
        //System.out.println(Arrays.toString(vowelsNum));
        for (int i:vowelsNum
             ) {
            System.out.print(i+"  ");
        }
        s.close();
        l.close();
*/
/*
        //03
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of lines - N");
        int n = sc.nextInt();
        Scanner l = new Scanner(System.in);
        int step;
        String output = "";
        String add = "";
        int space;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a line:");
            String s = l.nextLine();
            space = s.indexOf(' ');
            step = Integer.valueOf(s.substring(0, space));
            System.out.println(step);

            if (step >= s.length() / 2 || space < 0) {
                System.out.println("параметры вне диапазона, повтор");
                i--;
                continue;
            }
            if (step >= 0) {
                output = output.concat(s.substring(step + space+1).concat(s.substring(space+1, step + space+1)).concat(" "));
            }
            if (step < 0) {
                output = output.concat(s.substring(s.length() + step).concat(s.substring(space+1, s.length() + step)).concat(" "));
            }

        }
        System.out.println(output);

        sc.close();
        l.close();
*/
    }
}
