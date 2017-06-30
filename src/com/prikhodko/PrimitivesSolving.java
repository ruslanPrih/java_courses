package com.prikhodko;

/**
 * Created by руслан on 20.05.2017.
 */
public class PrimitivesSolving {
        public static void main(String[] args) {
                //5
                double a = 2.5;
                double V = Math.pow(a, 3);
                double S = 6 * Math.pow(a, 2);
                System.out.println(a);
                System.out.println(V);
                System.out.println(S);
//7
                double r = 3.;
                double L = 2 * r * Math.PI;
                double S1 = Math.PI * Math.pow(r, 2);

                System.out.println(r);
                System.out.println(L);
                System.out.println(S1);
//15


                double S2 = 3.;
                double PI = 3.14;
                double D1 = Math.pow(4 * S2 / PI, 0.5);
                double L1 = PI * D1;

                System.out.println(S2);
                System.out.println(L1);
                System.out.println(D1);

//20
                double x1 = 2.;
                double y1 = 5.5;
                double x2 = 3.;
                double y2 = 7.5;
                double L2 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
                System.out.println("Расстояние " + L2);


//26

                double x_26 = 3.3;
                double function = 4 * Math.pow(x_26 - 3, 6) - 7 * Math.pow(x_26 - 3, 3);
                System.out.println("Номер 26 " + x_26);
                System.out.println(function);

                //31
                double t_far = 90;
                double t_cel;
                t_cel = (t_far - 32) * 5 / 9;
                System.out.println("Номер 31 " + t_far);
                System.out.println(t_cel);

                //33

                double m1 = 2;
                double m2 = 3.5;
                double tota1_price1 = 5.5;
                double tota1_price2;

                double price;
                price = tota1_price1 / m1;
                tota1_price2 = price * m2;
                System.out.println("Номер 33 ");
                System.out.println("Цены 1 кг " + price);
                System.out.println("Цены 3.5 кг " + tota1_price2);

                //integer17

                int i = 11125;
                int hundreds = i % 1000 / 100;
                System.out.println("INteger 17 разряд сотен - " + hundreds);

                //integer19

                int seconds = 11125;
                int minutes = i / 60;
                System.out.println("INteger 19 количество минут - " + minutes);

                //begin 1

                double a1 = 3.3;
                double perimeter1 = 4 * a1;
                System.out.println("Begin_Номер 1 " + "периметр");
                System.out.println(perimeter1);


                //begin 2

                double a2 = 3.3;
                double sBegin1 = Math.pow(a2, 2);

                System.out.println("Begin_Номер 2 \n" + "площадь");
                System.out.println(sBegin1);
                System.out.println("теперь форматированное");
                System.out.printf("%.2f", sBegin1);
                System.out.println();
                System.out.println();

                //begin 3

                double a3 = 2.53;
                double b3 = 3.46;
                double perimeter3 = 2 * (a3 + b3);
                double s3 = a3 * b3;

                System.out.println("Begin_Номер 3 \n" + "площадь " + s3 + " периметр " + perimeter3);
                System.out.printf("теперь форматированное %.2f", s3);
                System.out.printf("  %.2f", perimeter3);
                System.out.println();
                System.out.println();

                //begin 4

                double d4 = 2.53;
                double pi = 3.14;
                double l4 = d4 * pi;

                System.out.println("Begin_Номер 4 \n" + "длина круга" + l4);
                System.out.printf("теперь форматированное %.2f", l4);
                System.out.println();
                System.out.println();


                //begin 5

                double a5 = 2.53;

                double v5 = Math.pow(a5, 3);
                double s5 = 6 * Math.pow(a5, 2);

                System.out.println("Begin_Номер 5 \n" + "площадь " + s5 + " объем " + v5);
                System.out.printf("теперь форматированное %.2f", s5);
                System.out.printf("  %.2f", v5);
                System.out.println();
                System.out.println();

                //begin 6

                double a6 = 2.53;
                double b6 = 3.53;
                double c6 = 1.53;

                double s6 = 2 * (a6 * b6 + b6 * c6 + a6 * c6);
                double v6 = a6 * b6 * c6;

                System.out.println("Begin_Номер 6 \n" + "площадь " + s6 + " объем " + v6);
                System.out.printf("теперь форматированное %.2f", s6);
                System.out.printf("  %.2f", v6);
                System.out.println();
                System.out.println();

                //begin 8

                double a8 = 2.53;
                double b8 = 3.53;

                double middleMath8 = (a8 + b8) / 2;

                System.out.println("Begin_Номер 8 \n" + "среднее арифметическое " + middleMath8);
                System.out.printf("теперь форматированное %.2f", middleMath8);
                System.out.println();
                System.out.println();

                //begin 9

                double a9 = 2.53;
                double b9 = 3.53;

                double middleGeom9 = Math.pow(a9 * b9, 0.5);

                System.out.println("Begin_Номер 9 \n" + "среднее арифметическое " + middleGeom9);
                System.out.printf("теперь форматированное %.2f", middleGeom9);
                System.out.println();
                System.out.println();

                //begin 10

                double a10 = -2.53;
                double b10 = 3.53;

                double sqvrA10 = Math.pow(a10, 2);
                double sqvrB10 = Math.pow(b10, 2);

                System.out.println("Begin_Номер 10 \nоперации с квадратами двух чисел");
                System.out.println("Их сумма " + (sqvrA10 + sqvrB10) + " разность " + (sqvrA10 - sqvrB10) + " произведение " + sqvrA10 * sqvrB10 + " и частное " + sqvrA10 / sqvrB10);
                System.out.printf("теперь форматированное %.2f;  %.2f;  %.2f;  %.2f", (sqvrA10 + sqvrB10), (sqvrA10 - sqvrB10), sqvrA10 * sqvrB10, sqvrA10 / sqvrB10);
                System.out.println();
                System.out.println();

                //begin 11

                double a11 = -2.53;
                double b11 = 3.53;

                double newA11 = Math.abs(a11);
                double newB11 = Math.abs(b11);

                System.out.println("Begin_Номер 11 \nоперации с модулями двух чисел");
                System.out.println("Их сумма " + (newA11 + newB11) + " разность " + (newA11 - newB11) + " произведение " + newA11 * newB11 + " и частное " + newA11 / newB11);
                System.out.printf("теперь форматированное %.2f;  %.2f;  %.2f;  %.2f", (newA11 + newB11), (newA11 - newB11), newA11 * newB11, newA11 / newB11);
                System.out.println();
                System.out.println();

                //begin 12

                double a12 = 2.53;
                double b12 = 3.53;

                double c12 = Math.pow((Math.pow(a12, 2) + Math.pow(b12, 2)), 0.5);
                double p12 = a12 + b12 + c12;

                System.out.println("Begin_Номер 12 \n" + "гипотенуза " + c12 + " периметр " + p12);
                System.out.printf("теперь форматированное %.2f  %.2f", c12, p12);
                System.out.println("\n");

                //begin 13

                double r1Thirteen = 2.53;
                double r2Thirteen = 3.53;
                double pi13 = 3.14;

                double s1thirteen = pi13 * Math.pow(r1Thirteen, 2);
                double s2thirteen = pi13 * Math.pow(r2Thirteen, 2);
                double s3thirteen = s1thirteen - s2thirteen;

                System.out.println("Begin_Номер 13 \n" + "площадь большего круга " + s1thirteen + " меньшего " + s2thirteen + " кольца " + s3thirteen);
                System.out.printf("теперь форматированное %.2f  %.2f  %.2f", s1thirteen, s2thirteen, s3thirteen);
                System.out.println("\n");

                //begin 14

                double lForteen = 268.50;
                double pi14 = 3.14;
                double r14 = lForteen / 2 / pi14;
                double s14 = pi14 * Math.pow(r14, 2);

                System.out.println("Begin_Номер 14 \n" + "радиус " + r14 + " площадь " + s14);
                System.out.printf("теперь форматированное %.2f  %.2f", r14, s14);
                System.out.println("\n");

                //begin 16

                double x1sixteen = 268.50;
                double x2sixteen = 375.90;
                double s16 = Math.abs(x2sixteen - x1sixteen);

                System.out.println("Begin_Номер 16 \n" + "расстояние равно " + s16);
                System.out.printf("теперь форматированное %.2f", s16);
                System.out.println("\n");

                //begin 17

                double a17 = 168.8;
                double b17 = 268.8;
                double c17 = 436.46;

                double lAC17 = Math.abs(c17 - a17);
                double lBC17 = Math.abs(c17 - b17);

                System.out.println("Begin_Номер 17 \n" + "длина AC " + lAC17 + " BC " + lBC17 + " и их сумма " + (lAC17 + lBC17));
                System.out.printf("теперь форматированное %.2f  %.2f  %.2f", lAC17, lBC17, (lAC17 + lBC17));
                System.out.println("\n");

                //begin 18

                double a18 = 168.8;
                double c18 = 268.8;
                double b18 = 436.46;

                double lAC18 = Math.abs(a18 - c18);
                double lCB18 = Math.abs(b18 - c18);

                System.out.println("Begin_Номер 18 \n" + "длина AC " + lAC18 + " CB " + lCB18 + " и их произведение " + (lAC18 * lCB18));
                System.out.printf("теперь форматированное %.2f  %.2f  %.2f", lAC18, lCB18, (lAC18 * lCB18));
                System.out.println("\n");


                //begin 19

                double x1Nineteen = 168.8;
                double x2Nineteen = 468.8;
                double y1Nineteen = 668.8;
                double y2Nineteen = 222.8;

                double xProjection = Math.abs(x2Nineteen - x1Nineteen);
                double yProjection = Math.abs(y2Nineteen - y1Nineteen);

                double perimeterNineteen = 2 * (xProjection + yProjection);
                double sNineteen = xProjection * yProjection;

                System.out.println("Begin_Номер 19 \n" + "Площадь " + sNineteen + " Периметр " + perimeterNineteen);
                System.out.printf("теперь форматированное %.2f  %.2f", sNineteen, perimeterNineteen);
                System.out.println("\n");

                //begin 20

                double x1Tventy = 168.8;
                double x2Tventy = 468.8;
                double y1Tventy = 668.8;
                double y2Tventy = 222.8;

                double lTventy = Math.pow(Math.pow(x2Tventy - x1Tventy, 2) + Math.pow(y2Tventy - y1Tventy, 2), 0.5);

                System.out.println("Begin_Номер 20 \n" + "Расстояние " + lTventy);
                System.out.printf("теперь форматированное %.2f ", lTventy);
                System.out.println("\n");


                //begin 21

                double x1TventyOne = 168.8;
                double x2TventyOne = 355.42;
                double x3TventyOne = 468.8;
                double y1TventyOne = 668.8;
                double y2TventyOne = 222.8;
                double y3TventyOne = 889.12;

                double side1TventyOne = Math.pow(Math.pow(x2TventyOne - x1TventyOne, 2) + Math.pow(y2TventyOne - y1TventyOne, 2), 0.5);
                double side2TventyOne = Math.pow(Math.pow(x3TventyOne - x2TventyOne, 2) + Math.pow(y3TventyOne - y2TventyOne, 2), 0.5);
                double side3TventyOne = Math.pow(Math.pow(x3TventyOne - x1TventyOne, 2) + Math.pow(y3TventyOne - y2TventyOne, 1), 0.5);
                double perimeterTventyOne = side1TventyOne + side2TventyOne + side3TventyOne;
                double sTventyOne = Math.pow(perimeterTventyOne * (perimeterTventyOne - side1TventyOne) * (perimeterTventyOne - side2TventyOne) * (perimeterTventyOne - side3TventyOne), 0.5);


                System.out.println("Begin_Номер 21 \n" + "Периметр " + perimeterTventyOne + " Площадь " + sTventyOne);
                System.out.printf("теперь форматированное %.2f  %.2f", perimeterTventyOne, sTventyOne);
                System.out.println("\n");


                //begin 22

                double aTventyTwo = 168.8;
                double bTventyTwo = 355.42;
                System.out.println("Begin_Номер 22 \n" + "A=" + aTventyTwo + " B=" + bTventyTwo);
                aTventyTwo = aTventyTwo + bTventyTwo - (bTventyTwo = aTventyTwo);
                System.out.println("ТЕПЕРЬ " + "A=" + aTventyTwo + " B=" + bTventyTwo);

                System.out.printf("теперь ФОРМАТИРОВАННОЕ  A=%.2f B=%.2f", aTventyTwo, bTventyTwo);
                System.out.println("\n");


                //begin 23

                double aTventyThree = 168.8;
                double bTventyThree = 456.8;
                double cTventyThree = 155.19;

                System.out.println("Begin_Номер 23 \n" + "A=" + aTventyThree + " B=" + bTventyThree + " C=" + cTventyThree);
                aTventyThree = aTventyThree + bTventyThree + cTventyThree - (cTventyThree = bTventyThree) - (bTventyThree = aTventyThree);
                System.out.println("Теперь " + "A=" + aTventyThree + " B=" + bTventyThree + " C=" + cTventyThree);
                System.out.printf("Теперь с форматированием A=%.2f  B=%.2f С=%.2f", aTventyThree, bTventyThree, cTventyThree);
                System.out.println("\n");


                //begin 24

                double aTventy4 = 168.8;
                double bTventy4 = 456.8;
                double cTventy4 = 155.19;

                System.out.println("Begin_Номер 24 \n" + "A=" + aTventy4 + " B=" + bTventy4 + " C=" + cTventy4);
                cTventy4 = aTventy4 + bTventy4 + cTventy4 - (aTventy4 = bTventy4) - (bTventy4 = cTventy4);
                System.out.println("Теперь " + "A=" + aTventy4 + " B=" + bTventy4 + " C=" + cTventy4);
                System.out.printf("Теперь с форматированием A=%.2f  B=%.2f С=%.2f", aTventy4, bTventy4, cTventy4);
                System.out.println("\n");


                //begin 25

                double xTventy5 = 168.8;
                double yTventy5 = 3 * Math.pow(xTventy5, 6) - 6 * Math.pow(xTventy5, 2) - 7;

                System.out.println("Begin_Номер 25 \n" + "Y=" + yTventy5);
                System.out.printf("Теперь с форматированием Y=%.2f", yTventy5);
                System.out.println("\n");

                //begin 26

                double xTventy6 = 168.8;
                double yTventy6 = 4 * Math.pow((xTventy6 - 3), 6) - 7 * Math.pow((xTventy6 - 3), 3) + 2;

                System.out.println("Begin_Номер 26 \n" + "Y=" + yTventy6);
                System.out.printf("Теперь с форматированием Y=%.2f", yTventy6);
                System.out.println("\n");


                //begin 27

                double xTventy7 = 2;

                System.out.println("Begin_Номер 27");

                int n27 = 2;
                double yTventy7;

                yTventy7 = Math.pow(xTventy7, n27);
                System.out.println("X^2=" + yTventy7);
                System.out.printf("Теперь с форматированием Y=%.2f", yTventy7);
                System.out.println("");

                n27 *= 2;
                yTventy7 = Math.pow(xTventy7, n27);
                System.out.println("X^4=" + yTventy7);
                System.out.printf("Теперь с форматированием Y=%.2f", yTventy7);
                System.out.println("");

                n27 *= 2;
                yTventy7 = Math.pow(xTventy7, n27);
                System.out.println("X^8=" + yTventy7);
                System.out.printf("Теперь с форматированием Y=%.2f", yTventy7);
                System.out.println("\n");

                //begin 28

                double a28 = 2;

                System.out.println("Begin_Номер 28");


                double y28;

                double y28in2 = a28 * a28;
                System.out.println("A^2=" + y28in2);
                System.out.printf("Теперь с форматированием Y=%.2f", y28in2);
                System.out.println("\n");

                double y28in3 = y28in2 * a28;
                System.out.println("A^3=" + y28in3);
                System.out.printf("Теперь с форматированием Y=%.2f", y28in3);
                System.out.println("\n");

                y28 = y28in2 * y28in3;
                System.out.println("A^5=" + y28);
                System.out.printf("Теперь с форматированием Y=%.2f", y28);
                System.out.println("\n");

                y28 = y28 * y28;
                System.out.println("A^10=" + y28);
                System.out.printf("Теперь с форматированием Y=%.2f", y28);
                System.out.println("\n");

                y28 = y28 * y28in2 * y28in3;
                System.out.println("A^15=" + y28);
                System.out.printf("Теперь с форматированием Y=%.2f", y28);
                System.out.println("\n");

                //begin 29

                double degree29 = 360;
                double radian29 = degree29 * 3.14 * 2 / 360;

                System.out.println("Begin_Номер 29 \n" + "В " + degree29 + " градусах " + radian29 + " радиан");
                System.out.printf("Теперь с форматированием Y=%.2f", radian29);
                System.out.println("\n");

                //begin 30

                double radian30 = 4.55;
                double degree30 = radian30 * 360 / 3.14 / 2;

                System.out.println("Begin_Номер 30 \n" + "В " + radian30 + " радиан " + degree30 + " градусов");
                System.out.printf("Теперь с форматированием Y=%.2f", degree30);
                System.out.println("\n");

                //begin 31

                double tFaren31 = 90.9;
                double tCels31 = (t_far - 32) * 5 / 9;

                System.out.println("Begin_Номер 31 \n" + "В " + tFaren31 + " по Фаренгейту " + tCels31 + " по Цельсию");
                System.out.printf("Теперь с форматированием Y=%.2f", tCels31);
                System.out.println("\n");


                //begin 34

                double mChokolat34 = 1.5;
                double mIris34 = 3.5;
                double tota1Cokolat34 = 56.2;
                double totaIris34 = 45.2;

                double priceChokolat34 = tota1Cokolat34 / mChokolat34;
                double priceIris34 = totaIris34 / mIris34;

                System.out.println("Begin_Номер 34 \n" + "Цена шоколада " + priceChokolat34 + " за кг. Ирисок " + priceIris34 + " за кг.");
                System.out.println("Шоколад дороже ирисок в " + priceChokolat34 / priceIris34 + " раз.");
                System.out.println("\n");

                //begin 35

                double vLake35 = 1.5;
                double uRiver35 = 0.5;
                double tLake35 = 56.0;
                double tRiver35 = 45.0;

                double lTotal35 = vLake35 * tLake35 + (vLake35 - uRiver35) * tRiver35;

                System.out.println("Begin_Номер 35 \n" + "Расстояние в пути " + lTotal35);
                System.out.println("\n");

                //begin 36

                double v1Car36 = 60;
                double v2Car36 = 45.5;
                double time36 = 6.0;
                double distanceStart36 = 25.5;
                double distanceFinal36 = distanceStart36 + (v1Car36 + v2Car36) * time36;

                System.out.println("Begin_Номер 36 \n" + "Финальное расстояние " + distanceFinal36);
                System.out.println("\n");

                //begin 37

                double v1Car37 = 60;
                double v2Car37 = 45.5;
                double time37 = 6.0;
                double distanceStart37 = 25.5;
                double distanceFinal37 = Math.abs(distanceStart36 - (v1Car36 + v2Car36) * time37);

                System.out.println("Begin_Номер 37 \n" + "Финальное расстояние " + distanceFinal37);
                System.out.println("\n");

                //begin 38

                double a38 = 60;
                double b38 = 45.5;
                double x38 = -1 * b38 / a38;

                System.out.println("Begin_Номер 38 \n" + "Х равен " + x38);
                System.out.println("\n");

                //begin 39

                double a39 = 60;
                double b39 = 45.5;
                double c39 = 48;
                double d39 = Math.pow(b39, 2) - 4 * a39 * c39;
                double x1begin39 = (-1 * b39 + Math.pow(d39, 0.5)) / 2 / a39;
                double x2begin39 = (-1 * b39 - Math.pow(d39, 0.5)) / 2 / a39;
                if (d39 < 0) {
                        System.out.println("Begin_Номер 39 \nДескриминант отрицательный, корней нет\n");
                } else if (x1begin39 <= x2begin39) {
                        System.out.println("Begin_Номер 39 \n" + "Корни равны " + x1begin39 + " " + x2begin39);
                        System.out.println("\n");

                } else {
                        System.out.println("Begin_Номер 39 \n" + "Корни равны " + x2begin39 + " " + x2begin39);
                        System.out.println("\n");
                }

                // begin 40

                double a1begin40 = 20;
                double a2begin40 = 30;
                double b1begin40 = 40;
                double b2begin40 = 50;
                double c1begin40 = 60;
                double c2begin40 = 70;

                double d40 = a1begin40 * b2begin40 - a2begin40 * b1begin40;
                double xbegin40 = (c1begin40 * b2begin40 - c2begin40 * b1begin40) / d40;
                double ybegin40 = (a1begin40 * c2begin40 - a2begin40 * c1begin40);

                System.out.println("Begin_Номер 40 \n" + "Корни равны " + xbegin40 + " и " + ybegin40);
                System.out.println("\n");

        //Integer 1
        int lSmInteger1 = 11125;
        //int metersInteger1 = (lSmInteger1 -lSmInteger1 % 100)/100;
        int metersInteger1 = Math.round(lSmInteger1/100);


        System.out.println("Integer номер 1\nколичество метров - " + metersInteger1);
                System.out.println("\n");

        //Integer 2
        int mKgInteger2 = 11125;
        //int mToneInteger2 = (lSmInteger1 -lSmInteger1 % 1000)/1000;
        int mToneInteger2 = Math.round(lSmInteger1/1000);

        System.out.println("Integer номер 2\nколичество тонн - " + mToneInteger2);
                System.out.println("\n");

        //Integer 3
        int nByteInteger3 = 26624;
        //int nKbyteToneInteger3 = (nByteInteger3 -nByteInteger3 % 1024)/1024;
        int nKbyteToneInteger3 = Math.round(nByteInteger3/1024);

        System.out.println("Integer номер 3\nколичество килобайт - " + nKbyteToneInteger3);
                System.out.println("\n");

        //Integer 4
        int aLenthInteger4 = 26624;
        int bLenthInteger4 = 34;
        //int nNumberOfBInteger4 = (aLenthInteger4 -aLenthInteger4 % bLenthInteger4)/bLenthInteger4;
        int nNumberOfBInteger4 = Math.round(aLenthInteger4/bLenthInteger4);
        System.out.println("Integer номер 4\nколичество отрезков В - " + nNumberOfBInteger4);
                System.out.println("\n");

                //Integer 5
        int aLenthInteger5 = 26624;
        int bLenthInteger5 = 34;
        int nLenthOfFreeInteger5 = aLenthInteger5 % bLenthInteger5;
        System.out.println("Integer номер 5\nсвободно от отрезков В - " + nLenthOfFreeInteger5);
                System.out.println("\n");

                //Integer 6
        int nInteger6 = 26;
        int nTensInteger6 =Math.round(nInteger6/10);
        int nOnesInteger6 = nInteger6 % 10;
        System.out.println("Integer номер 6\nдесятков - " + nTensInteger6+" единиц "+nOnesInteger6);
                System.out.println("\n");

                //Integer 7
        int nInteger7 = 26;
        int nTensInteger7 =Math.round(nInteger7/10);
        int nOnesInteger7 = nInteger7 % 10;
        System.out.println("Integer номер 7 \nсумма цифр - " + (nTensInteger7+nOnesInteger7)+" их произведение "+(nTensInteger7*nOnesInteger7));
                System.out.println("\n");

                //Integer 8
        int nInteger8 = 26;
        int nTensInteger8 =Math.round(nInteger8/10);
        int nOnesInteger8= nInteger8 % 10;
        int mInteger8=nOnesInteger8*10+nTensInteger8;
        System.out.println("Integer номер 8 \nчисло сначала - " + nInteger8 +" после переворота "+mInteger8);
                System.out.println("\n");


        //Integer 9
        int nInteger9 = 226;
        int nHandredsInteger9 =Math.round(nInteger9/100);
        System.out.println("Integer номер 9 \nколичество сотен - " +nHandredsInteger9 );
        System.out.println("\n");

        //Integer 10
        int nInteger10 = 326;
        int nTwoDigitInteger10=nInteger10-Math.round(nInteger10/100)*100;
        int nTensInteger10 =Math.round(nTwoDigitInteger10/10);
        int nOnesInteger10 = nInteger10 % 10;
        System.out.println("Integer номер 10 \nединицы - " + nOnesInteger10+" десятки "+ nTensInteger10);
        System.out.println("\n");

        //Integer 11
        int nInteger11 = 326;
        int nHundredsInteger11=Math.round(nInteger11/100);
        int nTensInteger11 =Math.round((nInteger11-Math.round(nInteger11/100)*100)/10);
        int nOnesInteger11 = nInteger11-nHundredsInteger11*100 - nTensInteger11*10;
        System.out.println("Integer номер 11 \nсумма чисел - " + (nOnesInteger11+nTensInteger11+nHundredsInteger11) +" произведение "+ (nOnesInteger11*nTensInteger11*nHundredsInteger11));
        System.out.println("\n");

        //Integer 12
        int nInteger12 = 326;
        int nHundredsInteger12=Math.round(nInteger12/100);
        int nTensInteger12 = Math.round((nInteger12-Math.round(nInteger12/100)*100)/10);
        int nOnesInteger12 = nInteger12-nHundredsInteger12*100 - nTensInteger12*10;
        System.out.println("Integer номер 12 \nчисло задом наперед - " + (nOnesInteger12*100+nTensInteger12*10+nHundredsInteger12));
        System.out.println("\n");

        //Integer 13
        int nInteger13 = 326;
        int nHundredsInteger13=Math.round(nInteger12/100);
        int nTwoDigitInteger13=nInteger13-Math.round(nInteger13/100)*100;
        System.out.println("Integer номер 13 \nпервую цифру переносим назад - " + (nTwoDigitInteger13*10+nHundredsInteger13));
        System.out.println("\n");

        //Integer 14
        int nInteger14 = 326;
        int nOnesInteger14=nInteger14%10;
        int nTwoDigitsFromleftInteger14=(nInteger14-nOnesInteger14)/10;
        System.out.println("Integer номер 14 \nпоследнюю цифру переносим вперед - " + (nOnesInteger14*100+nTwoDigitsFromleftInteger14));
        System.out.println("\n");

        //Integer 15
        int nInteger15 = 326;
        int nHundredsInteger15=Math.round(nInteger15/100);
        int nTensInteger15 = Math.round((nInteger15-Math.round(nInteger15/100)*100)/10);
        int nOnesInteger15 = nInteger15-nHundredsInteger15*100 - nTensInteger15*10;
        System.out.println("Integer номер 15 \nдесятки и сотни поменяем местами - " + (nTensInteger15*100+nHundredsInteger15*10+nOnesInteger15));
        System.out.println("\n");

        //Integer 16
        int nInteger16 = 326;
        int nHundredsInteger16=Math.round(nInteger16/100);
        int nTensInteger16 = Math.round((nInteger16-Math.round(nInteger16/100)*100)/10);
        int nOnesInteger16 = nInteger16-nHundredsInteger16*100 - nTensInteger16*10;
        System.out.println("Integer номер 16 \nдесятки и единицы поменяем местами - " + (nHundredsInteger16*100+nOnesInteger16*10+nTensInteger16));
        System.out.println("\n");

        //Integer 17
        int nInteger17 = 11326;
        int nHundredsInteger17=nInteger17%1000/100;
        System.out.println("Integer номер 17 \nРазряд сотен - " + nHundredsInteger17);
        System.out.println("\n");

        //Integer 18
        int nInteger18 = 11326;
        int nThousandInteger18=nInteger18%10000/1000;
        System.out.println("Integer номер 18 \nРазряд тысячи - " + nThousandInteger18);
        System.out.println("\n");

        //Integer 19
        int nSecondsInteger19 = 11326;
        int nMinutesInteger19=nSecondsInteger19/60;
        System.out.println("Integer номер 19 \nКоличество минут - " + nMinutesInteger19);
        System.out.println("\n");


        //Integer 20
        int nSecondsInteger20 = 11326;
        int nHoursInteger20=nSecondsInteger20/3600;
        System.out.println("Integer номер 20 \nКоличество полных часов - " + nHoursInteger20);
        System.out.println("\n");

        //Integer 21
        int nSecondsInteger21 = 11326;
        int nLastSecondsInteger21=nSecondsInteger21%60;
        System.out.println("Integer номер 21 \nКоличество секунд после последней минуты - " + nLastSecondsInteger21);
        System.out.println("\n");

        //Integer 22
        int nSecondsInteger22 = 11326;
        int nLastSecondsInteger22=nSecondsInteger22%3600+3600;
        System.out.println("Integer номер 22 \nКоличество секунд с начала последнего часа - " + nLastSecondsInteger22);
        System.out.println("\n");

        //Integer 23
        int nSecondsInteger23 = 11326;
        int nLastMinutesInteger23=(nSecondsInteger23%3600+3600)/60;
        System.out.println("Integer номер 22 \nКоличество минут с начала последнего часа - " + nLastMinutesInteger23);
        System.out.println("\n");

        //Integer 24
        int nDaysInteger24 = 8;
        int WeekDayInteger24=(nDaysInteger24+7)%7;
        System.out.println("Integer номер 24 \nДень недели номер - " + WeekDayInteger24);
        System.out.println("\n");

        //Integer 25
        int nDaysInteger25 = 11;
        int WeekDayInteger25=(nDaysInteger25+10)%7;
        System.out.println("Integer номер 25 \nДень недели номер - " + WeekDayInteger25);
        System.out.println("\n");
//ОБщее правило для дня недели: если совпадает 1 января с понедельником(и воскресенье/понедельник=0/1) то %7, если нет то +или - в нужную сторону

        //Integer 26
        int nDaysInteger26 = 13;
        int WeekDayInteger26=(nDaysInteger26+7)%7+1;
        System.out.println("Integer номер 26 \nДень недели номер - " + WeekDayInteger26);
        System.out.println("\n");
//Нужна защита от переполнения больше 7
        //Integer 27
        int nDaysInteger27 = 11;
        int WeekDayInteger27=((nDaysInteger27)%7+5)%7;
        System.out.println("Integer номер 27 \nДень недели номер - " + WeekDayInteger27);
        System.out.println("\n");

        //Integer 28
        int kDaysInteger28 = 11;
        int nINteger28=6;

        int WeekDayInteger28=((kDaysInteger28)%7+nINteger28-1)%7;
        System.out.println("Integer номер 28 \nДень недели номер - " + WeekDayInteger28);
        System.out.println("\n");

        //Integer 29
        int aInteger29 = 11;
        int bInteger29 = 33;
        int cInteger29 = 5;
        int numberOnBSideInteger29=Math.round(bInteger29/cInteger29);
        int numberOnASideInteger29=Math.round(aInteger29/cInteger29);
        int numberOfsquaresInteger29=numberOnASideInteger29*numberOnBSideInteger29;
        //int sEmptyInteger29 = aInteger29*bInteger29-numberOfsquaresInteger29*cInteger29*cInteger29;
        int sEmptyInteger29 = aInteger29*bInteger29-numberOfsquaresInteger29*(int)Math.pow(cInteger29,2);

        System.out.println("Integer номер 29 \nКоличество квадратов - " + numberOfsquaresInteger29);
        System.out.println("Свободная площадь - " + sEmptyInteger29);
        System.out.println("\n");

        //Integer 30
        int nYearInteger30 = 2201;
        int nCenturyInteger30 =(nYearInteger30-101)/100+2;

        System.out.println("Integer номер 30 \nНомер столетия - " + nCenturyInteger30);
        System.out.println("\n");




        }

}
















