package io.github.douglasfsti.marsrovers.entities;

public enum CardinalPoint {
    N(1, "NORTH"),
    E(2, "EAST"),
    S(3, "SOUTH"),
    W(4, "WEST");

    private int id;
    private String label;

    private CardinalPoint(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public int getId() {
        return this.id;
    }

    public static CardinalPoint getCardinal(String cardinal) {
        for (CardinalPoint cardinalPoint : CardinalPoint.values()) {
            if (cardinalPoint.getLabel().startsWith(cardinal.toUpperCase())) {
                return cardinalPoint;
            }
        }

        throw new EnumConstantNotPresentException(CardinalPoint.class, cardinal);
    }
}
