package com.company.task2;

public class Humen {
    private String name;
    private int age;
    private double height;
    private double weitht;
    private Hobby hobby;
    public Humen(String name,int age,double height,double weitht,Hobby hobby) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weitht = weitht;
        this.hobby=hobby;
    }
    public void say() {
        System.out.println("Name: "+name+"\n"+" Age: "+age+"\n"+" Height: "+height+"\n"+" Weitht: "+weitht+"Hobby"+hobby.toString());
    }
}



