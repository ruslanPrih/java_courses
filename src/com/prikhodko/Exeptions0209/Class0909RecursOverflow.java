package com.prikhodko.Exeptions0209;

public class Class0909RecursOverflow {
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        try {
            Class0909RecursOverflow.recursivePrint(1);
        }catch (StackOverflowError e){
            System.out.println("\nError! dont use recursion!");
        }

    }
    }




