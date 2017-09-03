package com.prikhodko.Classes2008;

import java.util.HashMap;
import java.util.Map;

public class B {

//private Map<>(){{}}
    {

        System.out.println("this is not ststic block!");
        System.out.println(c);
    }

    private String a;
    private String b;
    private  static  int c=41;
    static {
        System.out.println(c);
    }
    public B(String a, String b){
        this.a=a;
        this.b=b;
        System.out.println("COnstructor!");
    }


}
