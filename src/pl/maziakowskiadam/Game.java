package pl.maziakowskiadam;

public class Game {

    private Player server;
    private Player receiver;
    boolean gameEnded;

    public Game(Player server, Player receiver) {
        this.server = server;
        this.receiver = receiver;
    }

    public String getScore() {
        String score;

        if (server.getScore() == 4 && receiver.getScore() == 4) {
            server.setScore(3);
            receiver.setScore(3);
            score = server.scoreString() + " : " + receiver.scoreString();
        } else if (server.getScore() == 4 && receiver.getScore() <= 2) {
            score = "Server won!";
            gameEnded = true;
        } else if (receiver.getScore() == 4 && server.getScore() <= 2) {
            score = "Receiver won!";
            gameEnded = true;
        } else {
            score = server.scoreString() + " : " + receiver.scoreString();
        }


        return score;
    }
}
