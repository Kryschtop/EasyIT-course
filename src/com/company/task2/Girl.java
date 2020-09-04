package com.company.task2;

public class Girl extends Humen{
    private Hobby hobby;
    public Girl(String name,int age,double height,double weight,Hobby hobby)
    {
        super(name, age, height, weight);
        this.hobby= hobby;
    }
    public void say(){
        super.say();
    }
public  Hobby getHobby(){
    return hobby;
}
}
