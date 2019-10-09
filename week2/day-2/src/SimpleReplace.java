public class SimpleReplace {

    public static void main(String... args){
        String example = "In a dishwasher far far away";

        String b = example.replace("dishwasher", "galaxy");

        System.out.println(b);




        String elsomondat = "Ez egy tesztmondat hibás tartalommal.";

        String javitottmondat = elsomondat.replace("hibás", "helyes");

        System.out.println(javitottmondat);



    }


}
