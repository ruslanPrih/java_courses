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
        double r=3.;
        double L=2*r*Math.PI;
        double S1=Math.PI*Math.pow(r,2);

        System.out.println(r);
        System.out.println(L);
        System.out.println(S1);
//15


        double S2=3.;
        double PI=3.14;
        double D1=Math.pow(4*S2/PI,0.5);
        double L1=PI*D1;

        System.out.println(S2);
        System.out.println(L1);
        System.out.println(D1);

//20
double x1=2.;
double y1=5.5;
double x2=3.;
double y2=7.5;
double L2= Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println("Расстояние "+L2);


//26

double x_26=3.3;
double function=4*Math.pow(x_26-3,6)-7*Math.pow(x_26-3,3);
        System.out.println("Номер 26 "+x_26);
        System.out.println(function);

        //31
        double t_far=90;
        double t_cel;
        t_cel=(t_far-32)*5/9;
        System.out.println("Номер 31 "+t_far);
        System.out.println(t_cel);

        //33

        double m1=2;
        double m2=3.5;
        double tota1_price1=5.5;
        double tota1_price2;

                double price;
        price=tota1_price1/m1;
        tota1_price2=price*m2;
        System.out.println("Номер 33 ");
        System.out.println("Цены 1 кг "+price);
        System.out.println("Цены 3.5 кг "+tota1_price2);

       //integer17

        int i=11125;
        int hundreds=i%1000/100;
        System.out.println("INteger 17 разряд сотен - "+ hundreds);

        //integer19

        int seconds=11125;
        int minutes=i/60;
        System.out.println("INteger 19 количество минут - "+ minutes);
    }
}
