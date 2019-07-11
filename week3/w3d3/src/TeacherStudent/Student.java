package TeacherStudent;

public class Student {





//learn() -> prints the student is learning something new
//question(teacher) -> calls the teachers answer method

    void learn () {
        System.out.println("i have learned something new");
    }

    void question (Teacher x){
        x.answer();
    }


}
