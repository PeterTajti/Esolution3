//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

package PostIt;

public class Main {

    public static void main (String [] args) {

        PostIt firstPost = new PostIt();
        firstPost.backgroundColor = "orange";
        firstPost.text = "idea 1";
        firstPost.textColor = "blue";

        PostIt secondPost = new PostIt();
        secondPost.backgroundColor = "pink";
        secondPost.text = "Awesome";
        secondPost.textColor = "black";

        PostIt thirdPost = new PostIt();
        thirdPost.backgroundColor = "yellow";
        thirdPost.text = "Superb!";
        thirdPost.backgroundColor = "green";

    }
}
