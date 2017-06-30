package com.prikhodko;

/**
 * Created by руслан on 24.06.2017.
 */
public class Classes2406 {
    public static void main(String[] args) {
/*
        //num8
        String s="Today was very interesting lesson. I enjoyed it very much. Of course, there are some gaps in my knowledge.";
        int [] sum= new int [128];
        for (int i=0;i< s.length(); i++){
            sum[s.charAt(i)]++;
        }
         int max=0;
        for (int i=1; i<128; i++){
            if (sum[i]>max){
                max=i;
            }
        }
        System.out.println("Symbol - "+(char)(max)+ "met "+ sum[max]+" times, its ASCII code - " + max);
*/
        //num8beta
        String s = "Today was very interesting lesson. I enjoyed it very much. Of course, there are some gaps in my knowledge.";
        int[][] sum = new int[128][2];
        for (int i = 0; i < s.length(); i++) {
            sum[s.charAt(i)][0]++;
        }
        for (int i = 0; i < 128; i++) {
            sum[i][1] = i;
        }

        //sorting
        for (int i = 127; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (sum[j][0] > sum[j + 1][0]) {
                    int tmp1 = sum[j][0];
                    int tmp2 = sum[j][1];
                    sum[j][0] = sum[j + 1][0];
                    sum[j][1] = sum[j + 1][1];
                    sum[j + 1][0] = tmp1;
                    sum[j + 1][1] = tmp2;
                }
            }
        }

        //вывод
        for (int i = 127; 0 <= i; i--) {
            if (sum[i][0] != 0) {
                System.out.println("Количество появлений к тексте - " + sum[i][0] + " для символа " + (char) (sum[i][1]) + " code- " + sum[i][1]);
            }
        }


    }
}
