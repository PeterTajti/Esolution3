package School;

public class Main {

    public static void main(String[] args) {

        School mySchool = new School (6);

        Student Adam = new Student ("Adam", 20, "male", 30);
        Student Bob = new Student ("Bob", 22, "male", 15);
        Student Cathy = new Student("Cathy", 21, "female", 25);
        Student David = new Student("David", 28, "male", 40);
        Student Erik = new Student("Erik", 24, "male", 28);
        Student Patricia = new Student("Patricia", 29  , "female", 32);

        mySchool.addStudent(Adam);
        mySchool.addStudent(Bob);
        mySchool.addStudent(Cathy);
        mySchool.addStudent(David);
        mySchool.addStudent(Erik);
        mySchool.addStudent(Patricia);


        mySchool.printStudentList();

    }

}
