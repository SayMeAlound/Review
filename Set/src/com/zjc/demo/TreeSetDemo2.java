package com.zjc.demo;
/*
    @author  zjc
    @create 2021-03-02-23:45  
*/

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int result = o1.length() - o2.length();
//                result =result == 0 ? o1.compareTo(o2) : result;
//                return result;
//            }
//        });

        TreeSet<String> ts = new TreeSet<>(
                (String o1, String o2) -> {
                    int result = o1.length() - o2.length();
                    result = result == 0 ? o1.compareTo(o2) : result;
                    return result;
                }
        );
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
