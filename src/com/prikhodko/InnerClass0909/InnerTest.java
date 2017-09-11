package com.prikhodko.InnerClass0909;

import com.prikhodko.InnerClass0909.A;

public class InnerTest {

        public static void main(String[] args) {
            A a =new A();
            A.B b =a.new B();
            b.func();
            //System.out.println(a.createB());
            C c = new C();
            //C.D d = new C().new D();
            C.D d=c.new D();
        }
    }


