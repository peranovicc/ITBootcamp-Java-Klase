package Nasledjivanje;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal("Nesto",54);
        // a1.eats();
        // a1.movement();
        System.out.println(a1);
        Bird b1 = new Bird(20,96.4,"ImePtice");
        // b1.eats();
        System.out.println(b1);
    }
}
