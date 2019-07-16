package Comparable;

import java.util.Arrays;

//az implements Comparable után hozzá kellett tenni hogy "<Domino>"

public class Domino implements Comparable <Domino> {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    // ami innen jön, azokat implementáltuk a "beépített" comparable-vel

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    //a feladat megoldásához ehhez az alábbi részhet nyúltunk hozzá

    //ha a baloldalból elveszi a másik dominó baloldalát és az eredmény nulla,
    // akkor az első dominó jobboldalából kivonja a második dominó jobboldalát.
    // Ha, az eredmény negatív akkor előrrébb tolja (vagy hátrább:P)
    //Végül, ha a két domino baloldalai nem egyenlőek, akkor kivonja az első baloldalából a második baloldlát,
    //és úgy, az alapján rendezi...

    @Override
    public int compareTo(Domino o) {
        if (this.left - o.left == 0) {
            return this.right - o.right;
        }

        return this.left - o.left;
    }


}