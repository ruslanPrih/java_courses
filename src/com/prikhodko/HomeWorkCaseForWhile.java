package com.prikhodko;

import java.util.Scanner;

/**
 * Created by руслан on 08.06.2017.
 */
public class HomeWorkCaseForWhile {

    static public void main(String[] args) {

     /*
        //case05

        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        System.out.println("Enter N:1-4. We concider only the first symbol");
        String n = s.next();
        double y = 0;

        //int numb = Integer.valueOf(n.charAt(0));
        int numb = Character.digit(n.charAt(0),10);


        if (numb > 0 && numb < 5) {

            switch (numb) {
                case 1:
                    y = a + b;
                    break;
                case 2:
                    y = a - b;
                    break;
                case 3:
                    y = a * b;
                    break;
                case 4:
                    y = a / b;
                    break;
                //default:
                //System.out.println("One more time");

            }

            System.out.println("Result " + y);
        } else System.out.println("Wrong N. Please one more time!");


        //case06

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Units.Integer ");
        int u = s.nextInt();
        System.out.println("Enter the lenth");
        double l = s.nextDouble();
        double unit=0;
        if (u > 0 && u < 6) {

            switch (u) {
                case 1:
                    unit = u / 10;
                    break;
                case 2:
                    unit = u * 1000;
                    break;
                case 3:
                    unit = u;
                    break;
                case 4:
                    unit = u / 1000;
                    break;
                case 5:
                    unit = u / 100;

                    break;
                default:
                    System.out.println("One more time");

            }

            System.out.println("Result " + unit +" m");
        } else System.out.println("Wrong N. Please one more time!");

        //case08
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Day ");
        int d = s.nextInt();
        System.out.println("Enter Month");
        int m = s.nextInt();
        int newday=0;
        int newmonth;
        if (m == 1) {
            newmonth = 12;
        } else {
            newmonth = m - 1;
        }
        if (d != 1) {
            newday = d - 1;
        } else {
            switch (newmonth) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    newday=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    newday=30;
                    break;

                case 2:
                    newday=28;
                    break;
                default:
                    System.out.println("Tmth wrong!");
            }
        }

        System.out.println("New day "+newday+" New month "+newmonth);


        //case10
        Scanner s = new Scanner(System.in);
        System.out.println("Enter existing direction ");
        String d = s.next();
        System.out.println("Enter new order ");
        int o = s.nextInt();
        String newd="";
        switch (o){
            case 0: newd=d;
                break;
            case 1:
                switch (d){
                    case "С": newd="З";
                        break;
                    case "З": newd="Ю";
                        break;
                    case "Ю": newd="В";
                        break;
                    case "В": newd="С";
                        break;
                    default:
                        System.out.println("Smth wrong");}
                break;
            case -1:
                switch (d){
                    case "С": newd="В";
                        break;
                    case "З": newd="С";
                        break;
                    case "Ю": newd="З";
                        break;
                    case "В": newd="Ю";
                        break;
                    default:
                        System.out.println("Smth wrong");}
                break;
            default:System.out.println("Smth wrong");

        }
        System.out.println("New direction "+newd);


        //case11
        Scanner s = new Scanner(System.in);
        //existing direction
        String d = "С";
        System.out.println("Enter new order ");
        int o1 = s.nextInt();
        System.out.println("Enter new order ");
        int o2 = s.nextInt();
        String newd="";
        int o=o1+o2;
        switch (o){
            case 0:
            case 4:
                newd="С";
                break;
            case 1:
                newd="В";
                break;
            case -2:
            case 2:
                newd="Ю";
                break;
            case 3:
                newd="З";
                break;
            default:System.out.println("Smth wrong");

        }
        System.out.println("New direction "+newd);

        //case12
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mesurment numb");
        int n = s.nextInt();
        System.out.println("Enter a value ");
        double y = s.nextDouble();
        double r = 0;
        switch (n) {
            case 1:
                r = y;
                break;
            case 2:
                r=y/2;
                break;
            case 3:
                r=y/6.28;
                break;
            case 4:
                r=Math.sqrt(y/3.14);
                break;
            default:
                System.out.println("Smth wrong");
        }

        System.out.println("r= "+r+"\nd= "+(2*r)+"\nl= "+(3.28*r)+"\ns= "+3.14*Math.pow(r,2));


        //case15
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = s.nextInt();
        System.out.println("Enter a playing card suit ");
        int m = s.nextInt();
        String value="";
        String type="";
        if (n>=6&&n<=14){
            switch (n){
                case 14:value="туз"; break;
                case 13:value="король"; break;
                case 12:value="дама"; break;
                case 11:value="валет"; break;
                case 10:value="десятка"; break;
                case 9:value="девятка"; break;
                case 8:value="восьмерка"; break;
                case 7:value="семерка"; break;
                case 6:value="шестерка"; break;
                default:System.out.println("Smth wrong with a value!");
            }
        }else System.out.println("Smth wrong with a value!");
        if (m>=1&&m<=4){
            switch (m){
                case 4:type="червы"; break;
                case 3:type="бубны"; break;
                case 2:type="трефы"; break;
                case 1:type="пики"; break;
                default:System.out.println("Smth wrong with a value!");
            }
        }else System.out.println("Smth wrong with a type!");
        System.out.println("Ваша карта:\n" + " "+value+" "+type);


        //case16
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int n = s.nextInt();
        String year="";
        String [] ten= {"","","двадцать","тридцать","сорок","пятдесят","шестьдесят"};
        String [] one={"","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        int tens=0;
        int ones=0;
        if (n>=20&&n<=69){
            tens=n/10;
            ones=n%10;
            switch (ones){
                case 1:
                    year="год";
                    break;
                case 2:
                case 3:
                case 4:
                    year="года";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    year="лет";
                    break;
            }
        }else System.out.println("За гранью!");
        System.out.println("Ваш возраст:\n"+ten[tens]+" "+one[ones]+" "+year);


        //case17
        Scanner s = new Scanner(System.in);
        System.out.println("Enter task amount");
        int n = s.nextInt();
        String task = "";
        String[] ten = {"", "", "двадцать", "тридцать", "сорок"};
        String[] one = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        int tens = 0;
        int ones = 0;
        if (n >= 10 && n <= 40) {
            tens = n / 10;
            ones = n % 10;
            switch (ones) {
                case 1:
                    task = "учебное задание";
                    break;
                case 2:
                case 3:
                case 4:
                    task = "учебных задания";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    task = "учебных заданий";
                    break;
                default:
                    System.out.println("Smth wrong with a value!");
            }
        } else System.out.println("За гранью!");
        if (n >= 20 && n <= 40) {
            System.out.println("У нас:\n" + ten[tens] + " " + one[ones] + " " + task);
        } else {
            String[] afterten={"десять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
            System.out.println("У нас:\n" + afterten[n-10]+ " учебных заданий");
        }



        //case18
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        String[] hundred = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] ten = {"", "", "двадцать", "тридцать", "сорок","пятдесят","шестьдесят","семьдесят","восемьдесят","девяносто"};
        String[] one = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        String age="";
        if (n >= 100 && n <= 999) {
            hundreds = n / 100;
            tens = (n-hundreds*100)/ 10;
            ones = (n-hundreds*100-tens*10)% 10;
            if (tens==1) {
                String[] afterten = {"десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
                age=hundred[hundreds]+" "+afterten[ones];
            }else {
                age=hundred[hundreds]+" "+ten[tens]+" "+one[ones];
            }

        } else System.out.println("За гранью!");
        System.out.println("Число:\n"+ age);



        //case19
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year");
        int n = s.nextInt();
        String yearAnimal = "";
        String yearColor = "";
        int animal = (n + 8) % 12;
        int color = (n) % 10;
        switch (animal) {
            case 0:
                yearAnimal = "крысы";
                break;
            case 1:
                yearAnimal = "коровы";
                break;
            case 2:
                yearAnimal = "тигра";
                break;
            case 3:
                yearAnimal = "зайца";
                break;
            case 4:
                yearAnimal = "дракона";
                break;
            case 5:
                yearAnimal = "змеи";
                break;
            case 6:
                yearAnimal = "лошади";
                break;
            case 7:
                yearAnimal = "овцы";
                break;
            case 8:
                yearAnimal = "обезьяны";
                break;
            case 9:
                yearAnimal = "курицы";
                break;
            case 10:
                yearAnimal = "собаки";
                break;
            case 11:
                yearAnimal = "свиньи";
                break;
            default:
                System.out.println("Smth wrong with a value!");
        }


        switch (color) {
            case 0:
            case 1:
                if (animal==2||animal==3||animal==4) yearColor = "белого";
                else yearColor = "белой";
                break;
            case 2:
            case 3:
                if (animal==2||animal==3||animal==4) yearColor ="черного";
                else yearColor = "черной";
                break;
            case 4:
            case 5:
                if (animal==2||animal==3||animal==4) yearColor ="зеленого";
                else yearColor = "зеленой";
                break;
            case 6:
            case 7:
                if (animal==2||animal==3||animal==4) yearColor ="красного";
                else yearColor = "красной";
                break;
            case 8:
            case 9:
                if (animal==2||animal==3||animal==4) yearColor ="желтого";
                else yearColor = "желтой";
                break;
            default:
                System.out.println("Smth wrong with a value!");
        }

        System.out.println(n + " -это год " + yearColor + " " + yearAnimal);


        //case20
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month");
        int m = s.nextInt();
        System.out.println("Enter the day");
        int d = s.nextInt();
        String zodiak="";
        switch (m){
            case 1: if (d>19) zodiak="Bодолей";
            else zodiak="Козерог";
                break;
            case 2: if (d>18) zodiak="Рыбы";
            else zodiak="Bодолей";
                break;
            case 3: if (d>20) zodiak="Овен";
            else zodiak="Рыбы";
                break;
            case 4: if (d>19) zodiak="Телец";
            else zodiak="Овен";
                break;
            case 5: if (d>20) zodiak="Близнецы";
            else zodiak="Телец";
                break;
            case 6: if (d>21) zodiak="Рак";
            else zodiak="Близнецы";
                break;
            case 7: if (d>22) zodiak="Лев";
            else zodiak="Рак";
                break;
            case 8: if (d>22) zodiak="Дева";
            else zodiak="Лев";
                break;
            case 9: if (d>22) zodiak="Весы";
            else zodiak="Дева";
                break;
            case 10: if (d>22) zodiak="Скорпион";
            else zodiak="Весы";
                break;
            case 11: if (d>22) zodiak="Стрелец";
            else zodiak="Скорпион";
                break;
            case 12: if (d>21) zodiak="Козерог";
            else zodiak="Стрелец";
                break;
            default:
                System.out.println("Smth wrong with a value!");
        }
        System.out.println("Ваш знак зодиака - "+zodiak);



        //for02
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        //количество чисел
        int n=0;
        for (int i=a; i<=b; i++){
            System.out.println(i);
            n++;
        }
        System.out.println("Количество чисел = "+n);


        //for04
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a price per kilo");
        int a = s.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(i*a);
        }

        //for05
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a price per kilo");
        int a = s.nextInt();

        for (double i=0.1; i<=1; i=i+0.1){
            System.out.println(i*a);
        }


        //for07
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        int y=0;
        for (int i=a; i<=b; i++){
            y=y+i;
        }
        System.out.println(y);



        //for08
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        int y=1;
        for (int i=a; i<=b; i++){
            y=y*i;
        }
        System.out.println(y);

        //for09
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        double y=0;
        for (int i=a; i<=b; i++){
            y=y+Math.pow(i,2);
        }
        System.out.println(y);

        //for12
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y=1.0;
        for (int i=1;i<=n; i++){
            y*=1+i*0.1;

        }
        System.out.println(y);


        //for13
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y=0;
        for (int i=1;i<=n; i++){
            y+=Math.pow(-1,i+1)*(1+i*0.1);
        }
        System.out.println(y);


        //for14
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y=0;
        for (int i=1;i<2*n; i=i+2){
            y+=i;
            System.out.println(i);
            System.out.println(y);
            System.out.println();
        }
        System.out.println(y);


        //for15
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter A");
        int a = s.nextInt();
        double y=1;
        for (int i=1;i<=n; i++){
            y*=a;
            System.out.println(i);
            System.out.println(y);
            System.out.println();
        }
        System.out.println(y);


        //for16
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter A");
        int a = s.nextInt();
        double y=1;
        for (int i=1;i<=n; i++){
            y=Math.pow(a,i);
            System.out.println(i);
            System.out.println(y);
            System.out.println();
        }


        //for19
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 1;
        for (int i = 1; i <= n; i++) {
            y *=i;
        }
        System.out.println(y);


        //for20
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 1;
        double b = 0;
        for (int i = 1; i <= n; i++) {
            y *= i;
            b += y;

            System.out.println(i);
            System.out.println(y);
            System.out.println(b);
        }
        System.out.println("Totally "+b);


        //for21
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 1;
        double b = 1;
        for (int i = 1; i <= n; i++) {
            y *= i;
            b += 1/y;

            System.out.println(i);
            System.out.println(y);
            System.out.println(b);
        }
        System.out.println("Totally "+b);


        //for22
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter X");
        double x = s.nextDouble();
        double y = 1;
        double b = 1;
        for (int i = 1; i <= n; i++) {
            y *= i;
            b += Math.pow(x,i)/y;

            System.out.println(i);
            System.out.println(y);
            System.out.println(b);
        }
        System.out.println("Totally "+b);



        //for23
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter X");
        double x = s.nextDouble();
        double y = 1;
        double b = x;
        for (int i = 1; i <= 2 * n + 1; i++) {
            y *= i;
            if (i % 2 != 0 && i != 1) {
                b += Math.pow(-1, ((i + 3) / 2)) * Math.pow(x, i) / y;
            }
        }
        System.out.println("Totally " + b);


        //for24
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter X");
        double x = s.nextDouble();
        double y = 1;
        double b = 1;
        int minus=1;
        for (int i = 1; i <= 2 * n; i++) {
            y *= i;
            if (i % 2 == 0) {
            minus*=-1;
                b += minus * Math.pow(x, i) / y;
            }
        }
        System.out.println("Totally " + b);


        //for25
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter X");
        double x = s.nextDouble();
        double b = 0;
        int minus=-1;
        for (int i = 1; i <= n; i++) {
            minus*=-1;
            b += minus * Math.pow(x, i) / i;
        }
        System.out.println("Totally: " + b);


        //for26
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter X");
        double x = s.nextDouble();
        double b = 0;
        int minus=-1;
        for (int i = 1; i <=2*n+1; i=i+2) {
            minus*=-1;
            b += minus * Math.pow(x, i) / i;
        }
        System.out.println("Totally: " + b);

        //for29
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        double h = Math.abs(b - a) / n;
        System.out.println("Lenth: " + h);
        System.out.println("Point 0: " + a);
        for (int i = 1; i <= n; i++) {
            a = a + h;
            System.out.println("Point "+i+": " + a);
        }

        //for30
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        double h = Math.abs(b - a) / n;
        System.out.println("Lenth: " + h);
        for (int i = 1; i <= n+1; i++) {
            System.out.println("F " + a + ": " + (1-Math.sin(a)));
            a = a + h;
        }

        //for31
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double a=2;
        for (int i = 1; i <= n; i++) {
            a=2+1/a;
            System.out.println("A" + i + ": " + a);
        }

        //for33
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int fib;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i<=n; i++) {
            fib=a+b;
            a=b;
            b=fib;
            System.out.println(b);
        }


        //for36
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter K");
        double k = s.nextDouble();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double each = 1;
            for (int j=1;j<=k;j++){
                each*=i;
            }
            sum = sum + each;
            System.out.println(each);
        }
        System.out.println("sum= "+ sum);


        //for37
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double each = 1;
            for (int j=1;j<=i;j++){
                each*=i;
            }
            sum = sum + each;
            System.out.println(each);
        }
        System.out.println("sum= "+ sum);


        //for38
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double each = 1;
            for (int j=n-i+1;j>=1;j--){
                each*=i;
            }
            sum = sum + each;
            System.out.println(each);
        }
        System.out.println("sum= "+ sum);

        //for39
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            for (int j=1;j<=i;j++){
                System.out.println(i);
            }
        }

        //for39
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        int a = s.nextInt();
        System.out.println("Enter B");
        int b = s.nextInt();
        int n=0;
        for (int i = a; i <= b; i++) {
            n++;
            for (int j=1;j<=n;j++){
                System.out.println(i);
            }
        }


        //while02
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        int n = 0;
        while (a > b) {
            a = a - b;
            n++;
        }
        System.out.println(n);


        //while03
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        System.out.println("Enter K");
        double k = s.nextDouble();
        int i = 0;
        while (n > k) {
            n = n - k;
            i++;
        }
        System.out.println("Частное "+i);
        System.out.println("Остаток "+n);

        //while04
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        boolean rez = false;
        while (n >= 3) {
            n = n - 3;
        }
        if (n == 0) rez = true;
        else rez = false;
        System.out.println(rez);


        //while05
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        int i = 0;
        while (n >= 2) {
            n = n / 2;
            i++;
        }
        System.out.println("Степень "+i);
    }


        //while06
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        double fakt = 1;
        int limit = 0;
        if (n % 2 == 0) limit = 2;
        else limit = 1;
        while (n >= limit) {
            fakt = fakt * n;
            n=n-2;
        }
        System.out.println("Двойной факториал " + fakt);


        //while07
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        double sqvr = 1;
        int k = 0;
        while (n >= sqvr) {
            k++;
            sqvr=k*k;
        }
        System.out.println("Число " + k);


        //while08
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        double n = s.nextDouble();
        double sqvr = 1;
        int k = 0;
        while (n >=sqvr) {
            k++;
            sqvr=k*k;
            System.out.println(k);
        }
        System.out.println("Число " + (k-1));


        //while09
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 0;
        int k = 0;
        while (n >y) {
            k++;
            y=Math.pow(3,k);
            System.out.println(k);
        }
        System.out.println("Число " + (k));

        //while10
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 0;
        int k = 0;
        while (n >y) {
            k++;
            y=Math.pow(3,k);
            System.out.println(k);
        }
        System.out.println("Число " + (k-1));

        //while11
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 0;
        int k = 0;
        while (n >=y) {
            k++;
            y+=k;
            System.out.println(k);
        }
        System.out.println("Число " + k);
        System.out.println("Сумма " + y);



        //while12
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        double y = 0;
        int k = 0;
        while (n >=y) {
            k++;
            y+=k;
            System.out.println(k);
        }
        System.out.println("Число " + (k-1));
        System.out.println("Сумма " + (y-k));


        //while15

        double dep = 1000;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter P");
        int p = s.nextInt();
        int month = 0;
        double plus=0;
        while (dep<=1100) {
            month++;
            plus=dep*p*.01;
            dep=dep+plus;
            System.out.println(dep);
        }
        System.out.println("Месяц " + month);


        //while17
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int dig=1;
        while (n >0) {
            dig=n%10;
            n=n/10;
            System.out.println(dig);
        }



        //while18
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int dig=1;
        int i=0;
        int sum=0;
        while (n >0) {
            dig=n%10;
            n=n/10;
            System.out.println(dig);
            i++;
            sum=sum+dig;
        }
        System.out.println(i+" digits, with sum: "+sum);



        //while19
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int dig = 1;
        String newN = "";
        while (n > 0) {
            dig = n % 10;
            n = n / 10;
            System.out.println(dig);
            newN=newN+dig;
        }
        System.out.println(" New N " + newN);


        //while20
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int dig = 1;
        boolean two =false;
        while (n > 0) {
            dig = n % 10;
            n = n / 10;
            if (dig==2){two=true;
                System.out.println(" Is there two?: " + two);
            }
            else two=false;



        //while22
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int dig = 2;
        boolean rez = true;
        while ((dig < n) &&((rez!=false))) {

            if ((n % dig) == 0) {
                rez = false;
            }
            dig++;
        }
        System.out.println(rez);
*/

        //while30
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A");
        double a = s.nextDouble();
        System.out.println("Enter B");
        double b = s.nextDouble();
        System.out.println("Enter C");
        double c = s.nextDouble();
        int nb=0;
        int na=0;

        while (na<=a){
         a=a-c;
         na++;
        }
        while (nb<=b){
         b=b-c;
         nb++;
        }
        System.out.println("Amount= "+(na*nb));






    }

}
