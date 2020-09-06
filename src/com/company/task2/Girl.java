
package com.company.task2;

public class Girl extends Humen{

    private Friend friend;
    public Girl(String name, int age, double height, double weight, Friend friend)
    {
        super(name, age, height, weight);
        this.friend= friend;
    }
    public void say(){
        super.say();
    }

    public  Friend getFriend(){
        return friend;
    
}}