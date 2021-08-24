package pozoriste;

import java.util.LinkedList;
import java.util.List;

public class Predstava {
    private String naziv;
    private Pozoriste pozoriste;
    private List<Zaposleni> zaposleni;

    public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj){
        this.naziv = naziv;
        this.pozoriste = pozoriste;
        this.zaposleni = new LinkedList<>();
        this.zaposleni.add(reditelj);
    }

    // TODO: dodaj(Glumac glumac) - boolean
    // TODO: dodaj(Kostimograf k) - boolean


    public String getNaziv() {
        return naziv;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    // {naziv}:
    // {zaposleni1}
    // {zaposleni2}
    // ...
    // {zaposlenin}
    @Override
    public String toString() {
        return "";
    }
}
