public class Produto {
    private final int codigo;
    private String descricao;
    private float preco;
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        if(preco > 0)
            this.preco = preco;
    }
}
