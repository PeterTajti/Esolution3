package spring.webrestaurant.Repositories;

import spring.webrestaurant.Models.Fox;

import java.util.ArrayList;
import java.util.List;

public class Database {

    List<Fox> listOfFoxes;



    public Database() {
        listOfFoxes = new ArrayList<>();
        fillList();
    }

    Fox fox1 = new Fox("Green Fox", "A very special good animal, which is crafting computer codes.", "green", "pizza", 9999, 20  );
    Fox fox2 = new Fox("Red Fox", "An angry evil fox. He is very hungry.", "red", "meat", 100, 2  );
    Fox fox3 = new Fox("Black Fox", "An evil fox. He is hunting pets!", "black", "pet", 5000, 1  );
    Fox fox4 = new Fox("Blue Fox", "This good fox lives far away, at icy poles.", "blue", "fish", 2000, 3  );
    Fox fox5 = new Fox("Purple Fox", "A magical good fox from the tales.", "purple", "flower", 5000, 0  );
    Fox fox6 = new Fox("Yellow Fox", "An old and good fox.", "yellow", "puding", 50, 100  );
    Fox fox7 = new Fox("Classic Fox", "Old evil fox, nothing special :)", "orange", "sheep", 300, 10  );

    public List<Fox> getListOfFoxes() {
        return listOfFoxes;
    }

    public void fillList () {
        listOfFoxes.add(fox1);
        listOfFoxes.add(fox2);
        listOfFoxes.add(fox3);
        listOfFoxes.add(fox4);
        listOfFoxes.add(fox5);
        listOfFoxes.add(fox6);
        listOfFoxes.add(fox7);



    }

}
