package com.company.task2;

    public class Boy extends Humen{
        private Friend friend2;
        public Boy(String name,int age,double height,double weight,Friend friend2) {
            super(name, age, height, weight);
            this.friend2=friend2;
    }
        public void say(){

            super.say();
    }
        public Friend getFriend() {
            return friend2;
        }
}

