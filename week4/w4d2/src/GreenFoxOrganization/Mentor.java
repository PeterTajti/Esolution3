//Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//level: the level of the mentor (junior / intermediate / senior)

//methods:
//getGoal(): prints out "Educate brilliant junior software developers."
//introduce(): "Hi, I'm name, a age year old gender level mentor."

//The Mentor class has the following constructors:
//
//Mentor(name, age, gender, level)
//Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

package GreenFoxOrganization;

public class Mentor extends Person {

    String level;

    @Override
    void getGoal () {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    void introduce () {
        System.out.println("Hello, my name is" + name + " and i am " + age + " years old " + gender + " " +  level + " mentor." );
    }

    ////The Mentor class has the following constructors:
    ////
    ////Mentor(name, age, gender, level)
    ////Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

    public Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;

    }

    public Mentor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }


}
