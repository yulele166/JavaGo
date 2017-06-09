package com.zexi.java.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadBigTxt {
    private static Logger LOG = LoggerFactory.getLogger(ReadBigTxt.class);
	public static void main(String[] args) {
//	    int count = readLogToFile("E:/b.mycheer.cn_20170602/b.mycheer.cn_20170602","http://b.mycheer.cn/launcher/deskchart/softmanager/alone/apks/qn_1496236508495xs.apk");
//	    int count = readLogToFile("E:/b.mycheer.cn_20170604/b.mycheer.cn_20170604","http://b.mycheer.cn/launcher/deskchart/softmanager/alone/apks/qn_1496236508495xs.apk");
//	    System.out.println(count);
	}
	
	public static int readLogToFile(String filePath,String str){
  
	    int count = 0;
	    int sum = 0;
	    long start = System.currentTimeMillis();
       
        BufferedReader in = null;
        String s;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"),10*1024*1024);
            while ((s = in.readLine()) != null) {
               if(s.contains(str)){
                   count ++;
                   System.out.println("目标总数："+count);
               }
               sum ++;
            }
        }catch (Exception e){
            LOG.error("read file  error filename={}",filePath);
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
       
        System.out.println("读取总数："+sum);
        System.out.println((System.currentTimeMillis()-start)/1000.0/60+"(min)");
        return count;
    }
}
