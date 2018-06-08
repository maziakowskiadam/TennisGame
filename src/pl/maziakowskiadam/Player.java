package pl.maziakowskiadam;

public class Player {

    private String name;
    private int score;
    public static final String[] scores = {"0", "15", "30", "40", "A"};


    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void scored() {
        this.score++;
    }

    public String scoreString() {
        return scores[score];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
