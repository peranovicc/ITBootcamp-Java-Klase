package ProbniTest;

public class Ocena {
    private int vrednost;
    private String predmet;

    public Ocena(int vrednost, String predmet) {
        if(vrednost < 5 || vrednost > 10){
            this.vrednost = 5;
            System.out.println("Nevalidna vrednost, podrazumevana postavljena (5)");
        }
        else{
            this.vrednost = vrednost;
        }
        this.predmet = predmet;
    }

    public int getVrednost() {
        return vrednost;
    }

    public void setVrednost(int vrednost) {
        if(vrednost < 5 || vrednost > 10){
            System.out.println("Nevalidno, vrednost nije promenjena");
            return;
        }
        this.vrednost = vrednost;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    @Override
    public String toString() {
        return "Predmet: " + predmet + " | " + "Ocena: " + vrednost;
    }
}
