import java.util.ArrayList;
public class Jogador {
    private String username;
    private String senha;
    private int score;
    private ArrayList<Partida> partidas;
    private boolean onOff;
    private boolean situacao;

    public Jogador(String username, String senha){
        partidas = new ArrayList<>();
        this.username = username;
        this.senha = senha;
        this.score = 1000;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }

    public boolean getSituacao(){
        return this.situacao;
    }

    public void setSituacao(boolean situacao){
        this.situacao = situacao;
    }

    public void adicionaPartida(Partida p){
        partidas.add(p);
    }

    public String getPartida(){
        StringBuilder str = new StringBuilder();
        for(Partida partida : partidas){
            str.append(partida.getUsarname1()).append(" x ").append(partida.getUsarname2());
        }
        return str.toString();
    }

    public void setScore(int score){
        this.score += score;
    }

    public int getScore(){
        return this.score;
    }

}
