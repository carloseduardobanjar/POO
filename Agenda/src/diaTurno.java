import java.util.*;

public class diaTurno {
    private diaDaSemana diaDaSemana;
    private Turno turno;

    public diaTurno(diaDaSemana diaDaSemana, Turno turno){
        this.diaDaSemana = diaDaSemana;
        this.turno = turno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        diaTurno diaETurno = (diaTurno) o;
        return diaDaSemana == diaETurno.diaDaSemana &&
                turno == diaETurno.turno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diaDaSemana, turno);
    }

}
