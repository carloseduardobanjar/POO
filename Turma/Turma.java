import java.util.ArrayList;

public class Turma {
    private final Disciplina disciplina;
    private final int codigo;
    private String professor;
    private ArrayList<Aluno> alunos;
    public static final int NOTA_MINIMA_APROVACAO = 5;

    public Turma(int codigo, Disciplina disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
        alunos = new ArrayList<>();
    }

    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public float obterMediaDaTurma(){
        float soma = 0;
        int cont = 0;
        for(Aluno aluno : alunos){
            cont++;
            soma += aluno.getNota(disciplina);
        }
        return soma / cont;
    }

    public void atribuirNotaFinal(int dre, float nota){
        for(Aluno aluno : alunos){
            if(aluno.getDre() == dre){
                aluno.lancarDisciplinaCursada(disciplina, nota);
                if(nota > NOTA_MINIMA_APROVACAO){
                    aluno.setCreditos(disciplina.getCreditos() + aluno.getCreditos());
                }
                aluno.setCra();
            }
        }
    }
}
