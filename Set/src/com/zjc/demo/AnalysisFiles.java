package com.zjc.demo;/*
 @user  zhaomo
 @create 2021-03-04-11:49
 @Name   Review  
*/

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

// 统计文件夹内的文件
public class AnalysisFiles {
    public static void main(String[] args) {
        File file = new File("Set");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm,file);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String fileName = f.getName();
                String[] fileNameArr = fileName.split("\\.");
                // aaa  a.a.txt  特殊情况目前没考虑
                if (fileNameArr.length == 2){
                    String fileEndName = fileNameArr[1];
                    if (hm.containsKey(fileEndName)){
                        // 已经存在   获取当前出现的次数
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName,count);
                    }else {
                        // 不存在  表示当前文件是第一次出现
                        hm.put(fileEndName,1);
                    }
                }
            }else {
                getCount(hm,f);
            }
        }
    }
}
