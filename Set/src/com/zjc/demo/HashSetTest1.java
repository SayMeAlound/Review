package com.zjc.demo;/*
 @user  zhaomo
 @create 2021-03-03-20:01
 @Name   Review  
*/

import com.zjc.entity.Student2;

import java.util.HashSet;


/**
 * 创建一个存储学生对象的集合 ,存储多个学生对象,使用程序实现在控制台遍历该集合
 * 要求: 学生对象的成员变量值相同,我们就认为是一个对象
 *
 *  结论:
 *   如果hashSet 要存储自定义对象,那么必须重写hashCode和Equals方法
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Student2> hs = new HashSet<>();
        Student2 s1 = new Student2("zhaomo",28);
        Student2 s2 = new Student2("zhaomo",28);
        Student2 s3 = new Student2("xuecheng",23);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student2 student : hs) {
            System.out.println(student);
        }


    }
}
