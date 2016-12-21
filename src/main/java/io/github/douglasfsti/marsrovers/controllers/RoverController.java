package io.github.douglasfsti.marsrovers.controllers;

import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Command;
import io.github.douglasfsti.marsrovers.entities.Rover;

public class RoverController {

    private Rover rover;
    private CardinalPointController cardinalPointController;

    public RoverController(Rover rover) {
        this.rover = rover;
        this.cardinalPointController = new CardinalPointController();
    }

    private void move(Command cmd) {
        if (cmd == Command.M) {
            if (this.rover.getCardinal().equals(CardinalPoint.N)) {
                this.rover.getCoordinate().setY(this.rover.getCoordinate().getY() + 1);
            } else if (this.rover.getCardinal().equals(CardinalPoint.E)) {
                this.rover.getCoordinate().setX(this.rover.getCoordinate().getX() + 1);
            } else if (this.rover.getCardinal().equals(CardinalPoint.S)) {
                this.rover.getCoordinate().setY(this.rover.getCoordinate().getY() - 1);
            } else if (this.rover.getCardinal().equals(CardinalPoint.W)) {
                this.rover.getCoordinate().setX(this.rover.getCoordinate().getX() - 1);
            }
        }
    }

    private void rotate(Command cmd) {
        if (cmd != Command.M) {
            this.rover.setCardinal(this.cardinalPointController
                    .getCardinalByCommand(this.rover.getCardinal(), cmd));
        }
    }

    public void explore(String commands) {
        for (char cmd : commands.toCharArray()) {
            Command command = Command.getCommand(cmd + "");
            rotate(command);
            move(command);
        }

        System.out.println(rover.getPosition());
    }

}
