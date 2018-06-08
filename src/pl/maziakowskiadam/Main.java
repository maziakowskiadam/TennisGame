package pl.maziakowskiadam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player server = new Player("Server");
        Player receiver = new Player("Receiver");
        Game game = new Game(server, receiver);
        String scorer;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Game started.");
        while (!game.isGameEnded()) {

            System.out.println("Who scored?");
            scorer = keyboard.nextLine();

            if ("S".equals(scorer)){
                server.scored();
            } else if ("R".equals(scorer)) {
                receiver.scored();
            } else {
                System.out.println("Wrong player name");
                continue;
            }

            System.out.println(game.getScore());
        }

        System.out.println("Game ended.");

    }
}
