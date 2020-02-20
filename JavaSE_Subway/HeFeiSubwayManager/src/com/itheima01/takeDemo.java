package com.itheima01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class takeDemo {
    /*public static void main(String[] args) throws IOException {
        method1();
    }*/

    public static void method1() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的上车站:");
        String line1 = sc.next();

        BufferedReader br = new BufferedReader(new FileReader("HeFeiSubwayManager\\subway.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        char[] ch = new char[1024];
        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        while (true) {
            if (arrayList.contains(line1)) {
                break;
            }
            System.out.println("您选择的车站不存在,请重新输入:");
        }
        br.close();
    }
}