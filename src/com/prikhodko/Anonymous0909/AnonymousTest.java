package com.prikhodko.Anonymous0909;



public class AnonymousTest {
    public static void main(String[] args) {
        Function function = new Function() {
           // private  String f;
            public  void doSomething(){
                System.out.println("Anonymous class");

            }

        };
        function.doSomething();
    }
}
