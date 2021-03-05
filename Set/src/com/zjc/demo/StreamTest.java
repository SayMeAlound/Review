package com.zjc.demo;/*
 @user  zhaomo
 @create 2021-03-04-11:05
 @Name   Review  
*/

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *   1. 男演员只要名字为三个字的前两任
 *   2. 女演员只要姓杨的而且不要第一个
 *   3. 把过滤后的男演员和女演员姓名合并到一起
 *   4. 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");

        //1. 男演员只要名字为三个字的前两任
        Stream<String> stream1 = manList.stream().filter(name-> name.length() == 3 ).limit(2);

        //2. 女演员只要姓杨的而且不要第一个
        Stream<String> stream2 = womanList.stream().filter(name -> name.startsWith("杨")).skip(1);

        // 合并两个集合
        Stream.concat(stream1,stream2).forEach(name -> System.out.println(name));



    }
}
