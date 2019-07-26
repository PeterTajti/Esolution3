package School;

public class Main {

    public static void main(String[] args) {

        //létrehozok egy iskolát 6 férőhellyel
        School mySchool = new School (6);

        //létrehozok 6 tanulót névvel, korral, nemmel, tudással
        Student Adam = new Student ("Adam", 20, "male", 30);
        Student Bob = new Student ("Bob", 22, "male", 15);
        Student Cathy = new Student("Cathy", 21, "female", 25);
        Student David = new Student("David", 28, "male", 40);
        Student Erik = new Student("Erik", 24, "male", 28);
        Student Patricia = new Student("Patricia", 29  , "female", 32);

        David.party();
        Bob.learn();

        //a hat tanulót hozzáadom az iskola tanulóit tartalmazó listához
        mySchool.addStudent(Adam);
        mySchool.addStudent(Bob);
        mySchool.addStudent(Cathy);
        mySchool.addStudent(David);
        mySchool.addStudent(Erik);
        mySchool.addStudent(Patricia);

        //kiíratom valamennyi tanuló adatait
        //kiíratom a tanulók tudásának az összegét
        mySchool.printStudentList();
        System.out.println("The sum of the students knowledge is: " + mySchool.totalKnowledge()+"\n");

        //kiíratom a tanulók tudásának átlagát (egész számot ad vissza!!!)
        System.out.println("The average of the students knowledge is: " + mySchool.averageKnowledge()+"\n");

        //a tanulók vizsgázni mennek (3x), akinek a lekissebb a knowledge-je, azt eltávolítjuk
        mySchool.exam();
        mySchool.exam();
        mySchool.exam();

        System.out.println("The ''survivor'' students after three exams are : \n" );
        mySchool.printStudentList();
    }

}
