package com.itheima01;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/*

 */
public class HeFeiSubwayManager {
    //界面
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<Passenger> array = new ArrayList<Passenger>();
        while (true) {
            System.out.println("------欢迎来到合肥地铁一号线------");
            System.out.print("请输入你的选择:");
            System.out.print("  1.乘坐地铁");
            System.out.print("  2.办理地铁卡");
            System.out.print("  3.充值地铁卡");
            System.out.println("  4.退出系统");
            //用Scanner实现键盘录入
            Scanner sc = new Scanner(System.in);
            String line = sc.next();
            switch (line) {
                case "1":
                    System.out.println("乘坐地铁");
                    takeTheSubway(array);
                    break;
                case "2":
                    System.out.println("办理地铁卡");
                    addSubwayCard(array);
                    break;
                case "3":
                    System.out.println("充值地铁卡");
                    rechargeSubwayCard(array);
                    break;
                case "4":
                    System.out.println("谢谢使用");
                    System.exit(0);//结束JDK,结束程序
            }
        }
    }

    //乘车
    public static void takeTheSubway(ArrayList<Passenger> array) throws IOException {//乘车
        System.out.println("------欢迎乘坐合肥地铁一号线------");
        System.out.println("车站列表如下:");
        //IO流读取本地文件...站点
        StationDemo.method1();

        //用Scanner实现键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的上车站:");

        BufferedReader br = new BufferedReader(new FileReader("HeFeiSubwayManager\\subway.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        while (true) {
            String line1 = sc.next();
            if (!arrayList.contains(line1)) {
                System.out.println("您选择的车站不存在,请重新输入:");
            } else {
                break;
            }
        }
        br.close();


        System.out.println("请输入你的下车站:");
        BufferedReader br22 = new BufferedReader(new FileReader("HeFeiSubwayManager\\subway.txt"));
        ArrayList<String> arrayList22 = new ArrayList<>();
        String line22;
        while ((line22 = br22.readLine()) != null) {
            arrayList22.add(line22);
        }
        while (true) {
            String line2 = sc.next();
            if (arrayList22.contains(line2)) {
                break;
            }
            System.out.println("您选择的车站不存在,请重新输入:");
        }
        br.close();


        System.out.println("请输入你的交通卡号:");
        //读取注册到本地的卡号封装到集合
       /* while (true) {
            String line3 = sc.next();
            if (line3) {

            } else {
                System.out.println("卡号不存在,请选择:");
                System.out.println("1.注册新用户");
                System.out.println("2.重新输入");
                switch (line3) {
                    case "1":
                        addSubwayCard(array);
                        break;
                    case "2":
                        System.out.println("重新输入");
                }
            }
        }*/
    }

    //注册
    public static void addSubwayCard(ArrayList<Passenger> array) {
        Scanner sc = new Scanner(System.in);

        out:
        while (true) {
            System.out.println("请确认是否注册:Y/N");
            String lin1 = sc.next();
            A:
            switch (lin1) {
                case "N":
                    System.out.println("您取消了注册");
                    break;
                case "Y":
                    B:
                    while (true) {
                        System.out.println("请输入您的姓名:");
                        String lin2 = sc.next();


                        System.out.println("请输入您的卡号(5位字符串,首字母必须是小写字母,后4位必须是数字)");
                        String lin3 = sc.next();
                        C:
                        if (lin3.length() != 5) {
                            //System.out.println("非法输入,返回注册页面");
                            break;
                        } else if (lin3.length() == 5) {
                            char ch = lin3.charAt(0);
                            if (ch < 'a' || ch > 'z') {
                                System.out.println("非法输入,请重新输入");
                                break out;
                            } else if (ch > 'a' || ch < 'z') {
                                //判断后4位是否纯数字
                            }
                        }


                        System.out.println("请输入您需要充值的余额(最低30元):");
                        String lin4 = sc.next();
                        //创建集合,Passenger
                        Passenger p = new Passenger(lin2, lin3);
                        HashMap<Passenger, String> hm = new HashMap<>();
                        hm.put(p, lin4);


                        System.out.println("注册成功,请保存好您的卡号信息:");
                        break out;
                    }
                default:
                    System.out.println("非法输入,返回注册页面");
                    break out;

            }

        }

    }

    //充值
    public static void rechargeSubwayCard(ArrayList<Passenger> array) {
    }
}



