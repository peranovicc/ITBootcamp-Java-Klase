package TestKlase;

import java.util.ArrayList;
import java.util.List;

public class Plejlista {
    String naziv;
    List<Pesma> pesme;

    public Plejlista(String naziv, List<Pesma> pesme) {
        if (naziv.length() < 3) {
            this.naziv = "NEPOZNATO";
            System.out.println("Nevalidan naziv za plejlistu");
        } else this.naziv = naziv;
        this.pesme = pesme;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv.length() < 3) {
            System.out.println("Nevalidan naziv za plejlistu");
        } else this.naziv = naziv;
    }

    public List<Pesma> getPesme() {
        return pesme;
    }

    public void setPesme(ArrayList<Pesma> pesme) {
        this.pesme = pesme;
    }

    public void dodaj(Pesma p){
        boolean vecPostoji = false;

        for(int i = 0; i < pesme.size(); i++){
            if (pesme.get(i).getNaziv().equals(p.getNaziv())) {
                vecPostoji = true;
            }
        }

        if(vecPostoji) return;

        pesme.add(p);
    }

    public void ukloni(String naziv){
        for(int i = 0; i < pesme.size(); i++){
            if(pesme.get(i).getNaziv().equals(naziv)){
                pesme.remove(i);
                break;
            }
        }
    }

    public Pesma najduzaPesma(){
        Pesma najduza = pesme.get(0);
        for(Pesma pesma : pesme){
            if(najduza.getTrajanje() < pesma.getTrajanje()){
                najduza = pesma;
            }
        }
        return najduza;
    }

    public Pesma najkracaPesma(){
        Pesma najkraca = pesme.get(0);
        for(Pesma pesma : pesme){
            if(najkraca.getTrajanje() > pesma.getTrajanje()){
                najkraca = pesma;
            }
        }
        return najkraca;
    }

    public int duzinaPlejliste(){
        int zbir = 0;
        for(Pesma p: pesme){
            zbir += p.getTrajanje();
        }
        return zbir;
    }

    public double prosecnaDuzina(){
        return (double)duzinaPlejliste() / pesme.size();
    }

    public ArrayList<Pesma> kratkePesme(){
        ArrayList<Pesma> kratke = new ArrayList<>();
        for(Pesma p: pesme){
            if(p.getTrajanje() < 180){
                kratke.add(p);
            }
        }
        return kratke;
    }

    @Override
    public String toString() {
        String rez = "Plejlista: " + naziv + "\n";
        int ukupno = duzinaPlejliste();
        int sati = ukupno / 60 / 60;
        int minuti = (ukupno / 60) - (sati * 60);
        int sekunde = ukupno - (sati * 60 * 60) - (minuti * 60);

        rez += "Ukupna duzina: " + sati + ":" + minuti + ":" + sekunde + "\n";

        for(Pesma p : pesme){
            rez = rez.concat(p + "\n");
        }

        return rez;
    }
}
