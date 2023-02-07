public class Disciplina {
    private String nome;
    private int codigo;
    private int creditos;
    public Disciplina(String nome, int codigo, int creditos){
        this.nome = nome;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    public int getCreditos(){
        return this.creditos;
    }

}
