//Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//fields:
//previousOrganization: the name of the student’s previous company / school
//skippedDays: the number of days skipped from the course

//methods:
//getGoal(): prints out "Be a junior software developer."
//introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//skipDays(numberOfDays): increases skippedDays by numberOfDays

//The Student class has the following constructors:
//
//Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0

package GreenFoxOrganization;

public class Student extends Person implements Cloneable{

    String previousOrganization = "school";
    int skippedDays;

    @Override
    void getGoal () {
        System.out.println("Be a junior software developer.");
    }

    @Override
    void introduce () {
        System.out.println("Hi, my name is " + name + " i am " + age + " years old " + gender + " from "
                + previousOrganization +  " who skipped " + skippedDays + " from the course already");
    }


    void skipDays (int numberOfDays) {
        skippedDays += numberOfDays;
    }


    public Student (String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }





    //cloning exercise megoldás innen

    @Override

// ez a két sor ami jön az implementálás után keletkezett automatikusan
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();

        protected Student clone() {
            Student clones = new Student();
            clones.name = this.name;
            clones.age = this.age;
            clones.gender = this.gender;
            clones.previousOrganization = this.previousOrganization;
            return clones;

        }

}
