package Picerija;

public class Pizza {
    // cena, naziv, velicina
    private double cena;
    private int velicina;
    private String naziv;

    public double getCena() {
        return cena;
    }

    public int getVelicina() {
        return velicina;
    }

    public String getNaziv() {
        return naziv;
    }

    public Pizza(double cena, int velicina, String naziv){
        this.cena = cena;
        this.velicina = velicina;
        this.naziv = naziv;
    }

    public void ispisi(){
        System.out.println(this.getNaziv() + " " + this.getCena());
    }
}
