package com.itheima01;

import java.io.*;
import java.util.ArrayList;

public class StationDemo {
    public static void method1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("HeFeiSubwayManager\\subway.txt"));

            char[] ch = new char[1024];
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> arrayList = new ArrayList<>();
                System.out.print(" "+line);
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}