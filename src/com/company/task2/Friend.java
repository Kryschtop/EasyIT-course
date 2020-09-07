package com.company.task2;


 public class Friend extends Humen {
    private String name;
private int age;
private double height;
private double weitht;

    private Hobby hobby;

    public Friend(String name, int age, double height, double weight, Hobby hobby) {
        super(name, age, height, weight,hobby);
        this.hobby=hobby;
        this.weitht=weight;
        this.height=height;
        this.age=age;
        this.name=name;

    }
        public void Friends() {
            System.out.println("Friend: " + name + "\t" +
                    "years: " + age + "\t" + "height" + height +"\t"+ "weitgh" + weitht +"\t"+ "hobby" + hobby.toString());
        }
}









