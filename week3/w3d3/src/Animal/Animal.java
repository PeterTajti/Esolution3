//Create an Animal class

//Every animal has a hunger value, which is a whole number

//Every animal has a thirst value, which is a whole number
//when creating a new animal object these values are created with the default 50 value

//Every animal can eat() which decreases their hunger by one
//Every animal can drink() which decreases their thirst by one
//Every animal can play() which increases both by one

package Animal;

public class Animal {

    int hungerValue = 50;
    int thirstValue = 50;

    void eat() {
        hungerValue = hungerValue-1;
    }

    void drink () {
        thirstValue = thirstValue-1;
    }

    void play () {
        hungerValue = hungerValue+1;
        thirstValue = thirstValue+1;
    }


}
