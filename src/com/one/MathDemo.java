package com.one;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/24.
 */
public class MathDemo {
    public static void main(String[] args) {
//        System.out.println("PI:"+Math.PI);
//        System.out.println("E:"+Math.E);
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.println(suiji(start,end));
    }
    public static int suiji(int start,int end){

        int num;
        return num = (int) (Math.random()*(end-start+1))+start;
    }
}
