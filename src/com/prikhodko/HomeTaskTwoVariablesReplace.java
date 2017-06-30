package com.prikhodko;

/**
 * Created by руслан on 14.05.2017.
 */
public class HomeTaskTwoVariablesReplace {

    public static void main (String [] args ) {
        int a = 3;
        int b = 5;

        System.out.println("a=" + a + " b=" + b);

//1 вариант - явный
        /*int c = a + b;
        int a_edit = b;
        int b_edit = a;
        a=a_edit;
        b=b_edit;
        System.out.println("new a=" + a + " new b=" + b);*/
//2 вариант - не такой явный
        int c = a + b;
        a=c-a;
        b=c-a;
        System.out.print("new a=" + a + " new b=" + b);

        //3 вариант - не такой явный
        a=a+b-(b=a);
        System.out.print("new a=" + a + " new b=" + b);

        //4 вариант - не такой явный
        a=a ^ b ^ (b=a);
        System.out.print("new a=" + a + " new b=" + b);




    }
}
