package com.three;

import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/8.
 * �Զ���ջ�ļ���
 */
public class Mystack {
    private LinkedList link;

    public Mystack(){
        link = new LinkedList();
    }

    public void add(Object object){
        link.addFirst(object);
    }

    public Object  get() {
        //return link.getFirst();
        return link.removeFirst();
    }

    public int size(){
        return link.size();
    }
    public boolean aa(){
        return link.isEmpty();
    }
}
