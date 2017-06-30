package com.prikhodko;

/**
 * Created by руслан on 30.06.2017.
 */


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;


public class homeWork2906 {
    public static void main(String[] args) {

/*
            String[] vocab = new String[]{"cat", "act", "god", "dog", "ea",  "tea", "eta"};
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of lines");
            //number of lines
            int n = s.nextInt();
            String line = s.nextLine();
            int[] lineSymb = new int[128];
            int[] vocabOne = new int[128];
            int[] result = new int[n];
            //lines entering end checking
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the word");
                Arrays.fill(lineSymb, 0);
                line = s.nextLine();

                //symbols at line
                for (int j = 0; j < line.length(); j++) {
                    lineSymb[line.charAt(j)]++;
                }
                //checking at vocabulary
                for (int j = 0; j < vocab.length; j++) {
                    Arrays.fill(vocabOne, 0);
                    if (line.length()== vocab[j].length()) {
                        for (int k = 0; k < vocab[j].length(); k++) {
                            vocabOne[vocab[j].charAt(k)]++;
                        }
                        if (Arrays.equals(lineSymb, vocabOne)) {
                            result[i]++;
                        }
                        if (line.equals(vocab[j])) {
                            result[i]--;
                        }
                    }
                }

            }
            System.out.println("Matches times");
            for ( int a:
                  result) {
                System.out.print(a+" " );

            }
            System.out.println(Arrays.toString(result));
*/
/*
        //#2beta
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of lines");
           // number of lines
            int n = s.nextInt();
            String line = s.nextLine();
            int start = 0;
            int finish = 0;
            int number = 0;
            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Enter the word");
                line = s.nextLine();
                char[] charLine = line.toCharArray();
                if (charLine[0] == '-') {
                    start = 1;
                } else start = 0;
                int j = start;
                do {
                    j++;
                    finish = j;
                    number = Integer.parseInt(line.substring(start, finish));
                } while (Character.isDigit(charLine[j]));
                char temp;
                switch (start) {
                    case 0
                        //move chars
                        for (int e1 = 0; e1 < number; e1++) {
                        temp = charLine[finish + 1];
                        for (int e2 = finish + 1; e2 < charLine.length-1; e2++) {
                            charLine[e2] = charLine[e2+1];
                        }
                        charLine[charLine.length-1]=temp;
                    }
                    break;
                    case 1
                       // move chars
                        for (int e1 = 0; e1 < number; e1++) {
                        temp = charLine[charLine.length-1];
                        for (int e2 = charLine.length-1; e2 > finish+1  ; e2--) {
                            charLine[e2] = charLine[e2-1];
                        }
                        charLine[finish + 1]=temp;
                    }
                    break;
                    default
                        System.out.println("Wrong data!");
                }
                for (int e3=finish+1;e3 < charLine.length; e3++) {
                    System.out.print(charLine[e3]);
                }
                System.out.println(Arrays.toString(charLine));
            }

*/
 /*
            //1from Vasilij
            String s = "iuy9 kkjj 865 kk 7 kj3214";
            char[] ch = s.toCharArray();
            System.out.println(Arrays.toString(ch));

            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    sb.append(Character.toString(ch[i]));
                    if (i == ch.length - 1) sum += Integer.valueOf(sb.toString());
                } else {
                    if (!sb.toString().isEmpty()) sum += Integer.valueOf(sb.toString());
                    sb = new StringBuilder();
                }
            }
            System.out.println(sum);
*/

        //#1 REGEX finding digits in string
        Pattern pattern = Pattern.compile("\\d+");
        String word = "test123test444test";
        StringBuilder sb = new StringBuilder();
        int sum=0;
        //мой пример строки
        Matcher matcher = pattern.matcher(word);
        int start = 0;
        while (matcher.find(start)) {
            String value = word.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            sum += result;
            System.out.println("found "+result);
            start = matcher.end();
        }
        System.out.println("Sum of them "+sum);

    }
}







