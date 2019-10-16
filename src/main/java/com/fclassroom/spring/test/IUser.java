package com.fclassroom.spring.test;

public interface IUser {
    default public void say(){
        System.out.println(111111);
    }
}
