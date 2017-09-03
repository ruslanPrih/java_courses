package com.prikhodko.Exeptions0209;

import java.util.Scanner;

public class Error {
    public static void main(String[]args) {

        System.out.println("This is runtime calculator");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        double sum=0;
        while(!"true".equals(str)){
            double number =0;
            try{
                number=Double.valueOf(str);
            }catch (Exception e){
                System.out.println("EW catch non number");
            }
            sum+=number;
            str=sc.nextLine();
        }


        /*
        //todo bad place;
        Integer i;
        String number= null;
        try{
            i= Integer.valueOf(number);
        }catch (Exception e){
            System.out.println("bad Integer");
        }finally {
            i=61;
        }
        System.out.println(i);
*/

        /*
        try {
            System.out.println("try");
            throw new IllegalArgumentException("This is exeption");

        } catch (MyExeption e) {
            System.out.println("We catct this exeption");
        } catch (Exeption e) {
            if (e instanceof  NullPointerException) System.out.println("We catct this exeption");
        } finally {
            System.out.println("block finally");
        }
        */
    }

}
