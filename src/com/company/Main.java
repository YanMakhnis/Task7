package com.company;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", Gender.MALE);
        Person person2 = new Person("Tom", "Hardy", Gender.MALE);
        Person person3 = new Person("Angela", "Merkel", Gender.FEMALE);

        System.out.println(person1.getFirstName());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
