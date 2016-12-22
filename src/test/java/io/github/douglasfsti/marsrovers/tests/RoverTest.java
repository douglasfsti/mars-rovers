package io.github.douglasfsti.marsrovers.tests;

import io.github.douglasfsti.marsrovers.controllers.RoverController;
import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Coordinate;
import io.github.douglasfsti.marsrovers.entities.Plateau;
import io.github.douglasfsti.marsrovers.entities.Rover;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoverTest {

    public RoverTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldReturn13NWhenCommandIsLMLMLMLMMAndPositionIs12NAndPlateaus55() {
        Rover rover = new Rover(CardinalPoint.N, new Coordinate(1, 2));
        Plateau plateau = new Plateau(new Coordinate(5, 5));

        RoverController roverController = new RoverController(rover, plateau);

        assertEquals("1 3 N", roverController.explore("LMLMLMLMM"));
    }

    @Test
    public void shouldReturn51EWhenCommandIsMMRMMRMRRMAndPositionIs33EAndPlateaus55() {
        Rover rover = new Rover(CardinalPoint.E, new Coordinate(3, 3));
        Plateau plateau = new Plateau(new Coordinate(5, 5));

        RoverController roverController = new RoverController(rover, plateau);

        assertEquals("5 1 E", roverController.explore("MMRMMRMRRM"));
    }
}
