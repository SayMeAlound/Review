package com.zjc.demo;/*
 @user  zhaomo
 @create 2021-03-04-14:10
 @Name   Review  
*/

import java.util.Map;
import java.util.Properties;
import java.util.Set;

//Properties extends Hashtable
//class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, java.io.Serializable
public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //增
        prop.put("小龙女","尹志平");
        prop.put("郭襄","杨过");
        prop.put("黄蓉","欧阳克");
        System.out.println(prop);
        //删
        //prop.remove("郭襄");
        //System.out.println(prop);

        //改
        // put  --- 如果键不存在,那么就添加,如果键存在,那么就覆盖
        prop.put("小龙女","杨过");
        System.out.println(prop);

        //查
        System.out.println(prop.get("黄蓉"));


        //遍历
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            System.out.println(key + " -----" +prop.get(key));
        }

        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            // entry.getKey()   entry.getValue()
            System.out.println(entry);
        }
    }
}
