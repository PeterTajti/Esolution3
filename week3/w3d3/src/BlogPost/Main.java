package BlogPost;

import PostIt.PostIt;

public class Main {

    public static void main (String [] args) {

        BlogPost firstBlogPost = new BlogPost();
        firstBlogPost.authorName = "John Doe";
        firstBlogPost.title = "Lorem Ipsum";
        firstBlogPost.text = "Lorem ipsum dolor sit amet.";
        firstBlogPost.publicationDate = "2000.05.04.";

        BlogPost secondBlogPost = new BlogPost();
        secondBlogPost.authorName = "Tim Urban";
        secondBlogPost.title = "Wait but why";
        secondBlogPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondBlogPost.publicationDate = "2010.10.10.";

        BlogPost thirdBlogPost = new BlogPost();
        thirdBlogPost.authorName = "William Turton";
        thirdBlogPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdBlogPost.text = "aniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        thirdBlogPost.publicationDate = "2017.03.28";

    }


}
