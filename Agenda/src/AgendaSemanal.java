import java.util.ArrayList;
import java.util.HashMap;

public class AgendaSemanal {
    HashMap<diaTurno, ArrayList<Compromisso>> agenda;

    public AgendaSemanal(){
        agenda = new HashMap<>();
    }

    public void marcarCompromissos(diaDaSemana diaDaSemana, Turno turno, Compromisso compromisso) throws LimiteExcedidoException{

        diaTurno dt = new diaTurno(diaDaSemana, turno);
        ArrayList<Compromisso> compromissosPorDiaTurno = agenda.get(dt);

        if(compromissosPorDiaTurno != null && compromissosPorDiaTurno.size() >= turno.getMaxCompromissos()){
            throw new LimiteExcedidoException();
        }

        if(compromissosPorDiaTurno == null){
            compromissosPorDiaTurno = new ArrayList<>();
            agenda.put(dt, compromissosPorDiaTurno);
        }
        compromissosPorDiaTurno.add(compromisso);
    }

    public ArrayList<Compromisso> recuperarCompromissos(Turno turno, diaDaSemana diaDaSemana){
        diaTurno dt = new diaTurno(diaDaSemana, turno);
        ArrayList<Compromisso> listaCompromisso;
        listaCompromisso = agenda.get(dt);
        return listaCompromisso;
    }

    public Turno obterTurnoMaisCheio(){
        int contadores[] = { 0, 0, 0 };
        for(ArrayList<Compromisso> lista : agenda.values())
            for(Compromisso c : lista){
                Turno turno = c.getTurno();
                contadores[turno.ordinal()] ++;
            }
        int maior = 0;
        Turno turnoMaisCheio = null;
        for(int i = 0; i < 3; i++){
            if(contadores[i] > maior){
                maior = contadores[i];
                turnoMaisCheio = Turno.values()[i];
            }
        }
        return turnoMaisCheio;
    }

}
