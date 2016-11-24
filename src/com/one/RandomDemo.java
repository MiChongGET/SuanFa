package com.one;

import java.util.Random;

/**
 * Created by Administrator on 2016/11/24.
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(100));
        }
    }
}
