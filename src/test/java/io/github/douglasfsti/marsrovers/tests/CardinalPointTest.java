package io.github.douglasfsti.marsrovers.tests;

import io.github.douglasfsti.marsrovers.controllers.CardinalPointController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Command;

public class CardinalPointTest {

    CardinalPointController cardinal;

    public CardinalPointTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.cardinal = new CardinalPointController();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldReturnNorthWhenCardinalIsNorthAndCommandIsMove() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.N, Command.M);

        assertEquals(CardinalPoint.N, response);
    }

    @Test
    public void shouldReturnWestWhenCardinalIsNorthAndCommandIsLeft() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.N, Command.L);

        assertEquals(CardinalPoint.W, response);
    }

    @Test
    public void shouldReturnWestWhenCardinalIsSouthAndCommandIsRight() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.S, Command.R);

        assertEquals(CardinalPoint.W, response);
    }

    @Test
    public void shouldReturnNorthWhenCardinalIsWestAndCommandIsRight() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.W, Command.R);

        assertEquals(CardinalPoint.N, response);
    }
}
