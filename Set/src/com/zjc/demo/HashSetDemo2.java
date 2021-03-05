package com.zjc.demo;
/*
    @author  zjc
    @create 2021-03-03-12:11  
*/

import com.zjc.entity.Student;
import com.zjc.entity.Student2;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("xiaizhi",28);
        Student2 s2 = new Student2("xiaomei",22);

        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());
    }
}
