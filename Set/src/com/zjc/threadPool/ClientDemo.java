package com.zjc.threadPool;/*
 @user  zhaomo
 @create 2021-03-06-01:15
 @Name   Review  
*/

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        //是本地的流,用来读取本地文件的
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Set\\ClientDir\\2.png"));

        //写到服务器
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while ((b = bis.read())!= -1){
            bos.write(b);
        }
        //给服务器一个结束标记,告诉服务器文件已经传输完毕
        socket.shutdownOutput();


        BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
        bis.close();
        socket.close();
    }
}
