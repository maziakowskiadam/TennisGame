package pl.maziakowskiadam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("Player");
    }

    @Test
    public void testForScored() {
        for (int i = 0; i < 3; i++) {
            player.scored();
        }

        assertEquals(player.getScore(), 3);

    }

    @Test
    public void testForScoreString(){
        player.scored();
        player.scored();

        assertEquals(player.scoreString(), "30");
    }
}