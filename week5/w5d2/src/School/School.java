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

    public int totalKnowledge () {
        int sumOfKnowledge=0;

        for (Student i: this.listOfStudents) {
            sumOfKnowledge += i.knowledge;
        }
        return sumOfKnowledge;
    }

    public double averageKnowledge () {
        double averageKnowledge=0;
        averageKnowledge = totalKnowledge() / listOfStudents.size();
        return  averageKnowledge;
    }

    //if (this.listOfAnimals.size() > 0) {
    //            hungriest = this.listOfAnimals.get(0);
    //            for (Animal i : this.listOfAnimals) {
    //                if (i.getHunger() > hungriest.getHunger()) {
    //                    hungriest = i;
    //                }
    //            }
    //            this.listOfAnimals.remove(hungriest);
    //            System.out.println("we slaughtered " + hungriest.name);
    //        } else {
    //            System.out.println("there is no animal to slaughter");
    //        }

    public void exam () {
        Student stupidest;

        if (this.listOfStudents.size() > 0) {
            stupidest = this.listOfStudents.get(0);
            for (Student i : this.listOfStudents) {
                if (i.getKnowledge() < stupidest.getKnowledge()) {
                    stupidest = i;
                }
            }

            this.listOfStudents.remove(stupidest);
            System.out.println("We removed " + stupidest.name + " because he had the smallest knowledge. It was only " + stupidest.knowledge +"\n" );
        } else {
            System.out.println("there is no student to remove");
        }

    }



}
