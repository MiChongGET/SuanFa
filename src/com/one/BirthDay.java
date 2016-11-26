package com.one;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/26.
 */
public class BirthDay extends DateDemo {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入出生日期：");
        String t = s.nextLine();
        Date date = StringToDate(t,"yyyy-MM-dd");
        System.out.println(date);
        long birthtime = date.getTime();
        long nowtime = System.currentTimeMillis();
        long time = (nowtime-birthtime)/1000/60/60/24;
        System.out.println("出生到现在"+time+"天");

    }
}
