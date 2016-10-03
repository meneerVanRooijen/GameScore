package gamescore;

/**
 * Game user class
 * @author vanrooijen
 */
public class User {
    private String name;
    
    public User(String initName) {
        name = initName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}