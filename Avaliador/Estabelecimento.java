import java.util.ArrayList;

public abstract class Estabelecimento implements Avaliavel {
    private String nome;
    private ArrayList<AvaliacaoRecebida> avaliacoes;

    public Estabelecimento(String nome){
        this.nome = nome;
        this.avaliacoes = new ArrayList<>();
    }

    public String getTipo(){
        return getClass().getName();
    }

    public void receberAvaliacao(Avaliador avaliador, int nota){
        AvaliacaoRecebida avRecebida = new AvaliacaoRecebida(avaliador, nota);
        avaliacoes.add(avRecebida);
    }

    public float getMediaAvaliacoes(){
        float soma = 0;
        int cont = 0;
        for(AvaliacaoRecebida av : avaliacoes){
            soma += av.getNota();
            cont++;
        }
        return soma / cont;
    }

    public int getAvaliacaoMaisRecente(){
        return avaliacoes.get(avaliacoes.size() - 1).getNota();
    }

    public String getNomeMelhorAvaliador(){
        int maior = avaliacoes.get(0).getNota();
        String melhorAvaliador = null;
        for(AvaliacaoRecebida av : avaliacoes){
            if(av.getNota() > maior){
                melhorAvaliador = av.getNome();
                maior = av.getNota();
            }
        }
        return melhorAvaliador;
    }
}
