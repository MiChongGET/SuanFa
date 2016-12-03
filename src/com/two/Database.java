package com.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Database {
    private static List list;
    private static Scanner scanner;
    public static void main(String[] args) {
        list = new ArrayList();
        Student s1 = new Student("赵晓东", 21);
        Student s2 = new Student("佳佳", 20);
        Student s3 = new Student("瑞瑞", 19);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        while (true) {
            System.out.println("请输入你的选择：");
            System.out.println("0:退出 1:显示list元素 2:添加元素 " +
                    "\n"+"3:删除元素 4:指定位置添加 5:查询元素");
            scanner = new Scanner(System.in);
            mydone(scanner.nextInt());
            System.out.println("---------------------------------------");
        }
    }

    //设置将要进行的动作
    public  static void mydone(int i){
        switch (i){
            case 0:
                System.out.println("------正在退出------");
                System.exit(0);
            case 1:
                arraylist();
                break;
            case 2:
                addlist();
                break;
            case 3:
                removelist();
                break;
            case 4:
                setList();
                break;
            case 5:
                searchlist();
                break;
        }
    }

    public  static void arraylist(){
        //list元素遍历，使用迭代器
        System.out.println("列表元素:");
        //System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            Student s = (Student) it.next();
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }

    public static void addlist(){
        System.out.println("输入你的姓名:");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("请输入你的年龄:");
        int age  = scanner1.nextInt();
        Student s4 = new Student(name,age);
        list.add(s4);
    }

    public static void removelist() {
        System.out.println("请输入要删除的位置：");
        list.remove(scanner.nextInt());
        arraylist();
    }

    public static void setList(){
        System.out.println("请输入你要插入的位置:");
        Scanner s = new Scanner(System.in);
        int position = s.nextInt();
        if (position<list.size()){
        Scanner s1 = new Scanner(System.in);
        System.out.println("输入你的姓名:");
        String name = s1.nextLine();

        System.out.println("请输入你的年龄:");
        int age  = s1.nextInt();

        Student s5 = new Student(name,age);
        list.set(position,s5);
        }else{
            System.out.println("位置超出范围！！！");

        }
    }

    public static void searchlist(){

        System.out.println("请输入要查找的位置：");
        Scanner s = new Scanner(System.in);
        int num  = s.nextInt();
        if (num<=list.size()) {
            System.out.println("第" + num + "元素是：" + list.get(num));
        }
    }
}
