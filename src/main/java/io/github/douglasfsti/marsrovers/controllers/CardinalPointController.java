package io.github.douglasfsti.marsrovers.controllers;

import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Command;

public class CardinalPointController {

    public CardinalPoint getCardinalByCommand(CardinalPoint cardinal, Command cmd) {
        if (Command.M == cmd) {
            return cardinal;
        }

        int idNewCardinal = cmd == Command.R ? cardinal.getId() + 1 : cardinal.getId() - 1;

        if (idNewCardinal < 1) {
            idNewCardinal += 4;
        } else if (idNewCardinal > 4) {
            idNewCardinal -= 4;
        }

        for (CardinalPoint c : CardinalPoint.values()) {
            if (c.getId() == idNewCardinal) {
                cardinal = c;
            }
        }

        return cardinal;
    }
}
