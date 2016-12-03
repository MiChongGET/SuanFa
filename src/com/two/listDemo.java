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

        //index必需小于等于前面田间的个数
        list.add(3,"C#");

//        //list元素遍历，使用迭代器
//        System.out.println("列表元素:");
//        //System.out.println(list);
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


//        System.out.println("------逆向遍历-----");
//
//        ListIterator listIterator = list.listIterator();
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }


        //使用get()函数获取指定位置的元素
//        while (true){
//        System.out.println("请输入要查找的位置：");
//        Scanner s = new Scanner(System.in);
//        int num  = s.nextInt();
//        if (num<=list.size()) {
//            System.out.println("第" + num + "元素是：" + list.get(num));
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
