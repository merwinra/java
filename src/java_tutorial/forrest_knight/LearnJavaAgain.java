package java_tutorial.forrest_knight;

/**
 * A simple public class that goes over some of the fundamentals of Java
 * based on the <a href="https://www.youtube.com/watch?v=b5l5UodFzMo">tutorial</a>
 * published by Forrest Knight.
 */
public class LearnJavaAgain {
    public static void main (String[] args) {
        int likes = 4000;
        int dislikes = 40;
        double ratio = Utils.LikeToDislikeRatio(likes, dislikes);
        System.out.println(ratio);
    }
}
