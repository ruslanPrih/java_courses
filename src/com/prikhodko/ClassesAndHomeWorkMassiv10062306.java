package com.prikhodko;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by руслан on 10.06.2017.
 */
public class ClassesAndHomeWorkMassiv10062306 {
    public static void main(String[] args) {

      /*

        //public static void bubbleSort(int[] arr) {
//*Внешний цикл каждый раз сокращает фрагмент массива,
        //так как внутренний цикл каждый раз ставит в конец
        //фрагмента максимальный элемент

        int[] arr = new int[]{1, 5, 9, 8, 9};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }




//вывод массива
        int[] arr = new int[10];
        int j = 0;
        for (int i = 1; i <= 20; i = i + 2) {
            arr[j] = i;
            j++;
        }
        System.out.print(arr[0]);
        for (int i = 1; i < 10; i++) {

            System.out.print(", " + arr[i]);
        }
        System.out.println();

        for (int n:arr){
            System.out.print(", " + n);

        }



        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int j=0;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + ", ");
                j++;
            }
        }
        System.out.println("Number of them- "+j);

        //array11
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = i;
        }
        System.out.println("Enter K");
        int k = s.nextInt();
        for (int i = k; i < n; i += k) {
            System.out.println("Элемент №"+i+"="+arr[i]);

        }



        //array14
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = i;
        }

        for (int i =0 ; i <=arr.length-1; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i] + ", ");
            }
        }
        for (int i =0 ; i <=arr.length-1; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i] + ", ");
            }
        }
*/
/*
        //arrays16
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        char alph[] = new char[n];
        for (int i = 0; i <= alph.length - 1; i++) {
            //не работает
            //alph[i] = Character.forDigit(i+48, 10);
            alph[i] = (char) (i + 65);
        }
        int j = alph.length - 1;
        for (int i = 0; i <= alph.length - 1; i++) {
            System.out.println("N: " + i + " - " + alph[i]);
            System.out.println("N: " + j + " - " + alph[j]);
            j--;

        }
*/
/*
        //arrays17
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        char alph[] = new char[n];
        for (int i = 0; i <= alph.length - 1; i++) {
            //не работает
            //alph[i] = Character.forDigit(i+48, 10);
            alph[i] = (char) (i + 65);
        }
        int j = alph.length - 1;
        for (int i = 0; i <= alph.length - 1; i += 2) {
            System.out.println("N: " + i + " - " + alph[i]);
            System.out.println("N: " + (i + 1) + " - " + alph[i + 1]);
            System.out.println("N: " + j + " - " + alph[j]);
            System.out.println("N: " + (j-1) + " - " + alph[j-1]);
            j-=2;
        }
*/
/*
        //arrays18
        Scanner s = new Scanner(System.in);
        System.out.println("Enter K");
        int k = s.nextInt();
        int arr[] = new int[]{99, 3, 5, 8, 9, 11, 19, 100, 155, 88};
        int alarm = 0;
        int i = 0;
        while (i <= k - 1 && alarm == 0) {
            if (arr[i] < arr[arr.length - 1]) {
                alarm = 1;
                System.out.println(arr[i]);
            }
            i++;
        }
        if (alarm==0)System.out.println("0");
*/
  /*      //arrays19
        Scanner s = new Scanner(System.in);
        System.out.println("Enter K");
        int k = s.nextInt();
        int arr[] = new int[]{1, 3, 5, 8, 101, 11, 19, 100, 155, 88};
        int alarm = 0;
        int i = 0;
        while (i <= k - 1 ) {
            if ( arr[0] <arr[i] && arr[i] < arr[arr.length - 1]) {
                alarm = arr[i];
            }
            i++;
        }

        if (alarm==0){System.out.println("0");}
        else System.out.println(alarm);;
*/

  /*
        //arrays20
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter K");
        int k = s.nextInt();
        System.out.println("Enter L");
        int l = s.nextInt();
        double arr[] = new double[n];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=n*Math.random();
            System.out.println(arr[i]);
        }
        double sum=0;
        for (int i=k-1; i<=l-1; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum= "+sum);
*/
 /*
        //arrays22

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter K");
        int k = s.nextInt();
        System.out.println("Enter L");
        int l = s.nextInt();
        double arr[] = new double[n];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=n*Math.random();
            System.out.println(arr[i]);
        }
        double sum=0;
        for (int i=0; i<=arr.length-1; i++){
            sum=sum+arr[i];
            if (i>=k-1 && i<=l-1){
                sum=sum-arr[i];
            }
        }
        System.out.println("sum= "+sum);
*/
/*
        //arrays24

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива
        double arr[] = new double[n];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=n*Math.random();
            System.out.println(arr[i]);
        }
        double d=0;
        double dPrev=0;
        boolean marker=true;
                //анализ на матеметическую прогрессию
        for (int i=1; i<=arr.length-2; i++){
            dPrev=(arr[i]-arr[i-1])/i;
            d=(arr[i+1]-arr[i])/i+1;

            if (d!=dPrev){
                marker=false;
            }
            dPrev=d;
        }
        System.out.println(marker);
   */

/*
        //arrays26

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) (n * Math.random());
            System.out.println(arr[i]);
        }
        int marker1 = 0;
        int marker2 = 0;

        int i = 0;
        do {


            if (arr[i] % 2 == 0) {
                marker1 = 0;
            } else marker1 = 1;
            if (arr[i + 1] % 2 == 0) {
                marker2 = 0;
            } else marker2 = 1;
            i++;

        } while (i <= arr.length - 1 && marker1 != marker2);
        if (i==n) System.out.println("0");
        else System.out.println("   "+i);
*/
/*
        //arrays27

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);

            //если ноль - еще раз заполнение
            if (arr[i] == 0) {
                arr[i] = (int) ((n + 1) * Math.random() - n / 5);
            }
            System.out.println(arr[i]);
        }
        int marker1 = 0;
        int marker2 = 0;

        int i = 0;
        do {


            if (arr[i] < 0) {
                marker1 = 0;
            } else marker1 = 1;
            if (arr[i + 1] < 0) {
                marker2 = 0;
            } else marker2 = 1;
            i++;

        } while (i <= arr.length - 1 && marker1 != marker2);
        if (i == n) System.out.println("0");
        else System.out.println("ошибка в № " + i);
*/
/*
        //arrays28

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);

            //если ноль - еще раз заполнение
            if (arr[i] == 0) {
                arr[i] = (int) ((n + 1) * Math.random() - n / 5);
            }
            System.out.println("N "+i+"= "+arr[i]);
        }
        int min = 0;
        int i = 2;
        do {
            if (arr[i]<arr[i+2]){
               min=arr[i];

            }else min=arr[i+2];
            i+=2;
        } while (i <= arr.length -3);

        System.out.println("minimum - "+min);
*/
/*
        //arrays30

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        int arrLeft[] = new int[n / 2 + 1];
        int k = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);

            //если ноль - еще раз заполнение
            if (arr[i] == 0) {
                arr[i] = (int) ((n + 1) * Math.random() - n / 5);
            }
            System.out.println("N " + i + "= " + arr[i]);
            }
        //проверка левый больше правого и занесение в новый массив
            for (int i=0;i<=arr.length-2;i++){
                if (arr[i] > arr[i + 1]) {
                    arrLeft[k] = arr[i];
                    k++;
            }

        }
        //сортировка нового массива по возрастанию
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (arrLeft[j] > arrLeft[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //вывод нового массива
        for (int i=0;i<=k;i++){
            System.out.println(arrLeft[i]);
        }
*/
/*
        //arrays31

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        int arrLeft[] = new int[n / 2 + 1];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);

            //если ноль - еще раз заполнение
            if (arr[i] == 0) {
                arr[i] = (int) ((n + 1) * Math.random() - n / 5);
            }
            System.out.println("N " + i + "= " + arr[i]);
        }
        //проверка правый больше левого и занесение в новый массив
        int k = -1;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                k++;
                arrLeft[k] = arr[i + 1];
            }
        }

        //Создаем уменьшенный массив
        Integer arrLeftNew[] = new Integer[k + 1];
        for (int i = 0; i <= k; i++) {
            arrLeftNew[i] = arrLeft[i];
        }
        //сортировка нового массива по убыванию
        Arrays.sort(arrLeftNew, Collections.reverseOrder());
        /*
        int temp;
        for (int i = 0; i <= k; i++) {
            for (int j = i + 1; j <= k; j++) {
                if (arrLeft[i] < arrLeft[j]) {
                    temp = arrLeft[i];
                    arrLeft[i] = arrLeft[j];
                    arrLeft[j] = temp;
                }
            }
        }
        */
        //вывод нового массива
        /*
        //METHOD1
        for (int i = 0; i <= k; i++) {
            System.out.println(arrLeftNew[i]);
        }
        */
        //METHOD 2
        /*
        for (int i:arrLeftNew ) {
            System.out.println(i);
        }
        */
        /*
        //METHOD 3
        //System.out.println("Array is: " + Arrays.toString( arrLeftNew ) );
        System.out.println(Arrays.asList(arrLeftNew));
*/

/*
        //arrays32

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        //нахождение первого локального минимума
        int min = arr.length;
        for (int i = 1; i <= arr.length - 2 && min == arr.length; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                min=i;
            }
        }
        System.out.println("The first Local minimum = " + arr[min]);
*/
/*
        //arrays34

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        //нахождение  локального минимума и занесение в массив
        int localMin[]=new int[arr.length/2+1];
        int j=0;
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
               localMin[j]=arr[i];
                System.out.println("min " +localMin[j]);
               j++;
            }
        }
        //нахождение максимального локального минимума
        int max=localMin[0];
        for (int i=1; i<=j-1; i++){
            if (localMin[i]>max){
                max=localMin[j];
            }
        }
        System.out.println("The Maximal Local minimum = " + max);
*/
/*
        //arrays40

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter R");
        int r = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        //нахождение  приближения к R и занесение в массив
        int toR[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            toR[i] = Math.abs(arr[i] - r);
        }
        System.out.println(Arrays.toString(toR));

        //нахождение  минимума
        int min = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (toR[i] < toR[min]) {
                min = i;
            }
        }
        System.out.println("The minimum toR = " + arr[min] + " with num " + min);
*/
/*
        //arrays45

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        //нахождение  двух ближних чисел

        int min = Math.abs(arr[1] - arr[0]);
        int index = 0;
        for (int i = 2; i <= arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) < min) {
                index = i;
                min = Math.abs(arr[i] - arr[i - 1]);
            }
        }
        if (arr[index] < arr[index - 1]) {
            System.out.println("The nearest: "+ arr[index] + " " + arr[index - 1]);
        } else System.out.println("The nearest: "+ arr[index - 1] + " " + arr[index]);
*/
/*
        //arrays47 .

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }
        //сортировка  массива по возрастанию
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        //вывод массива
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("newN " + i + "= " + arr[i]);
        }
        //нахождение  разных чисел
        int k = 1;
        for (int i = 1; i <= arr.length - 1; i++) {
            k++;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    k--;
                    break;
                }
            }
        }
        System.out.println("There are " + k + " not equal elements");
*/


/*
        //нахождение  одинаковых чисел АЛГОРИТМ
        int k = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j =  i+1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                }
                          }
        }
        System.out.println("There are " + (arr.length - k) + " not equal elements");

*/
/*
        //arrays48

        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            System.out.println("N " + i + "= " + arr[i]);
        }

        //сортировка  массива по возрастанию
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        //вывод массива
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("newN " + i + "= " + arr[i]);
        }
        //нахождение  одинаковых  чисел
        int k;
        int kMax=0;
        for (int i = 0; i <= arr.length - 1; i++) {
            k=1;
            for (int j = i+1; j <= arr.length - 1; j++) {
                if (arr[i]==arr[j]){
                    k++;
                }
            }
            if(k>kMax)kMax=k;
        }
        System.out.println("There are"+kMax+" equal elements");
*/
/*
        //arrays49
        //заполнение массива случайными числами
        int arr[] = new int[]{1, 3, 6, 4, 10, 2, 9, 7, 8, 5};

        //проверка перестановки

        //сумма элементов массива - есть ли пропущенные???? не выполняем
        int index = 0;
        boolean check = true;
        int sum = 0;
        //проверка на соответствие диапазону
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] <= 0 || arr.length < arr[i]) {
                index = i;
                check = false;
                break;
            }
            sum = sum + arr[i];
        }
        //сумма элементов массива - есть ли пропущенные
        if (sum != arr.length * (arr.length + 1) / 2) {
            check = false;
            System.out.println("Smth is missed");
        }

        //соседние равные или нет
        if (check == true) {
            for (int i = 0; i <= arr.length - 2; i++) {
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[i] == arr[j]) {
                        index = j;
                        check = false;
                        break;
                    }
                }
            }
        }
        if (check == true) {
            System.out.println("0");
        } else {
            System.out.println("Wrong on " + index);
        }

*/
/*
        //arrays50

        int arr[] = new int[]{1, 2, 4, 3, 6, 9, 8, 7, 10, 5};
        int num = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i+1]) {
                num++;
            }
        }
        System.out.println("There are invertions- " + num);
*/
/*

        //arrays51
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        int arrA[] = new int[n];
        int arrB[] = new int[n];
        //заполнение массива случайными числами

        for (int i = 0; i <= arrA.length - 1; i++) {
            arrA[i] = (int) ((n + 1) * Math.random() - n / 2);
        }
        for (int i = 0; i <= arrB.length - 1; i++) {
            arrB[i] = (int) (100 * Math.random() - 50);
        }
        for (int i = 0; i <= arrA.length - 1; i++) {
            arrA[i] = arrA[i] + arrB[i] - (arrB[i] = arrA[i]);
            System.out.println("A" + i + "=" + arrA[i] + "    " + "B" + i + "=" + arrB[i]);
        }
*/


/*
        //arrays74
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();

        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
            //System.out.println("N " + i + "= " + arr[i]);
        }
        System.out.println("Array: "+Arrays.toString(arr));
        //нахождение минимального и максимального элементов
        int min = arr[0];
        int iMin = 0;
        int max = arr[arr.length - 1];
        int iMax = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                iMax = i;
            }
        }
        //заполняем нулями ячейки между максимумом и минимумом
        int nullstart = Math.min(iMax, iMin) + 1;
        int nullfinish = Math.max(iMax, iMin) - 1;
        for (int i = nullstart; i <= nullfinish; i++) {
            arr[i] = 0;
        }
        //вывод нового массива
        System.out.println("New Array: " + Arrays.toString(arr));
*/
/*
        //arrays80
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        //заполнение массива случайными числами
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) ((n + 1) * Math.random() - n / 2);
        }
        System.out.println("Array: "+Arrays.toString(arr));
        //смещение ячеек на 1 влево
        for (int i=0; i<arr.length-1;i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println("Array: "+Arrays.toString(arr));
*/
/*
        //matrix24
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N");
        int n = s.nextInt();
        System.out.println("Enter M");
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        //заполнение массива случайными числами
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                arr[i][j] = (int) ((n + 1) * Math.random() - n / 2);
            }
        }
        //вывод массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        //нахождением максимального ичсла в столбце
        int[]max=new int[m];
        for (int i = 0; i < m; i++) {
            max[i]=arr[0][i];
            for (int j = 1; j < n; j++) {
                if(arr[j][i]>max[i]){
                    max[i]=arr[j][i];
                }
            }
        }
        //вывод массива максимальных значений столбцов
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(max));
*/

/*
        //matrix50
        Scanner s = new Scanner(System.in);
        System.out.println("Enter M");
        int m = s.nextInt();
        System.out.println("Enter N");
        int n = s.nextInt();
        int arr[][] = new int[m][n];
        //заполнение массива случайными числами
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                arr[i][j] = (int) ((n + 1) * Math.random() - n / 2);
            }
        }
        //вывод массива
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        //нахождением максимального и минимального числа в столбце
        int[]max=new int[n];
        int[]min=new int[n];

        for (int i = 0; i < n; i++) {
            max[i]=arr[0][i];
            min[i]=arr[m-1][i];

            for (int j = 1; j < m; j++) {
                if(arr[j][i]>max[i]){
                    max[i]=arr[j][i];
                }
                if(arr[j][i]<min[i]){
                    min[i]=arr[j][i];
                }
            }
        }
        //вывод массива максимальных значений столбцов
        System.out.println();
        System.out.println();
        System.out.println("Max: "+Arrays.toString(max));
        System.out.println("Min: "+Arrays.toString(min));
        //Замена местами и вывод
        int temp;
        for (int i=0;i<n;i++){
            temp=max[i];
            max[i]=min[i];
            min[i]=temp;
        }
        System.out.println("После замены местами");
        System.out.println("Max: "+Arrays.toString(max));
        System.out.println("Min: "+Arrays.toString(min));
*/

/*
        //matrix80
        Scanner s = new Scanner(System.in);
        System.out.println("Enter M");
        int m = s.nextInt();
        int[][] arr = new int[m][m];
        //заполнение массива случайными числами
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                arr[i][j] = (int)((2*m + 1) * Math.random() - m);
            }
        }
        //вывод массива
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        ///нахождение суммы диагонали
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println("Diagonal Sum = "+sum);
*/

/*
        //matrix90
        Scanner s = new Scanner(System.in);
        System.out.println("Enter M");
        int m = s.nextInt();
        int[][] arr = new int[m][m];
        //заполнение массива случайными числами
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                arr[i][j] = (int)(11 * Math.random() - 5);
            }
        }
        //вывод массива
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        //нахождение суммы побочной диагонали
        int sum = 0;
        for (int i = m-1; i >= 0; i--) {
            sum = sum + arr[m-i-1][i];
        }
        System.out.println("Extra Diagonal Sum = "+sum);
        //нахождение суммы ниже побочной диагонали
        sum = 0;
        for (int i = m-1; i >= 1; i--) {
            sum = sum + arr[m-i][i];
        }
        System.out.println("Below Extra Diagonal Sum = "+sum);
*/


    }
}

