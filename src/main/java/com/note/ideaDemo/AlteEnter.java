package com.note.ideaDemo;

import java.util.ArrayList;
import java.util.List;

public class AlteEnter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        f1(list);
        System.out.println(list);
    }

    private static void f1(List<String> list) {
        String name =  "zhangsan";
        int age = 16;
        /***************************************************
         *  字符串格式化
         **************************************************/

//        String info = "name : " + name + ", age :" + age;
        String info = String.format("name : %s, age :%d", name, age); // Alt + Enter  format

//        System.out.println("name : " + name + ", age : " + age);
        System.out.printf("name : %s, age : %d%n", name, age);  // Alt + Enter   format


        /*************************************************
         *  append
         *************************************************/
        String info2 = new StringBuilder().append("name : ").append(name).append(", age :").append(age).toString(); // Alt + Enter

        String usrename = name + " lee";

    }

}
