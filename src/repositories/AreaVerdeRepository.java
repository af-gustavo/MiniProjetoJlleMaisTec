package repositories;

import java.util.ArrayList;
import models.AreaVerde;

public class AreaVerdeRepository {
    public static final ArrayList<AreaVerde> AREAVERDE = new ArrayList<>();

    public void salvar (AreaVerde novaAreaVerde) {
        novaAreaVerde.setId(AREAVERDE.size() + 1);
        AREAVERDE.add(novaAreaVerde);
    }

    public AreaVerde buscar(int id) {
        return AREAVERDE.get(id);
    }

    public int size() {
        return AREAVERDE.size();
    }
}
