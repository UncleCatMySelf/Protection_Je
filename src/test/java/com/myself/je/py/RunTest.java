package com.myself.je.py;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 14:58 2018\7\30 0030
 */
public class RunTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        Process proc;
        String str = "我要去喜欢别人了";
        System.out.println("倾述：" + str);
        try {
            proc = Runtime.getRuntime()
                    .exec("python F:\\慕课项目源码\\SentimentPolarityAnalysis-master\\spa\\tt.py --str "+str);// 执行py文件
            //用输入输出流来截取结果
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine())!=null) {
                System.out.println(line);
                if ("1".equals(line)){
                    System.out.println("开心");
                }else{
                    System.out.println("不开心");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

