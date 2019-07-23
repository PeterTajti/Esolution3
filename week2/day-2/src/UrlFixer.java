public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String b = url.replace ("bots", "odds");
        String c = b.replace ("https", "https:");

        System.out.println(c);
    }
}
