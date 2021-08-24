package Nasledjivanje;

public class Bird extends Animal  {
    private double wingSpan;

    public Bird(int lifeSpan, double wingSpan,String name) {
        super(name, lifeSpan);
        this.wingSpan = wingSpan;
    }

    @Override
    public void eats(){
        System.out.println("Worms");
    }

    @Override
    public void movement() {
        System.out.println("Flies");
    }

    @Override
    public String toString() {
        String rez = super.toString() + "\n";
        rez = rez.concat("Species: Bird\n");
        rez = rez.concat("Wingspan: " + wingSpan);
        return rez;
    }
}
