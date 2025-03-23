package models;

import repositories.AvaliacaoRepository;

public class AreaVerde {

    private int id;
    private String nome;
    private String tipoVegetacao;
    private String horario;
    private String atividades;
    private Localizacao localizacao;

    AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();

    public AreaVerde() {
    }

    public String toStringListagem(AvaliacaoRepository avaliacaoRepository) {
        return String.format("Nome: %s%nTipo de vegetação: %s%nMédia avaliações: %s%n",
                this.nome, this.tipoVegetacao, this.mediaAvaliacoes(avaliacaoRepository));
    }

    public String toStringDetalhes(AvaliacaoRepository avaliacaoRepository) {
        return String.format("ID: %d%nNome: %s%nTipo de vegetação: %s%nHorário de functionamento: %s%nAtividades: %s%nLocalização: %s%nMédia avaliações: %s%n",
                this.id, this.nome, this.tipoVegetacao, this.horario, this.atividades, this.localizacao.getCoordenadas(),  this.mediaAvaliacoes(avaliacaoRepository));
    }

    public void setId(int novoId) {
        this.id = novoId;
    }

    public int getId() {
        return id;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipoVegetacao(String novoTipoVegetacao) {
        this.tipoVegetacao = novoTipoVegetacao;
    }

    public String getTipoVegetacao() {
        return this.tipoVegetacao;
    }

    public void setLocalizacao(Localizacao novaLocalizacao) {
        this.localizacao = novaLocalizacao;
    }

    public Localizacao getLocalizacao() {
        return this.localizacao;
    }

    public void setHorario(String novoHorario) {
        this.horario = novoHorario;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setAtividades(String novasAtividades) {
        this.atividades = novasAtividades;
    }

    public String getAtividades() {
        return this.atividades;
    }

    public Double mediaAvaliacoes(AvaliacaoRepository avaliacaoRepository) {
        Double mediaNominador = 0.0;
        int mediaDenominador = 0;

        if (avaliacaoRepository.size() == 0) {
            return 0.0;
        } else {
            for (int i = 0; i < avaliacaoRepository.size(); i++) {
                if (avaliacaoRepository.buscar(i).getIdentificador() == this.id) {
                    mediaNominador += avaliacaoRepository.buscar(i).getMedia();
                    mediaDenominador++;
                }
            }
    
            return mediaNominador / mediaDenominador;
        }
        
    }
}
