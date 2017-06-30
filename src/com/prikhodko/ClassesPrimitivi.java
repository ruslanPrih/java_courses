package com.prikhodko;

/**
 * Created by руслан on 20.05.2017.
 */
public class ClassesPrimitivi {
    public static void main(String[] args) {
        //20.05.2017 примитивы

        byte b = 1;
        byte b1 = 1 + 2;

        b = (byte) (b1 + 1);
        final byte B = 126;
        b = B + 1;

        //не катит
        //b=-1*b;
        b = (byte) (-1 * b);
        //операции с битом только через приведение
        int i = 2;
        b = (byte) i;
        final int D = 3;
        b = D;
        //проходят даже большие числа
        b += i++;
        b += 1000;
        b *= 2;
// маленькая буква f
        float f = 1.1f;
        b /= f;
        //как запихнуть большое число в INT
        //L-Long большая буква в конце
        int j = (int) 2_200_000_000_000L;
        //можно и так , прокатит, но вышди из диапазона
        int J1 = 1_100_000_000;
        int J2 = 1_100_000_000;
        int J3 = J1 + J2;

        System.out.println(2 - 1.1);
//ставим точку для double при операциях с числами
        int i5 = 3 / 2;
        double d = 3 / 2.;
        System.out.println(i5);
        System.out.println(d);


//ОПЕРАЦИИ

        int i6 = 1;
        System.out.println(++i6);

//СHAR ?????
        //вытягиваем из char  код символа использовать следующий метод
        char c = 'c';
        c = 53;
        c = '1';
        System.out.println("char " + c);

        int i8 = c;
        System.out.println("char " + i8);

//вытягиваем из char  число в 16-ной?
        c = '?';
        i8 = Character.getNumericValue(c);
        System.out.println("char " + i8);
        //-1 возвращает если не латинский алфавит и символы


// BOOLEAN
// boolean не соответствует 0 и 1 как в других языках(true false)

//abramian PrimitivesSolving

            double a = 2.5;
            double V = Math.pow(a, 3);
            double S = 6 * Math.pow(a, 2);
            System.out.println(a);
            System.out.println(V);
            System.out.println(S);

//27.05.207
            int i27=3;
            i27=i27++ + ++i27 + i27++;
        System.out.println(i27);
        int b27=i27;
        System.out.println(b27);




    }
}
