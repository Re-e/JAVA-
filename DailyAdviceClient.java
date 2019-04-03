package re;

import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    public void go(){
        try {
            //建立对服务器的socket连接
            Socket s = new Socket("127.0.0.1",4242);

            //建立连接到socket上低层输入串流的InputStreamReader
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());

            //建立BufferedReader来读取
            BufferedReader reader = new BufferedReader(streamReader);

            //将信息转换为String类型并输出
            String advice = reader.readLine();
            System.out.println("Today you should: "+advice);

            //关闭所有串流
            reader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }//go方法结束

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
