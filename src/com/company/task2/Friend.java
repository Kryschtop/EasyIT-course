package com.company.task2;

public class Friend {
    private String name;
    private int years;
    private String information;

    public Friend(String name, int years, String information) {
        this.name = name;
        this.years = years;
        this.information = information;

    }

    public void tell(){
            System.out.println("Friend: " + name + "\t" +
                    "years: " + years + "\t" +
                    "personal information: " + "\t" + information);

        }
    }

