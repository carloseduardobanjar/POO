public class ItemHistorico {
    private Disciplina disciplina;
    private float nota;

    public ItemHistorico(Disciplina disciplina, float nota){
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }
    public float getNota(){
        return this.nota;
    }

}
