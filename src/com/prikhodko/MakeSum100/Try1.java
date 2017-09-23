package com.prikhodko.MakeSum100;

public class Try1 {
    public static void main(String[] args) throws NumberFormatException {

        String[] action=new String[8];
        int randLenth;
        int[] s1 = new int[9];
        int sum ;
        int i;

        do {
            String numb = "123456789";
            i = 0;
            for (int k = 0; k < 9; k++) {
                s1[k] = 0;
            }
            while (numb.length() > 0) {
                if (numb.length() == 1) randLenth = 1;
                else randLenth = (int) (Math.random() * 2) + 1;
                s1[i] = Integer.valueOf(numb.substring(0, randLenth));
                numb = numb.substring(randLenth);
                i++;
            }
            sum = s1[0];
            for (int j = 1; j < i; j++) {
                switch ((int) (Math.random() * 2) + 1) {
                    case 1:
                        sum += s1[j];
                        action[j-1] = "+";
                        break;
                    case 2:
                        sum -= s1[j];
                        action[j-1] = "-";
                        break;
                    default:
                        System.out.println("Smth wrong");
                }
            }
            System.out.println(sum);
        } while (sum != 100);
        System.out.println("At last!!!");
        for (int j = 0; j < i-1; j++) {
            System.out.print(s1[j]);
            System.out.print(action[j]);
        }
        System.out.print(s1[i-1]);
        System.out.println();
        System.out.println(sum);
    }
}
