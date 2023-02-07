public class Carro implements Avaliavel {
    private int contAvaliacoesRecebidas;
    private String nome;

    public Carro(String nome){
        this.nome = nome;
        this.contAvaliacoesRecebidas = 0;
    }

    @Override
    public void receberAvaliacao(Avaliador avaliador, int nota){
        this.contAvaliacoesRecebidas++;
    }
}
