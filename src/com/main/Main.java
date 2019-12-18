package com.main;
import java.net.*;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        try {
            //创建URL对象
            URL url=new URL("http://www.sohu.com/a/361087396_115362?spm=smpc.home.top-news2.5.1576636329277Pz0pHD9&_f=index_news_4");

            //获取输入流对象
            InputStream in=url.openStream();

            //将输入流的信息传递给字节数组
            BufferedReader br=new BufferedReader(new InputStreamReader(in,"utf-8"));
            String s=br.readLine();
            while(s!=null){
                System.out.println(s);
                s=br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
