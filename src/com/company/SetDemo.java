package com.company;

import java.util.HashSet;


public class SetDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Vladimir", "Putin", Gender.MALE);
        Person person2 = new Person("Vladimir", "Zelenski", Gender.MALE);
        Person person3 = new Person("Angela", "Merkel", Gender.FEMALE);
        Person person4 = new Person("Vladimir", "Zelenski", Gender.MALE);
        Person person5 = new Person("Angela", "Merkel", Gender.FEMALE);

        HashSet<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person5);
        persons.add(person4);
        persons.add(person3);

        outputCollection(persons);

        System.out.println("Общее количество элементов в коллекции - " + persons.size()+".");
    }

    public static void outputCollection(HashSet<Person> Hashset) {
        System.out.println();
        for (Person person0 : Hashset) {
            System.out.println(person0 + " ");
        }

    }
}
