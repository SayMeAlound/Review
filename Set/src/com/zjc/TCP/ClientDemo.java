package com.zjc.TCP;
/*
 @user  zhaomo
 @create 2021-03-06-00:50
 @Name   Review  
*/

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        //os.close();   如果在这里关流 会导致整个socket 都无法使用
        socket.shutdownOutput();   //仅仅关闭输出流  并写一个结束标记


      /*  InputStream is = socket.getInputStream();   涉及到中文不能使用字节流
        int b;
        while((b = is.read()) != -1){
            System.out.print((char) b);
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line =br.readLine() )!= null){
            System.out.println(line);
        }

        br.close();


//        is.close();
        os.close();
        socket.close();

    }
}
