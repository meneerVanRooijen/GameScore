package gamescore;

import java.util.ArrayList;

/**
 * Filling scores array with test data
 * @author vanrooijen
 */
public class FillScores {
    
    private User user1 = new User("Harry");
    private User user2 = new User("Fred");
    
    private Score score1 = new Score(user1, 1000);
    private Score score2 = new Score(user2, 2000);
    private Score score3 = new Score(user1, 3000);
    private Score score4 = new Score(user2, 4000);
    
    public ArrayList<Score> getData() {
        
        ArrayList<Score> scores = new ArrayList<>();
        
        scores.add(score1);
        scores.add(score2);
        scores.add(score3);
        scores.add(score4);
        
        return scores;
    }
}