package pl.maziakowskiadam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Player server;
    Player receiver;
    Game tennisGame;

    @Before
    public void setUp() throws Exception {
        server = new Player("Server");
        receiver = new Player("Receiver");
        tennisGame = new Game(server, receiver);
    }

    @Test
    public void testForLoveAll() {
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "0 : 0");
    }

    @Test
    public void testForFifteenAll() {
        server.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "15 : 15");
    }

    @Test
    public void testForThirtyFifteen() {
        server.scored();
        server.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "30 : 15");
    }
    @Test
    public void testForThirtyAll() {
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "30 : 30");
    }
    @Test
    public void testForFortyThirty() {
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "40 : 30");
    }

    @Test
    public void testForDeuce() {
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "40 : 40");
    }

    @Test
    public void testForServerAdvantage() {
        server.scored();
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "A : 40");
    }

    @Test
    public void testForReceiverAdvantage() {
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "40 : A");
    }

    @Test
    public void testForDeuceAfterAdvantage() {
        receiver.scored();
        receiver.scored();
        receiver.scored();
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        server.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "40 : 40");
    }

    @Test
    public void testForServerWin() {
        server.scored();
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "Server won!");
    }

    @Test
    public void testForReceiverWin() {
        receiver.scored();
        receiver.scored();
        receiver.scored();
        receiver.scored();
        server.scored();
        server.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "Receiver won!");
    }

    @Test
    public void testForWinAfterAdvantage() {
        receiver.scored();
        receiver.scored();
        receiver.scored();
        server.scored();
        server.scored();
        server.scored();
        receiver.scored();
        receiver.scored();
        String gameScore;
        gameScore = tennisGame.getScore();
        assertEquals(gameScore, "Receiver won!");

    }
}