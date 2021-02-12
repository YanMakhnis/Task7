package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Vladimir", "Putin",Gender.MALE);
        Person person2 = new Person("Mikhail", "Saakashvili",Gender.MALE);
        Person person3 = new Person("Margaret", "Tatcher",Gender.FEMALE);
        Person person4 = new Person("Vladimir", "Zelenski",Gender.MALE);
        Person person5 = new Person("Angela", "Merkel",Gender.FEMALE);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        outputCollection(persons);

        System.out.println("Общее количество элементов в коллекции - " + persons.size()+".");




    }
    public static void outputCollection(ArrayList<Person>Arraylist){
        System.out.println();
        for (Person person0 :Arraylist){
            System.out.println(person0+" ");
        }
        System.out.println();
    }
}
