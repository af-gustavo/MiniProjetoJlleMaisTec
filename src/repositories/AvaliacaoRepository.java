package repositories;

import java.util.ArrayList;
import models.Avaliacao;

public class AvaliacaoRepository {
    private static final ArrayList<Avaliacao> AVALIACAO = new ArrayList<>();

    public void salvar(Avaliacao novaAvaliacao) {
        novaAvaliacao.setAvId(AVALIACAO.size() + 1);
        AVALIACAO.add(novaAvaliacao);
    }

    public Avaliacao buscar(int id) {
        return AVALIACAO.get(id);
    }

    public int size() {
        return AVALIACAO.size();
    }
}