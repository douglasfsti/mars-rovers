package io.github.douglasfsti.marsrovers.main;

import io.github.douglasfsti.marsrovers.controllers.RoverController;
import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Coordinate;
import io.github.douglasfsti.marsrovers.entities.Plateau;
import io.github.douglasfsti.marsrovers.entities.Rover;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scannerStdin = new Scanner(System.in);

        Plateau plateau = new Plateau(new Coordinate(scannerStdin.nextInt(),
                scannerStdin.nextInt()));

        while (scannerStdin.hasNext()) {
            int x = scannerStdin.nextInt();
            int y = scannerStdin.nextInt();
            String cardinal = scannerStdin.next();
            String command = scannerStdin.next();

            Rover rover = new Rover(CardinalPoint.getCardinal(cardinal),
                    new Coordinate(x, y));

            RoverController roverController = new RoverController(rover, plateau);
            System.out.println(roverController.explore(command));
        }
    }
}
