package com.company.task2;

public class Main {

    public static void main(String[] args) {

        Girl girl = new Girl("Ira",34,165,55.8,new Hobby("tennis",1,"sport game"), new Friend("Oleg",34,187,67, new Hobby("coocing",6,"cook delicious food")));
        girl.say();
        girl.getFriend().Friends();
        Boy boy = new Boy("Oks",25,178,76,new Hobby("volleyball",7,"fun game"),new Friend("Peni",24,167,77, new Hobby("coocing",6,"cook delicious food")));
        boy.say();
        boy.getFriend().Friends();

        }


    }









