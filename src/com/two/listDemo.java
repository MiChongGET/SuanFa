package com.two;

import java.util.*;

/**
 * Created by Administrator on 2016/12/2.
 */
public class listDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("java");
        list.add("android");
        list.add("PHP");

        //index����С�ڵ���ǰ�����ĸ���
        list.add(3,"C#");

//        //listԪ�ر�����ʹ�õ�����
//        System.out.println("�б�Ԫ��:");
//        //System.out.println(list);
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


//        System.out.println("------�������-----");
//
//        ListIterator listIterator = list.listIterator();
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }


        //ʹ��get()������ȡָ��λ�õ�Ԫ��
//        while (true){
//        System.out.println("������Ҫ���ҵ�λ�ã�");
//        Scanner s = new Scanner(System.in);
//        int num  = s.nextInt();
//        if (num<=list.size()) {
//            System.out.println("��" + num + "Ԫ���ǣ�" + list.get(num));
//            }
//        }


        ListIterator ist  = list.listIterator();
        while (ist.hasNext()){
            if (ist.next().equals("PHP")){
                ist.add("HTML");
            }
        }
        System.out.println(list);
    }
}
