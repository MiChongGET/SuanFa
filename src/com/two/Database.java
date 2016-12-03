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
        Student s1 = new Student("������", 21);
        Student s2 = new Student("�Ѽ�", 20);
        Student s3 = new Student("����", 19);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        while (true) {
            System.out.println("���������ѡ��");
            System.out.println("0:�˳� 1:��ʾlistԪ�� 2:���Ԫ�� " +
                    "\n"+"3:ɾ��Ԫ�� 4:ָ��λ����� 5:��ѯԪ��");
            scanner = new Scanner(System.in);
            mydone(scanner.nextInt());
            System.out.println("---------------------------------------");
        }
    }

    //���ý�Ҫ���еĶ���
    public  static void mydone(int i){
        switch (i){
            case 0:
                System.out.println("------�����˳�------");
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
        //listԪ�ر�����ʹ�õ�����
        System.out.println("�б�Ԫ��:");
        //System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            Student s = (Student) it.next();
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }

    public static void addlist(){
        System.out.println("�����������:");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("�������������:");
        int age  = scanner1.nextInt();
        Student s4 = new Student(name,age);
        list.add(s4);
    }

    public static void removelist() {
        System.out.println("������Ҫɾ����λ�ã�");
        list.remove(scanner.nextInt());
        arraylist();
    }

    public static void setList(){
        System.out.println("��������Ҫ�����λ��:");
        Scanner s = new Scanner(System.in);
        int position = s.nextInt();
        if (position<list.size()){
        Scanner s1 = new Scanner(System.in);
        System.out.println("�����������:");
        String name = s1.nextLine();

        System.out.println("�������������:");
        int age  = s1.nextInt();

        Student s5 = new Student(name,age);
        list.set(position,s5);
        }else{
            System.out.println("λ�ó�����Χ������");

        }
    }

    public static void searchlist(){

        System.out.println("������Ҫ���ҵ�λ�ã�");
        Scanner s = new Scanner(System.in);
        int num  = s.nextInt();
        if (num<=list.size()) {
            System.out.println("��" + num + "Ԫ���ǣ�" + list.get(num));
        }
    }
}
