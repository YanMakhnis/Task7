package com.company;

import java.util.Objects;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person [" + firstName + " " +
                lastName + ", gender:" + gender + "].";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firstName == person.firstName &&
                lastName == person.lastName &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender);
    }

}
