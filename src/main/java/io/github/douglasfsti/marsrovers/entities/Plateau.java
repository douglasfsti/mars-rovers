package io.github.douglasfsti.marsrovers.entities;

public class Plateau {

    private Coordinate coordinate;

    public Plateau() {
    }

    public Plateau(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getSize() {
        return this.coordinate.getX() - 1;
    }
}
