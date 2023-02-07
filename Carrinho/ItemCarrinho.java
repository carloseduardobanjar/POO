public class ItemCarrinho {
    public Produto produto;
    public int qtde;
    public ItemCarrinho(Produto produto, int qtde){
        this.produto = produto;
        this.qtde = qtde;
    }

    public float getPrecoItem(){
        return produto.getPreco() * qtde;
    }
}
