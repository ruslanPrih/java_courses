package com.prikhodko.generic0909;

public class FunctionImpl<T> implements Function <T>{
    @Override
    public void add(T t){
        System.out.println(t);
    }
}
