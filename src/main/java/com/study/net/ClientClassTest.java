package com.study.net;

import javax.security.sasl.SaslClient;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class ClientClassTest {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",31159);
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");


        if (scan.hasNext()){
            System.out.println("服务器的回应数据为："+ scan.next());
        }

        scan.close();
        client.close();
    }
}
