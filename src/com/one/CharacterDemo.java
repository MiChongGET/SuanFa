package com.one;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/21.
 */
public class CharacterDemo {
    public static void main(String[] args) {
//        Character character = new Character('a');
//        System.out.println(character);
//        System.out.println(Character.isUpperCase('A'));//�ж��Ƿ��Ǵ�д
//        System.out.println(Character.isLowerCase('a'));//�ж��Ƿ���Сд
//        System.out.println(Character.isDigit('1'));//�ж��Ƿ�������
//        System.out.println(Character.toUpperCase('a'));//Сд�ַ�ת��Ϊ��д
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
