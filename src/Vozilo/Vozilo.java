package Vozilo;

public class Vozilo {
    private String id;
    private String naziv;
    private int godProiz;
    private String regTablice;
    private double kilometraza;

    public Vozilo(String id, String naziv, int godProiz, String regTablice, double kilometraza) {
        this.id = id;
        this.naziv = naziv;
        this.godProiz = godProiz;
        this.regTablice = regTablice;
        this.kilometraza = kilometraza;
    }

    public String ispis(){
        return "Vozilo: " + naziv + " proizvedeno: " + godProiz + " | preslo: " + kilometraza;
    }
}

// Vozilo
// id
// naziv
// godProiz
// regTablice
// kilometraza

// metoda koja vraca string u sl. obliku:
// Vozilo: {naziv} proizvedeno: {godProiz} | preslo: {kilometraza}

