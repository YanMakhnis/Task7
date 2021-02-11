package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov",Gender.MALE);
        Person person2 = new Person("Tom", "Hardy",Gender.MALE);
        Person person3 = new Person("Angela", "Merkel",Gender.FEMALE);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person3);
        persons.add(person2);

        outputCollection(persons);
    }
    public static void outputCollection(ArrayList<Person>list){
        System.out.println();
        for (Person person0 :list){
            System.out.println(person0+" ");
        }
        System.out.println();
    }
}
