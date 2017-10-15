package com.prikhodko.Codeabbey;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input data:");
        int n = s.nextInt();
        s.nextLine();
        //
        int turn;
        int[] win = new int[n];

        for (int j = 0; j < n; j++) {
            String[] data = s.nextLine().trim().split(" ");
            ArrayList<String> win1 = new ArrayList<>();
            ArrayList<String> win2 = new ArrayList<>();
            turn = 0;
            for (int i = 0; i < data.length; i++) {
                ++turn;
                if (turn % 2 != 0) {
                    win1.add(data[i]);
                } else {
                    win2.add(data[i]);
                }
                if ((win1.contains("1") && (win1.contains("2") && win1.contains("3"))) ||
                        (win1.contains("4") && (win1.contains("5") && win1.contains("6"))) ||
                        (win1.contains("7") && (win1.contains("8") && win1.contains("9"))) ||
                        (win1.contains("1") && (win1.contains("4") && win1.contains("7"))) ||
                        (win1.contains("2") && (win1.contains("5") && win1.contains("8"))) ||
                        (win1.contains("3") && (win1.contains("6") && win1.contains("9"))) ||
                        (win1.contains("1") && (win1.contains("5") && win1.contains("9"))) ||
                        (win1.contains("3") && (win1.contains("5") && win1.contains("7")))) {
                    win[j] = i + 1;
                    break;
                } else if ((win2.contains("1") && (win2.contains("2") && win2.contains("3"))) ||
                        (win2.contains("4") && (win2.contains("5") && win2.contains("6"))) ||
                        (win2.contains("7") && (win2.contains("8") && win2.contains("9"))) ||
                        (win2.contains("1") && (win2.contains("4") && win2.contains("7"))) ||
                        (win2.contains("2") && (win2.contains("5") && win2.contains("8"))) ||
                        (win2.contains("3") && (win2.contains("6") && win2.contains("9"))) ||
                        (win2.contains("1") && (win2.contains("5") && win2.contains("9"))) ||
                        (win2.contains("3") && (win2.contains("5") && win2.contains("7")))) {
                    win[j] = i + 1;
                    break;
                } else win[j] = 0;
            }
        }
        System.out.println("Answer:");
        for (int e : win
                ) {
            System.out.print(e + " ");

        }

    }
}
