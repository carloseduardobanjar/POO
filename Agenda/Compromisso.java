public class Compromisso {
    private Turno turno;
    private diaDaSemana diaDaSemana;
    private String descricao;

    public Compromisso(Turno turno, diaDaSemana diaDaSemana, String descricao){
        this.turno = turno;
        this.diaDaSemana = diaDaSemana;
        this.descricao = descricao;
    }
    public Turno getTurno() {
        return this.turno;
    }


}
