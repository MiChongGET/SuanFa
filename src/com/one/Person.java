package com.one;

/**
 * Created by Administrator on 2016/11/24.
 */
public class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person name"+name+"age"+age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("當前的回收的对象是");
        super.finalize();
    }
}
