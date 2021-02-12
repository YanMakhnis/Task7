package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Vladimir", "Putin", Gender.MALE);
        Person person2 = new Person("Mikhail", "Saakashvili", Gender.MALE);
        Person person3 = new Person("Margaret", "Tatcher", Gender.FEMALE);
        Person person4 = new Person("Vladimir", "Zelenski", Gender.MALE);
        Person person5 = new Person("Angela", "Merkel", Gender.FEMALE);

        HashMap<Person,Integer> persons = new HashMap<>();
        persons.put(person1,1);
        persons.put(person2,2);
        persons.put(person3,3);
        persons.put(person4,4);
        persons.put(person4,5);


    }

    public static void outputCollection(HashMap<Person,Integer>hashMap){
        System.out.println();

    }
}
