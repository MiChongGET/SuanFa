package com.two;

/**
 * Created by Administrator on 2016/11/27.
 */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student s1 = new Student("michong",13);
        Student s2 = new Student("小米",18);
        Student s3 = new Student("校花",15);
        Student s4 = new Student("佳佳",20);
        Student s5 = new Student("婷婷",19);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (int i = 0; i <5 ; i++) {
            System.out.println("姓名："+students[i].getName()+"  年龄："+students[i].getAge());
        }

    }
}
