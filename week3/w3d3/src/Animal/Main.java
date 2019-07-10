package Animal;

import BlogPost.BlogPost;

public class Main {

    public static void main (String [] args){

        Animal fox = new Animal();

        fox.play();
        fox.play();
        fox.play();

        System.out.println(fox.hungerValue + " " + fox.thirstValue);


    }

}
