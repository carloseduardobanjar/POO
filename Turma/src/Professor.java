public class Professor extends Pessoa {
    private final int matricula;
    private String departamento;
    public Professor(String nome, String cpf, int matricula, String departamento){
        super(nome, cpf);
        this.matricula = matricula;
        this.departamento = departamento;
    }

}
