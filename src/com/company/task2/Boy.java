package com.company.task2;

public class Boy extends Humen{
    private Friend friend;
    public Boy(String name,int age,double height,double weight,Friend friend)
    {
        super(name, age, height, weight);

        this.friend= friend;

    }

    public void say() {
        super.say();
    }

    public  Friend getFriend(){
        return friend;
    }

}

