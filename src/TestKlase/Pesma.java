package TestKlase;

public class Pesma {
    String naziv;
    String izvodjac;
    int trajanje;

    public Pesma(String naziv, String izvodjac, int trajanje) {
        this.naziv = naziv;
        if(izvodjac.length() < 3){
            this.izvodjac = "NEPOZNATO";
            System.out.println("Ime izvodjaca nije validno.");
        }
        else this.izvodjac = izvodjac;
        this.trajanje = trajanje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getIzvodjac() {
        return izvodjac;
    }

    public void setIzvodjac(String izvodjac) {
        if(izvodjac.length() < 3){
            System.out.println("Ime izvodjaca nije validno.");
        }
        else this.izvodjac = izvodjac;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    @Override
    public String toString() {
        int minuti = trajanje / 60;
        int sekunde = trajanje - (minuti * 60);
        return naziv + " | " + izvodjac + " | " + minuti + ":" + sekunde;
    }
}