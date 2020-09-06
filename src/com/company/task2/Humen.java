package com.company.task2;

public class Humen {

    private String name;
    private int age;
    private double height;
    private double weight;

    public Humen(String name,int age,double height,double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public  void say(){
        System.out.println(
                "Name: " + name+ "\n" +
                        "Height: " + height +
                        "Age: " + age +
                        "Weight: " + weight );
}
public void tell(){System.out.println(
        " FRIEND Name: " + name+ "\n" +
                "Height: " + height +
                "Age: " + age +
                "Weight: " + weight );

}
}
