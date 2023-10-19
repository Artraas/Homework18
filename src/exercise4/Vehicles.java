package exercise4;

enum Vehicles {
    MERCEDES(10000, "White"),
    BMW(9000, "Black"),
    AUDI(11000, "Grey");
    int cost;
    String colour;

    Vehicles(int cost, String colour) {
        this.cost = cost;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return name() + " " +
                "cost=" + cost +
                ", colour='" + colour + '\'' +
                '}';
    }
}
