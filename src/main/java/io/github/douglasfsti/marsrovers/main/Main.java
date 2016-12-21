package io.github.douglasfsti.marsrovers.main;

import io.github.douglasfsti.marsrovers.controllers.RoverController;
import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Coordinate;
import io.github.douglasfsti.marsrovers.entities.Rover;

public class Main {

    public static void main(String args[]) {
        // plateau 5,5
        // rover 1,2 N
        // command LMLMLMLMM

        // Rover rover = new Rover(CardinalPoint.N, new Coordinate(1, 2));

        // RoverController roverController = new RoverController(rover);
        // roverController.explore("LMLMLMLMM");
        
        // plateau 5,5
        // rover 3,3 E
        // command MMRMMRMRRM

        // Rover rover = new Rover(CardinalPoint.E, new Coordinate(3, 3));

        // RoverController roverController = new RoverController(rover);
        // roverController.explore("MMRMMRMRRM");
    }
}
