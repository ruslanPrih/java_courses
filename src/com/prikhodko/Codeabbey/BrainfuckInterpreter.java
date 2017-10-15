package com.prikhodko.Codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class BrainfuckInterpreter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input data:");
        String code = s.nextLine().trim();
        String input = s.nextLine().trim();
        String[]inputValues=input.split(" ");
        int inputPointer=0;
        int bracketsCounter = 0;
        int dataPointer = 0;
        int memoryLength=128000;
        int[] memory = new int[ memoryLength];
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '>') {
                dataPointer = (dataPointer ==  memoryLength-1) ? 0 : dataPointer + 1;
            } else if (code.charAt(i) == '<') {
                dataPointer = (dataPointer == 0) ?  memoryLength - 1 : dataPointer - 1;
            } else if (code.charAt(i) == '+') {
                memory[dataPointer]++;
            } else if (code.charAt(i) == '-') {
                memory[dataPointer]--;
            } else if (code.charAt(i) == '.') {
                System.out.print((char) memory[dataPointer]+" ");
            } else if (code.charAt(i) == ',') {
                memory[dataPointer] = (int) inputValues[inputPointer].charAt(0);
                inputPointer++;
            } else if (code.charAt(i) == ':') {
                System.out.print(memory[dataPointer]+" ");
            } else if (code.charAt(i) == ';') {
                memory[dataPointer] = Integer.parseInt(inputValues[inputPointer]);
                inputPointer++;
            } else if (code.charAt(i) == '[') {
                if (memory[dataPointer] == 0) {
                    i++;
                    while (bracketsCounter > 0 || code.charAt(i) != ']') {
                        if (code.charAt(i) == '[') bracketsCounter++;
                        if (code.charAt(i) == ']') bracketsCounter--;
                        i++;
                    }
                }
            } else if (code.charAt(i) == ']') {
                if (memory[dataPointer] != 0) {
                    i--;
                    while (bracketsCounter > 0 || code.charAt(i) != '[') {
                        if (code.charAt(i) == ']') bracketsCounter++;
                        if (code.charAt(i) == '[') bracketsCounter--;
                        i--;
                    }
                    i--;
                }
            }
            //System.out.println(Arrays.toString(memory));
        }

    }


}


