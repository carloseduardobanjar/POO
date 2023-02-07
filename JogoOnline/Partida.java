public class Partida {
    private String username1, username2;
    private int resultado;
    public Partida(String username1, String username2){
        this.username1 = username1;
        this.username2 = username2;
    }

    public int getResultado(){
        return this.resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }

    public String getUsarname1(){
        return this.username1;
    }

    public String getUsarname2(){
        return this.username2;
    }
}
