package io.github.douglasfsti.marsrovers.controllers;

import io.github.douglasfsti.marsrovers.entities.CardinalPoint;
import io.github.douglasfsti.marsrovers.entities.Command;
import io.github.douglasfsti.marsrovers.entities.Plateau;

public class CardinalPointController {

    public CardinalPoint getCardinalByCommand(CardinalPoint cardinal,
            Command cmd, Plateau plateau) {
        if (Command.M == cmd) {
            return cardinal;
        }

        int idNewCardinal = cmd == Command.R ? cardinal.getId() + 1 : cardinal.getId() - 1;

        if (idNewCardinal < 1) {
            idNewCardinal += plateau.getSize();
        } else if (idNewCardinal > plateau.getSize()) {
            idNewCardinal -= plateau.getSize();
        }

        for (CardinalPoint c : CardinalPoint.values()) {
            if (c.getId() == idNewCardinal) {
                cardinal = c;
            }
        }

        return cardinal;
    }
}
