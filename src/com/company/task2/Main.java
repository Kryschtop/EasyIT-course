package com.company.task2;

public class Main {

    public static void main(String[] args) {

        Girl girl = new Girl("Ira",34,165,55.8,new Friend("Oleg",34,187,67,new Hobby("drawing",3," the ball")));
        girl.say();
        girl.getFriend().tell();
        girl.getFriend().getHobby().info();
        Boy boy = new Boy("Oks",25,178,76,new Friend("Peni",24,167,77,new Hobby("coocing",3,"the game where")));
        boy.say();
        boy.getFriend().tell();
        boy.getFriend().getHobby().info();

    }
}







