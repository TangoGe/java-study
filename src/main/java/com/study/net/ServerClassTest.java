package com.study.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 网络编程
 * 服务端
 */
public class ServerClassTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(31159);
        System.out.println("服务开始启动。。。。。。。");
        Thread.sleep(10000);
        Socket client = server.accept();//接受客户端请求，进入阻塞状态

        //取得指定客户端的输出对象  必须使用PrintStream 进行装饰
        PrintStream outStream = new PrintStream(client.getOutputStream());
        outStream.println("客户端输入 HelloWorld");
        outStream.close();
        client.close();
        server.close();

        System.out.println("服务器已关闭");
    }
}
