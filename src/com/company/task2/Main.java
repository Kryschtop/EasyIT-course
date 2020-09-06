package com.company.task2;

public class Main {

    public static void main(String[] args) {
                Humen humen = new Humen("DIMA",13,145,35.8) ;
                humen.say();
                Hobby hobby = new Hobby("football",2,"the game where playrs kick the ball");
        Friend friend = new Friend("Oleg",34,"I am a student of the faculty of economics.I study audit, taxation, accounting, and many other economical subjects.ру.I have neither brothers nor sisters.");
        Friend friend2 = new Friend("Peni",24,"I am purposeful, easy-going, cheerful and responsive. I love my family and friends and I am always eager to help them and divide their joy and sorrows. ");
        Girl girl = new Girl("Ira",34,165,55.8,hobby,friend) ;
                girl.say();
                girl.getHobby().info();
                girl.getFriend().tell();
        Boy boy = new Boy("Oks",25,178,76,friend2);
                boy.say();
                boy.getFriend().tell();

    }
        }







