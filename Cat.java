package org.geek_brains.ru;

import java.text.MessageFormat;

public class Cat {
    private String name;
    private double bounce;
    private String may;
    private int age;
    private String master;


    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }

    public String getMay() {
        return may;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public void voice(){
        System.out.println("cat - May");
    }

    public void jumpCat(){
        System.out.println("cat jump" + " на " + getBounce() + " метров.");
    }

    public void greeting(){
        System.out.println(MessageFormat.format("Мяу! Меня зовут:{0}. Мне {1} лет. Я прыгаю на {2} метров. Мой хозяин {3} , ему {4} лет.",
                name,
                age,
                bounce,
                Master.getNameM(),
                Master.getAgeM()));
    }


}


