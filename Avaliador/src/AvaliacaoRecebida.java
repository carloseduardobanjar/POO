public class AvaliacaoRecebida {
    private Avaliador avaliador;
    private int nota;

    public AvaliacaoRecebida(Avaliador avaliador, int nota){
        this.avaliador = avaliador;
        this.nota = nota;
    }

    public int getNota(){
        return this.nota;
    }

    public String getNome(){
        return this.avaliador.getNome();
    }

}
