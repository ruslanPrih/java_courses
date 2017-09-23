package com.prikhodko.MakeSum100;

public class SumOfDigit {
        static int k = 0;

        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            //array of numbers
            int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            //the required value
            int result = 100;
            int m = arrayOfNumbers.length;
            //number of characters (1=+,0=-,2='')
            int n = 3;
            //array of possible permutations
            int[] arrayOfCombinations = new int[m - 1];
            //number of combinations
            int cnt_variants = 0;
            while (cnt_variants <= (int) Math.pow(n, m) - 1) {
                try {
                    calculationOfCombination(arrayOfNumbers, arrayOfCombinations, result, cnt_variants);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid character");
                }
                cnt_variants++;
                nextCombinations(n, arrayOfCombinations);
        }
            System.out.printf("All combinations of symbols = %d\n", cnt_variants);
            if (k == 0) System.out.printf("From this set of numbers, you can not get the right value!!!!!!!!");
            long timeSpent = System.currentTimeMillis();
            System.out.println("программа выполнялась " + (timeSpent - startTime) + " миллисекунд");
        }

        public static void nextCombinations(int combinations, int[] arrayOfCombinations) {
            int j = arrayOfCombinations.length - 1;
            arrayOfCombinations[j]++;
            while (arrayOfCombinations[j] == combinations) {
                arrayOfCombinations[j] = 0;
                if (j != 0) {
                    j--;
                }
                arrayOfCombinations[j]++;

            }
        }

        public static void calculationOfCombination(int[] arrayOfNumbers, int[] arrayOfCombinations,
                                                    int value, int cnt_variants) throws NumberFormatException {
            //string for processing

            StringBuilder sbProcessing = new StringBuilder();
            //output string
            StringBuilder sbOutput = new StringBuilder();
            int result = 0;
            for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
                //zero element processing
                if (i == 0) {
                    sbProcessing.append(arrayOfNumbers[i]);
                    sbOutput.append(sbProcessing);
                    //since we read characters from the end, we need a reverse string
                    sbProcessing.reverse();
                    result += Integer.parseInt(sbProcessing.toString());
                }
                //creating new numbers
                else if (arrayOfCombinations[i - 1] == 2) {
                    sbProcessing.append(arrayOfNumbers[i]);
                }
                //arithmetic operations with numbers
                else {
                    if (arrayOfCombinations[i - 1] == 1) {
                        sbProcessing.append(arrayOfNumbers[i]);
                        sbOutput.append(sbProcessing + "+");
                        sbProcessing.reverse();
                        result += Integer.parseInt(sbProcessing.toString());
                    } else if (arrayOfCombinations[i - 1] == 0) {
                        sbProcessing.append(arrayOfNumbers[i]);
                        sbOutput.append(sbProcessing + "-");
                        sbProcessing.reverse();
                        result -= Integer.parseInt(sbProcessing.toString());
                    }
                    sbProcessing = new StringBuilder();
                }
            }

            if (result == value) {
                k++;
                System.out.printf("Variant №= %d\n", k);
                System.out.print(sbOutput.reverse());
                System.out.println("=" + result);
            }

        }
    }

