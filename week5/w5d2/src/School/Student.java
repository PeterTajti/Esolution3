package School;

public class Student {

    String name;
    int age;
    String gender;
    int knowledge;

    public Student (String name, int age, String gender, int knowledge) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.knowledge=knowledge;
    }

    public void introduce () {
        System.out.println("Hello! My name is " + name + ", i am an "+ age + " old " + gender + " and my knowledge is " + knowledge + ".");
    }

    public void party () {
        knowledge-=1;
    }


    public void learn () {
        knowledge += 5;
    }

    private int getKnowledge () {
        return knowledge;
    }

}
