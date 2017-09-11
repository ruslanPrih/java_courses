package com.prikhodko.Exeptions0209;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //String action = "+-*/";
        Scanner sc = new Scanner(System.in);
        String str = "";
        double sum = 0;
        System.out.println("This is calc. The first is (0). Enter action - then numb\nType stop to stop");
        while (!"stop".equals(str)) {
            str = sc.nextLine();
            if (str == null) throw new NullPointerException();
            if (!str.equals("stop")) {
                try {
                    String[] s = str.trim().split(" ", 2);
                    double numb = Double.valueOf(s[1]);
                    switch (s[0]) {
                        case "+":
                            sum += numb;
                            break;
                        case "-":
                            sum -= numb;
                            break;
                        case "/":
                            sum /= numb;
                            break;
                        case "*":
                            sum *= numb;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    //catching NaN&Infinity
                    if (Double.isNaN(sum)) {
                        throw new ArithmeticException();
                    }
                    if (Double.isInfinite(sum)) {
                        throw new ArithmeticException();
                    }
                } catch (NullPointerException | ArithmeticException e) {
                    System.out.println("Argument can't be zero!");
                    sum = 0;
                    System.out.println(sum);
                    continue;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Add smth! Enter action - then numb");
                } catch (Exception e) {
                    System.out.println("Wrong action or numb!\nEnter action - then numb. Use gaps");
                }
                System.out.println(sum);
            }
        }
        System.out.println("By!");
    }
        }



