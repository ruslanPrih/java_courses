package com.prikhodko.Collection;

import java.util.Collections;

public class MultiThread {
    public static void main(String args[]) {

        Run runA=new Run("A");
        Thread threadA=new Thread(runA);
        //threadA.setDaemon(true);
        threadA.start();
        Run runB=new Run("B");
        Thread threadB=new Thread(runB);
        threadB.start();
        /*
        for (int i = 0; i < 100; i++) {
            System.out.println("UI" + "i= " + i);
        }
        */
    }
    static class Run implements Runnable {
        private String name;

        public Run(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("name" + name + " i=" + i);
            }
        }
    }

}
