package com.one;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/20.
 * ѡ������
 *
 */
public class ChooseArray {
    public static void main(String[] args) {
        int[] array = {11,40,12,25,65,19,38};

        System.out.println("ʹ��Arrays");
        System.out.println(Arrays.toString(array));
        System.out.println("�����");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //�������ָ����Ԫ�أ�
        System.out.println(Arrays.binarySearch(array,25));


    }
    public static void SelectArray(int[] ints){

        for (int i = 0; i <ints.length-1 ; i++) {
            for (int j = i+1; j <ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

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
}
