package com.company.task2;

import sun.text.normalizer.CharTrie;

public class Girl extends Humen {
    private Hobby hobby;
private Friend friend;
    public Girl(String name, int age, double height, double weight, Hobby hobby,Friend friend) {
        super(name, age, height, weight);
        this.hobby = hobby;
        this.friend= friend;
    }

    public void say() {
        super.say();
    }

    public Hobby getHobby() {
        return hobby;
    }

    public Friend getFriend() {
        return friend;

    }
}

