package com.jaga.solveproblem.basic;

public class Person implements Comparable<Person> {


    String firstName;
    String lastName;
    int age;
    String country;
    String[] sortBy;

    public Person(String[] sortBy) {
        this.sortBy=sortBy;
    }

    public Person(String firstName, String lastName, int age, String country) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return firstName + "|" + lastName + "|" + age + "|" + country;
    }

    @Override
    public int compareTo(Person o) {
        for(String str : sortBy) {
            if(str.equalsIgnoreCase("firstname")) {
                //return this.firstName
            }
        }

        return 0;
    }
}
