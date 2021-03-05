package com.zjc.socketdemo2;/*
 @user  zhaomo
 @create 2021-03-06-01:52
 @Name   Review  
*/

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadScoket implements Runnable{

    private Socket acceptSocket;

    public ThreadScoket(Socket accept) {
        this.acceptSocket =accept;
    }

    @Override
    public void run() {
        //网络中的流 从客户端读取数据
        BufferedOutputStream bos =null;
        try {
            BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
            UUID uuid = UUID.randomUUID();
            //本地的IO 流,把数据写到本地中,实现永久化存储
            bos = new BufferedOutputStream(new FileOutputStream("Set\\ServerDir\\"+uuid.toString()+".png"));


            int b;
            while((b=bis.read()) !=-1){
                bos.write(b);
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos !=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (acceptSocket !=null){
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
