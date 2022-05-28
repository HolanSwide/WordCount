package com.holanswide;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/5/19 15:26
 */

public class Main {
    static String url;     // 文件路径
    static String param;   // 参数
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
//            输入口：文件路径 参数
//            退出程序：quit 0
            System.out.print("> Input (filename param[-C/-W]), (quit 0) to quit: ");
            if(scanner.hasNext()) url = scanner.next();
            if(scanner.hasNext()) param = scanner.next();
            if(url!=null && param!=null && !url.equals("quit"))  // 判断输入是否合法
                func(url, param); // 合法则开始处理读入的参数
            else break; // 不合法则退出本次循环
        }
//        程序结束，退出
        System.out.println("> Bye.");
    }

    public static void func(String url, String param) {
//        处理读入的参数:
//        文件名：先判断是否存在文件 是否可读，再按行读取处理
//        参数： -C 统计字符（包含空格和回车）
//              -W 统计单词
        try{
            File file = new File(url);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("\n> Working.......\n--------------------------------------------");
            int i=0;
            int res=0;
            while((line = br.readLine()) != null){
                // 一行一行地处理...
                System.out.println("> "+(++i)+" LINE: "+line);
                if(param.equals("-C")) { // 统计字符数
                    res+=countChar(line);
//                    System.out.println(res);
                }
                if(param.equals("-W")) { // 统计单词数
                    res+=countWord(line);
//                    System.out.println(res);
                }
            }
//            输出结果
            System.out.println("============================================");
            System.out.println("> 统计结果： "+res);
            System.out.println("\n> Done.......\n-----------------------------------------------\n");
        }catch ( Exception ignored){
            System.out.println(ignored);
        }
    }

    public static int countChar(String line) { // 统计字符数，包含换行符结束符
        return  line.length()+1; // 换行符
    }
    public static int countWord(@NotNull String line) { // 统计单词数，仅以空格区分
        int res=1;
        for(int i=1;i<line.length()-1;i++) { // 去掉头尾可能存在的孤立空格
           if(line.charAt(i)==' ')
               res++;
        }
        return res;
    }

}
