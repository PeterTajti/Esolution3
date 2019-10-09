
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

//Sample Input 0
//
//hello
//java

//Sample Output 0
//
//9
//No
//Hello Java

public class JavaStringsIntro {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    int stringsLenght = A.length() + B.length();

//    String newA = StringUtils.capitalize(A);
//    String newB = StringUtils.capitalize(B);

    A = A.substring(0,1).toUpperCase() + A.substring(1); //ha kető karaktert ad meg substring utánio zárójelben,
    // akor az első az amitől számol a második pedig amit már nem számol bele, vagyis itt csak a 0. karaktert,
    // majd azt teszi nagybetűvé és hozzákapcsolja az első karaktertől tartó karaktereket (esetünkben az ello-t),
    // így lesz a hello-ból Hello.

    B = B.substring(0,1).toUpperCase() + B.substring(1);
    //ez a két sor elvileg ugyanazt okozza mint a StringUtils.capitalize()

    //suppose A = hello then
    //[1]. A.substring(0, 1) : will return the first Letter of the string i.e. 'h'.
    //[2]. A.substring(0, 1).toUpperCase() i.e. 'h'.toUpperCase() will return you 'H'.
    //[3]. A.substring(1, A.length()) i.e. A.substring(1, 5) : will return a sub string of string "hello" from the letter at 1 to letter at 4. i.e "ello".
    //[4]. A.substring(0, 1).toUpperCase()+A.substring(1, A.length()) i.e. "H" + "ello" will give you "Hello"
    //
    //[5]. Same will happen with B.
    //
    //[6]. Its better to use A.substring(1) it will give you the same output as A.substring(0, A.length()) will give.
    //
    //Hope You will understand :)

    System.out.println(stringsLenght);

    System.out.println(A.compareTo(B) >0 ?"Yes":"No");

    System.out.println(A + " " + B);

  }
}
