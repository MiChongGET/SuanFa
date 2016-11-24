package com.one;

/**
 * Created by Administrator on 2016/11/20.
 *
 * 冒泡排序的使用
 *
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {11,40,12,25,65,9,19,38};
        System.out.println("排序前：");
        printArray(array);
        System.out.println("排序后：");
        sortArray(array);
        printArray(array);

    }

    public static void printArray(int[] ints){
        System.out.print("[");
        for (int i = 0; i < ints.length; i++){
            if (i==ints.length-1){
            System.out.print(ints[i]);
            }else
                System.out.print(ints[i]+",");
        }
        System.out.println("]");
    }

    public static void sortArray(int[] ints) {

        for (int j = 0; j < ints.length-1; j++) {
            for (int i = 0; i < ints.length - 1 - j; i++) {
                if (ints[i] > ints[i+1 ]) {
                    int temp;
                    temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                }
            }
        }
    }
}
