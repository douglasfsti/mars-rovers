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
import io.github.douglasfsti.marsrovers.entities.Coordinate;
import io.github.douglasfsti.marsrovers.entities.Plateau;

public class CardinalPointTest {

    CardinalPointController cardinal;
    Plateau plateau;

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
        this.plateau = new Plateau(new Coordinate(5, 5));
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldReturnNorthWhenCardinalIsNorthAndCommandIsMove() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.N, Command.M, plateau);

        assertEquals(CardinalPoint.N, response);
    }

    @Test
    public void shouldReturnWestWhenCardinalIsNorthAndCommandIsLeft() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.N, Command.L, plateau);

        assertEquals(CardinalPoint.W, response);
    }

    @Test
    public void shouldReturnWestWhenCardinalIsSouthAndCommandIsRight() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.S, Command.R, plateau);

        assertEquals(CardinalPoint.W, response);
    }

    @Test
    public void shouldReturnNorthWhenCardinalIsWestAndCommandIsRight() {
        CardinalPoint response = this.cardinal.getCardinalByCommand(CardinalPoint.W, Command.R, plateau);

        assertEquals(CardinalPoint.N, response);
    }
}
