package repositories;

import java.util.ArrayList;
import models.Localizacao;

public class LocalizacaoRepository {
    private static final ArrayList<Localizacao> LOCALIZACAO = new ArrayList<>();

    public void salvar(Localizacao novaLocalizacao) {
        novaLocalizacao.setLocId(LOCALIZACAO.size() + 1);
        LOCALIZACAO.add(novaLocalizacao);
    }

    public Localizacao buscar(int id) {
        return LOCALIZACAO.get(id);
    }

    public int size() {
        return LOCALIZACAO.size();
    }
}
