package com.prikhodko.InnerClass0909;

public class A {
    private static int count;
    private String name;

    public B createB() {
        return new B();
    }

    public class B {
        private String a;
        private A b;

        public void func() {
            A a =new A();
            name = "ddd";
            count = 6;
            System.out.println(name);

        }

    }

    public void func() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
