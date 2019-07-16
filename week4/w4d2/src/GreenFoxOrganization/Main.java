//Every Object has a clone() method, so all of your classes, even though the implementation is empty, it doesn't do anything
//Get your Student and other relevant classes from the Green Fox Organization Exercise

//Override and implement the clone() method, so it clones the student

//Instantiate John, a 20 years old male from BME

//Clone him into jonhTheClone

//megoldás: előbb a person classba aztán a student classban hozzáírjuk a classhoz hogy "implements Cloneable"
//aztán CTRL + 'o' gomb és implementálunk (itt azt amelyiket kell)
//aztán Override alá odaírjuk hogy


package GreenFoxOrganization;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);

        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);

        // ide írtuk be a klónt és íratjuk ki. A klónozott példány elnevezése johnTheClone,
        // de a név ettől függetlenül amit vissza adatunk John Doe lesz

        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.name);

        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);

        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

    }

}
