package SharpieSet;
import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    public List<Sharpie> sharpieList = new ArrayList<>();

    public int countUsable() {

        int sum = 0;

        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount > 0) {

                sum++;
            }
        }
        return sum;
    }

    public void removeTrash() {

        List<Sharpie> trash = new ArrayList<>();

        for (int i = 0; i < sharpieList.size(); i++) {
            if (sharpieList.get(i).inkAmount <= 0) {
                trash.add(sharpieList.get(i));
            }
        }
        sharpieList.removeAll(trash);
    }

    void addSharpie(Sharpie sharpie) {
        sharpieList.add(sharpie);
    }
}