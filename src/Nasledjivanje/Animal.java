package Nasledjivanje;

public class Animal {
    private String name;
    private int lifeSpan;

    public Animal(String name, int lifeSpan) {
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

    public void eats(){
        System.out.println("Food");
    }

    public void movement(){
        System.out.println("Moves");
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
