package zhaomo.desaes;
/*
 @user  zhaomo
 @create 2021-03-31-23:37
 @Name   Review
    对称加密
*/

import com.sun.xml.internal.messaging.saaj.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class DesAesDemo {
    public static void main(String[] args) throws Exception {
        //原文
        String input ="赵佳成";
        //定义key
        String key = "Blowfish";
        System.out.println(key.getBytes());
        //算法
        String transformation = "DES";
        //加密类型
        String algorithm  = "DES";
        //创建加密对象
        Cipher cipher = Cipher.getInstance(transformation);
        //创建加密规则
        // 第一个参数  表示key 的字节
        // 第二个参数  表示加密的类型
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8),algorithm);
        //进行加密初始化
        // 第一个参数 模式  加密模式  解密模式
        // 第二个参数 规则  加密规则
        cipher.init(Cipher.DECRYPT_MODE,secretKeySpec);
        //调用加密方法
        //参数表示原文字节数组
        byte[] bytes = cipher.doFinal(input.getBytes());
        byte[] encode = Base64.encode(bytes);
        System.out.println(encode);
        //打印密文
//        System.out.println(new String(bytes));


    }
}
