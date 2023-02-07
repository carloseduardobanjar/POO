import java.util.Scanner;

public class Avaliador<T extends Avaliavel> {
    private String nome;

    public Avaliador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void avaliar(T avaliavel){
        int n;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe uma nota:\n");
        n = ler.nextInt();
        avaliavel.receberAvaliacao(this, n);
    }
}
