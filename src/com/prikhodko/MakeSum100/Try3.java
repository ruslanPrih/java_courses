package com.prikhodko.MakeSum100;

import java.util.ArrayList;
import java.util.Arrays;

public class Try3 {
    private static int numberOfVariants;

    public static void main(String[] args) throws NumberFormatException {
        long startTime = System.currentTimeMillis();
        String variant;
        ArrayList<String> varianteS = new ArrayList();//selected variants with sum=100
        for (int i = 0; i < Math.pow(5, 9); i++) {
            variant = makeSum(100, "123456789");
            if (!varianteS.contains(variant)) {
                varianteS.add(variant);
                numberOfVariants++;
                System.out.println(numberOfVariants);
            }
        }
        System.out.println("Всего вариантов " + numberOfVariants);
        for (String s : varianteS
                ) {
            System.out.println(s);
        }
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + (timeSpent - startTime) + " миллисекунд");
    }

    static String makeSum(int value, String setOfDigits) throws NumberFormatException {

        ArrayList<String> action = new ArrayList<>();
        String[] actionType = {"*", "/", "+", "-"};
        ArrayList<Double> digit = new ArrayList<>();
        double sum;// to be value
        String variant; //string output

        do {
            String tempSetOfDigits = setOfDigits;
            digit.clear();
            action.clear();

            // making array of numbers
            int randLenth = 0;
            int numberOfDigits = 0;
            while (tempSetOfDigits.length() > 0) {
                if (tempSetOfDigits.length() <= 2) {
                    if (tempSetOfDigits.length() == 1) randLenth = 1;
                    if (tempSetOfDigits.length() == 2) randLenth = (int) (Math.random() * 2) + 1;
                } else randLenth = (int) (Math.random() * 3) + 1;
                digit.add(numberOfDigits, Double.valueOf(tempSetOfDigits.substring(0, randLenth)));
                tempSetOfDigits = tempSetOfDigits.substring(randLenth);
                numberOfDigits++;
            }

            //making array of actions
            digit.trimToSize();
            for (int j = 0; j < digit.size() - 1; j++) {
                action.add(j, actionType[(int) (Math.random() * 4)]);
            }

            // String representation
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digit.size() - 1; j++) {
                sb.append(digit.get(j));
                sb.append(action.get(j));
            }
            sb.append(digit.get(digit.size() - 1));
            variant = sb.toString();

            //processing a sum
            sum = 0;

            // first for * and /
            for (int j = 0; j < action.size() ; j++) {
                switch (action.get(j)) {
                    case "*":
                        /*
                        digit.set(j, (digit.get(j) * digit.get(j + 1)));
                        digit.remove(j + 1);
                        action.remove(j);
                        */
                        digit.set(j, (digit.get(j) * digit.get(j + 1)));
                        digit.remove(j + 1);
                        action.remove(j);
                        j--;
                        break;
                    case "/":
                        digit.set(j, (digit.get(j) / digit.get(j + 1)));
                        digit.remove(j + 1);
                        action.remove(j);
                        j--;
                        break;

                    case "+":
                        break;
                    case "-":
                        break;
                    default:
                        System.out.println("Smth wrong");
                }
            }
            //then for + and -
            digit.trimToSize();
            action.trimToSize();
            sum = digit.get(0);
            for (int j = 0; j < action.size(); j++) {
                switch (action.get(j)) {
                    case "+":
                        sum = sum + digit.get(j + 1);
                        break;
                    case "-":
                        sum = sum - digit.get(j + 1);
                        break;
                    case "*":
                        break;
                    case "/":
                        break;
                    default:
                        System.out.println("Smth wrong");
                }
            }
            //System.out.println(sum);
        } while (sum != value);
        return variant;

    }
}
