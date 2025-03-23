package models;

public class Avaliacao extends AreaVerde {

    private int avId;
    private int qtdArvores;
    private int qualiAr;
    private int poluicaoSonora;
    private int coletaResiduos;
    private int transPublico;
    private int identificador;

    @Override
    public String toString() {
        return String.format("ID: %d%nQuantidade de árvores: %d%nQualidade do ar: %d%nPoluição sonora: %d%nColeta de resíduos: %d%nTransporte público: %d%nIdentificador: %d%n",
                this.avId, this.qtdArvores, this.qualiAr, this.poluicaoSonora, this.coletaResiduos, this.transPublico, this.identificador);
    }

    public void setAvId(int novoAvId) {
        this.avId = novoAvId;
    }

    public int getAvId() {
        return avId;
    }

    public void setQtdArvores(int notaQtdArvores) {
        this.qtdArvores = notaQtdArvores;
    }

    public int getQtdArvores() {
        return qtdArvores;
    }

    public void setQualiAr(int notaQualiAr) {
        this.qualiAr = notaQualiAr;
    }

    public int getQualiAr() {
        return qualiAr;
    }

    public void setPoluicaoSonora(int notaPoluicaoSonora) {
        this.poluicaoSonora = notaPoluicaoSonora;
    }

    public int getPoluicaoSonora() {
        return poluicaoSonora;
    }

    public void setColetaResiduos(int notaColetaResiduos) {
        this.coletaResiduos = notaColetaResiduos;
    }

    public int getColetaResiduos() {
        return coletaResiduos;
    }

    public void setTransPublico(int notaTransPublico) {
        this.transPublico = notaTransPublico;
    }

    public int getTransPublico() {
        return transPublico;
    }

    public void setIdentificador(int novoIdentificador) {
        this.identificador = novoIdentificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Double getMedia() {
        return (this.qtdArvores + this.qualiAr + this.poluicaoSonora + this.coletaResiduos + this.transPublico) / 5.0;
    }
}
