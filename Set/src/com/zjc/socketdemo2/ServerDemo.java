package com.zjc.socketdemo2;/*
 @user  zhaomo
 @create 2021-03-06-01:22
 @Name   Review  
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            Socket accept = ss.accept();


            ThreadScoket ts = new ThreadScoket(accept);

            new Thread(ts).start();


        }
//        ss.close();

    }
}
