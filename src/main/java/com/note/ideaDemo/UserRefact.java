package com.note.ideaDemo;

/**
 *  重构：代码中abc bcd 在没有通读代码的情况下，不清楚是什么含义   现在对代码进行重构
 */
public class UserRefact {
    private String lastName;

    public String getFullName(String firstName) {
        System.out.println("your firstName is " + firstName);
        System.out.println("yout lastName is " + this.lastName);

        String fullName = firstName + "\t" + this.lastName;

        System.out.println("your fullName is " + fullName);

        this.sayhello(firstName, lastName);

        return fullName;
    }

    private void sayhello(String name, String firstName) {
        System.out.println("hello" + firstName);
    }

//    private String bcd;
//
//    public String getFullName(String abc) {
//        System.out.println("your firstName is " + abc);
//        System.out.println("yout lastName is " + this.bcd);
//
//        String fullName = abc + "\t" + this.bcd;
//
//        System.out.println("your fullName is " + fullName);
//
//        this.sayhello(abc);
//
//        return fullName;
//    }
//
//    private void sayhello(String abc) {
//    }
}
