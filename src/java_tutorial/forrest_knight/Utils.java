package java_tutorial.forrest_knight;

/**
 * A simple public Utils class
 */
public class Utils {
    /**
     * A method that returns the like-to-dislike ratio
     * @param likes
     * @param dislikes
     * @return like-to-dislike ratio
     */
    public static double LikeToDislikeRatio(int likes, int dislikes) {
        if (likes + dislikes == 0) {
            return 0;
        }
        return (double) likes / (likes + dislikes) * 100;
    }
}
