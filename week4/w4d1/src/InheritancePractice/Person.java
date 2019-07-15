package InheritancePractice;

public class Person {
    String name;

}

class Coworker extends Person {
    String workId; //has-a kapcsolat
    Coworker [] workmates; //is-a kapcsolat (?ez az?)
}

class Boss extends Coworker {
    String licenseplate;
}