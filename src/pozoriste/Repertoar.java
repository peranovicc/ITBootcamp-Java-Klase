package pozoriste;

import java.util.LinkedList;
import java.util.List;

public class Repertoar {
    private Pozoriste pozoriste;
    private List<Predstava> predstave;

    public Repertoar(Pozoriste pozoriste) {
        this.pozoriste = pozoriste;
        predstave = new LinkedList<>();
    }
}
