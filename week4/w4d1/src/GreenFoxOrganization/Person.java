//Create a Person class with the following fields:
//
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

package GreenFoxOrganization;

public class Person {

    String name;
    int age;
    String gender;

    void introduce () {
        System.out.println("Hi, my name is " + name + " ,i am " + age + " years old " + gender + ".");
    }

    void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        name = "JaneDoe";
        age = 30;
        gender = "female";

    }

}
