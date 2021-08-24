package pozoriste;

public class Pozoriste {
    private static int next_id = 0;
    private int id;
    private String naziv;

    public Pozoriste(String naziv) {
        this.id = next_id++;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return "Pozoriste{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                '}';
    }

    // Jugoslovensko dramsko pozoriste -> JDP
    // TODO: Метода getSkraceniNaziv()
}
