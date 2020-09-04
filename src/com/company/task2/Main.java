package com.company.task2;

import com.company.task2.Humen;

public class Main {

    public static void main(String[] args) {
                Humen humen = new Humen("DIMA",13,145,35.8) ;
                humen.say();
                Hobby hobby = new Hobby("football",2,"the game where playrs kick the ball");
                Girl girl = new Girl("Ira",34,165,55.8,hobby) ;
                girl.say();
                girl.getHobby().info();
                Humen boy = new Boy("OLEG",25,178,76);
                boy.say();
            }
        }







