package com.zjc.demo;
/*
    @author  zjc
    @create 2021-03-03-12:05  
*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        hs.add("java");

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------");

        for (String h : hs) {
            System.out.println(h);
        }

    }
}
