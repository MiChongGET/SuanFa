package com.one;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/21.
 */
public class CharacterDemo {
    public static void main(String[] args) {
//        Character character = new Character('a');
//        System.out.println(character);
//        System.out.println(Character.isUpperCase('A'));//判断是否是大写
//        System.out.println(Character.isLowerCase('a'));//判断是否是小写
//        System.out.println(Character.isDigit('1'));//判断是否是数字
//        System.out.println(Character.toUpperCase('a'));//小写字符转化为大写
        int uppercase=0;
        int lowercase=0;
        int digit=0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[]  chars = a.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (Character.isUpperCase(chars[i])) uppercase++;
            if (Character.isLowerCase(chars[i])) lowercase++;
            if (Character.isDigit(chars[i])) digit++;
        }
        System.out.println("uppercase:"+uppercase);
        System.out.println("lowercase:"+lowercase);
        System.out.println("digit:"+digit);
    }
}
