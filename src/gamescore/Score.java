package gamescore;

/**
 * Game score class
 * @author vanrooijen
 */
public class Score {
    public User user;
    public int score;

    public Score(User newUser, int newScore) {
        user = newUser;
        score = newScore;
    }
}