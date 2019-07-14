//Create a Person class with the following fields:
//name: the name of the person
//age: the age of the person (whole number)
//gender: the gender of the person (male / female)
//And the following methods:
//
//introduce(): prints out "Hi, I'm name, a age year old gender."
//getGoal(): prints out "My goal is: Live for the moment!"
//And the following constructors:
//
//Person(name, age, gender)
//Person(): sets name to Jane Doe, age to 30, gender to female

package Homework;

public class Person {

    String name;
    int age;
    boolean gender; //??? booleannal?

    void introduce () {
        System.out.println("Hi! My name is " + name + "and i am " + age + "old " + gender);

    }

    void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }



}
