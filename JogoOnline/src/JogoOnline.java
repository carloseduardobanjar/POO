import java.util.ArrayList;
import java.util.Random;

public class JogoOnline {
    private ArrayList<Jogador> jogadores;
    public JogoOnline(){
        jogadores = new ArrayList<>();
    }
    public void cadastraJogador(Jogador novoJogador){
        jogadores.add(novoJogador);
    }

    public void login(String username, String senha){
        for(Jogador jogador : jogadores){
            if(jogador.getUsername().equals(username)){
                if(jogador.getSenha().equals(senha))
                    jogador.setOnOff(true);
            }
        }
    }
    public void logout(String username, String senha){
        for(Jogador jogador : jogadores){
            if(jogador.getUsername().equals(username)){
                if(jogador.getSenha().equals(senha))
                    jogador.setOnOff(false);
            }
        }
    }

    public Partida iniciarPartida(String username1, String username2){
        Partida p = null;
        for(Jogador jogador1 : jogadores)
            if(jogador1.getUsername().equals(username1))
                if(jogador1.getOnOff() && !jogador1.getSituacao())
                    for(Jogador jogador2 : jogadores)
                        if(jogador2.getUsername().equals(username2))
                            if(jogador2.getOnOff() && !jogador2.getSituacao()){
                                jogador2.setSituacao(true);
                                jogador1.setSituacao(true);
                                p = new Partida(username1, username2);
                            }
        return p;
    }

    public Jogador escolherAdversario(String username) {
        while (true) {
            Random random = new Random();
            int intervalo_randomico = random.nextInt(jogadores.size());
            if (jogadores.get(intervalo_randomico).getOnOff() && !jogadores.get(intervalo_randomico).getSituacao() && !jogadores.get(intervalo_randomico).getUsername().equals(username)) {
                return jogadores.get(intervalo_randomico);
            }
        }
    }

    public void encerrarPartida(Partida p, int resultado){
        p.setResultado(resultado);
        for(Jogador jogador1 : jogadores){
            if(jogador1.getUsername().equals(p.getUsarname1())){
                jogador1.setSituacao(false);
                jogador1.adicionaPartida(p);
                if(resultado == 1){
                    jogador1.setScore(1);
                }
                else{
                    if(resultado == 2){
                        jogador1.setScore(-1);
                    }
                }
            }

        }
        for(Jogador jogador2 : jogadores){
            if(jogador2.getUsername().equals(p.getUsarname2())){
                jogador2.setSituacao(false);
                jogador2.adicionaPartida(p);
                if(resultado == 1){
                    jogador2.setScore(-1);
                }
                else{
                    if(resultado == 2){
                        jogador2.setScore(1);
                    }
                }
            }
        }
    }
}
