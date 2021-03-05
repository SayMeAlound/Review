package com.zjc.demo;
/*
 @user  zhaomo
 @create 2021-03-04-14:29
 @Name   Review  
*/

import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws Exception {
        // void  load (Reader reader)   将本地文件中的键值对数据读取到集合中
        //void store  (Writer writer,String comments) 将集合中的数据以键值对形式保存在本地
        Properties prop = new Properties();
        FileReader fr = new FileReader("prop.properties");
        //调用完了load方法后,文件中的键值对信息已经在集合中了    相对于之前的Map 操作  简便了许多
        prop.load(fr);
        fr.close();

        System.out.println(prop);

    }
}
