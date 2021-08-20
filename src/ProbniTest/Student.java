package ProbniTest;

import java.util.ArrayList;

public class Student {
    private String indeks;
    private String ime;
    private String prezime;
    private ArrayList<Ocena> ocene;

    public Student(String indeks, String ime, String prezime, ArrayList<Ocena> ocene) {
        this.indeks = indeks;
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public String getIndeks() {
        return indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Ocena> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Ocena> ocene) {
        this.ocene = ocene;
    }

    public double prosekOcena(){
        int zbir = 0;
        for(Ocena ocena : ocene){
            zbir += ocena.getVrednost();
        }
        return (double)zbir / ocene.size();
    }

    public Ocena najvecaOcena(){
        Ocena max = ocene.get(0);
        for(int i = 0; i < ocene.size(); i++){
            if(ocene.get(i).getVrednost() > max.getVrednost()){
                max = ocene.get(i);
            }
        }
        return max;
    }

    public ArrayList<Ocena> nepolozeniPredmeti(){
        ArrayList<Ocena> fail = new ArrayList<>();
        for(Ocena ocena: ocene){
            if(ocena.getVrednost() == 5){
                fail.add(ocena);
            }
        }
        return fail;
    }

    // Student: Pera
    // Predmet: Programiranje | Ocena: 6
    // Predmet: OOP | Ocena: 5
    // Predmet: SQL | Ocena: 7
    @Override
    public String toString() {
        String rez = "Student: " + ime + "\n";
        for(Ocena x: ocene){
            rez = rez.concat(x.toString() + "\n");
        }
        return rez;
    }
}
