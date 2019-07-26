package School;

import java.util.ArrayList;
import java.util.List;

public class School {

    int maxNumberOfStudent;
    ArrayList<Student> listOfStudents = new ArrayList<>();
    boolean hasStudents;

    public School (int maxNumberOfStudent) {
        this.maxNumberOfStudent = maxNumberOfStudent;
    }

    public void addStudent (Student s) {
        if (this.maxNumberOfStudent > this.listOfStudents.size()) {
                this.listOfStudents.add(s);
        } else {
            System.out.println("The school is full, cannot add more students.");
        }
    }

    public void autoFillWithStudents () {} //like breed or cloneing

    public void printStudentList () {
        for (Student i : this.listOfStudents) {
            System.out.println(i.name + "["+i.age+" years old]" + "["+i.gender+"]" + "(his/her knowledge is"+"["+i.knowledge+"])");
        }
        System.out.println();
    }



    public void trialExam () {}

    public void realExam () {}


}
