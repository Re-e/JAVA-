package re;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = {"饭前勤洗手","便后常漱口","只要编程好","要饭要到老","996.icu"};

    public void go(){
        try {
            //建立服务器应用程序对端口4242客户端的监听
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true){
                //启动服务器监听，等待用户接入。
                Socket sock = serverSocket.accept();

                //使用socket连接来送出advice信息，送出完毕后就关闭。
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }//关闭go函数

    private String getAdvice(){
        int random = (int)(Math.random()*adviceList.length);
        return adviceList[random];
    }//getAdvice方法结束

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
