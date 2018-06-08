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

            System.out.println("Server = 1");
            System.out.println("Receiver = 2");
            System.out.println("Please enter the player that wins the point:");
            scorer = keyboard.nextLine();

            if ("1".equals(scorer)) {
                server.scored();
            } else if ("2".equals(scorer)) {
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
