package exercise4;

public class Main {
    public static void main(String[] args) {

        Vehicles mercedes = Vehicles.MERCEDES;
        Vehicles bmw = Vehicles.BMW;
        Vehicles audi = Vehicles.AUDI;

        System.out.println(mercedes.getColour());
        System.out.println(bmw.getColour());
        System.out.println(audi.getColour());

        System.out.println(mercedes.toString());
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
    }
}
