package TeacherStudent;

public class Teacher {

//teach(student) -> calls the students learn method
//answer() -> prints the teacher is answering a question



   void teach (Student y){
        y.learn();
   }

    void answer () {
        System.out.println("i am answering a question");
    }



}
