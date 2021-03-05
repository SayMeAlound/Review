package com.zjc.demo;/*
 @user  zhaomo
 @create 2021-03-03-22:27
 @Name   Review  
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap1 {
    public static void main(String[] args) {
        method1();

    }

    private static void method1() {
        Map<String,String> map  = new HashMap<>();

        map.put("number01","小赵");
        map.put("number02","小王");
        map.put("number03","小李");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s + "第一种"+map.get(s));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //得到每一个键值对对象
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key  +" ---------------第二种"+ value);
        }
        map.forEach(
                (String key ,String value) -> {

                    System.out.println(key  +" ---------------第三种"+ value);
                }
        );


        System.out.println(map);
    }
}
