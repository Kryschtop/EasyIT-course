package com.company.task2;

public class Boy extends Humen{
        private Friend friend;
        public Boy(String name, int age, double height, double weitht,Hobby hobby, Friend friend) {
            super(name, age, height, weitht,hobby);
            this.friend=friend;
        }
        public void say() {
            super.say();

}



    public Friend getFriend(){
            return friend;}
    }