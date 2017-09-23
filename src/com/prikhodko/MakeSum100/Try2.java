package com.prikhodko.MakeSum100;

import java.util.ArrayList;

public class Try2 {
    private static int numberOfVariants;

    public static void main(String[] args) throws NumberFormatException {
        long startTime = System.currentTimeMillis();
        String variant;
        ArrayList<String> varianteS = new ArrayList();
        for (int i = 0; i <Math.pow(3, 8); i++) {
            variant = makeSum(100, "123456789");
            if (!varianteS.contains(variant)) {
                varianteS.add(variant);
                numberOfVariants++;
            }
        }
        System.out.println("Всего вариантов "+ numberOfVariants);
        for (String s: varianteS
             ) {
            System.out.println(s);
        }
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (timeSpent - startTime) + " миллисекунд");
    }

     static String makeSum(int value, String setOfDigits) throws NumberFormatException {

        String[] action = new String[setOfDigits.length() - 1];
        int randLenth = 0;
        int[] digit = new int[setOfDigits.length()];
        int sum;
        int numberOfDigits;
        String numb;
        //String variant = "";
        do {
            numb = setOfDigits;
            numberOfDigits = 0;
            for (int k = 0; k < numb.length(); k++) {
                digit[k] = 0;
            }
            for (int k = 0; k < numb.length() - 1; k++) {
                action[k] = "";
            }
            while (numb.length() > 0) {
                if (numb.length() <= 2) {
                    if (numb.length() == 1) randLenth = 1;
                    if (numb.length() == 2) randLenth = (int) (Math.random() * 2) + 1;
                } else randLenth = (int) (Math.random() * 3) + 1;
                digit[numberOfDigits] = Integer.valueOf(numb.substring(0, randLenth));
                numb = numb.substring(randLenth);
                numberOfDigits++;
            }
            sum = digit[0];
            for (int j = 1; j < numberOfDigits; j++) {
                switch ((int) (Math.random() * 2) + 1) {
                    case 1:
                        sum += digit[j];
                        action[j - 1] = "+";
                        break;
                    case 2:
                        sum -= digit[j];
                        action[j - 1] = "-";
                        break;
                    default:
                        System.out.println("Smth wrong");
                }
            }
        } while (sum != value);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numberOfDigits - 1; j++) {
            sb.append(digit[j]);
            sb.append(action[j]);
        }
        sb.append(digit[numberOfDigits - 1]);
        String variant = sb.toString();
        return variant;
    }
}





