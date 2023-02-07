public class Restaurante extends Estabelecimento {
    private String tipo;

    public Restaurante(String tipo, String nome){
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public String getTipo(){
        return this.tipo;
    }

}
