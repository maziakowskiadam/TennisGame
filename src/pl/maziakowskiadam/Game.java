package pl.maziakowskiadam;

public class Game {

    private Player server;
    private Player receiver;
    private boolean gameEnded;

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
            score = server.getName() + " won!";
            gameEnded = true;
        } else if (receiver.getScore() == 4 && server.getScore() <= 2) {
            score = receiver.getName() + " won!";
            gameEnded = true;
        } else {
            score = server.scoreString() + " : " + receiver.scoreString();
        }


        return score;
    }

    public Player getServer() {
        return server;
    }

    public void setServer(Player server) {
        this.server = server;
    }

    public Player getReceiver() {
        return receiver;
    }

    public void setReceiver(Player receiver) {
        this.receiver = receiver;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public void setGameEnded(boolean gameEnded) {
        this.gameEnded = gameEnded;
    }
}
