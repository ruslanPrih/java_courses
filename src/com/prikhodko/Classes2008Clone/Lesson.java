package com.prikhodko.Classes2008Clone;

import java.util.Date;

public class Lesson {
    public static void main (String[]args){
        /*
        System.out.println(A.a);
        System.out.println(A.b);
        new B("2","3");
        */


        Adress adress= new Adress(4,"Krasovskogo","Bro");
        Student student=new Student(18, "Petro", new Date(), adress);
        /*
        //Методы клонирования
        */
        //Student student1 = student.clone();   //1-method clone()

        Student student1 = new Student(student);//2-Использование конструктора копирования

        System.out.println(student);
        System.out.println(student1);
        student.setBirthday(new Date(10000000));
        adress.setCity("Kiev");
        System.out.println();
        System.out.println(student);
        System.out.println(student1);

//не клонируется время

    }
}
