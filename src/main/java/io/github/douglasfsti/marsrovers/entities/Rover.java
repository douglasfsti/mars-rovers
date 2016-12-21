package io.github.douglasfsti.marsrovers.entities;

public class Rover {

    private CardinalPoint cardinal;
    private Coordinate coordinate;

    public Rover(CardinalPoint cardinal, Coordinate coordinate) {
        this.cardinal = cardinal;
        this.coordinate = coordinate;
    }

    public Rover() {
        this.cardinal = CardinalPoint.N;
        this.coordinate = new Coordinate(0, 0);
    }

    public String getPosition() {
        return String.format("%d %d %s", this.coordinate.getX(),
                this.coordinate.getY(),
                this.cardinal.toString());
    }

    public CardinalPoint getCardinal() {
        return cardinal;
    }

    public void setCardinal(CardinalPoint cardinal) {
        this.cardinal = cardinal;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
