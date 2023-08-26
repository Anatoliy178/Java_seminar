package org.geek_brains.ru;

/**
 * Лукьянов Анатолий
 * группа 4619
 */

public class Main {
    public static void main(String[] args) {
        Master master = new Master("Kolya", 25);
        Cat cat = new Cat();
        cat.setName("Барсик");
        cat.setAge(3);
        cat.setBounce(5);
        cat.setMaster("Kolya");

        cat.greeting();
        cat.jumpCat();
        cat.voice();

        Master master1 = new Master("Вася", 2);
        Cat cat1 = new Cat();
        cat.setName("Кис");
        cat.setAge(1);
        cat.setBounce(0.5);


        cat.greeting();


    }
}