import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int dre;
    private float cra;
    private int creditos;
    private ArrayList<ItemHistorico> itens;

    public Aluno(String nome, String cpf, int dre){
        super(nome, cpf);
        this.dre = dre;
        itens = new ArrayList<>();
    }

    public void lancarDisciplinaCursada(Disciplina disciplina, float nota){
        ItemHistorico novoItem = new ItemHistorico(disciplina, nota);
        itens.add(novoItem);
    }

    public float getDre(){
        return this.dre;
    }

    public int getCreditos(){ return this.creditos; }

    public float getCra(){ return this.cra; }

    public void setCra() {
        float soma = 0;
        int totalCreditos = 0;
        for(ItemHistorico item : itens){
            soma += (item.getNota() * item.getDisciplina().getCreditos());
            totalCreditos += item.getDisciplina().getCreditos();
        }
        this.cra = soma / totalCreditos;
    }

    public void setCreditos(int creditos) {this.creditos = creditos; }

    public float getNota(Disciplina disciplina){
        for(ItemHistorico item : itens){
            if(item.getDisciplina().equals(disciplina)){
                return item.getNota();
            }
        }
        return -1;
    }
}
