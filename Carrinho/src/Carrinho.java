import java.util.ArrayList;

public class Carrinho {
    public ArrayList<ItemCarrinho> itens;
    public Carrinho(){
        this.itens = new ArrayList<ItemCarrinho>();
    }
    public void adicionarProduto(Produto produto, int qtde){
        ItemCarrinho item = new ItemCarrinho(produto, qtde);
        itens.add(item);
    }

    public float getPrecoTotal(){
        float total = 0;
        for(ItemCarrinho item : itens){
            total += item.getPrecoItem();
        }
        return total;
    }

    public String toString(){
        StringBuilder resultado = new StringBuilder();
        for(ItemCarrinho item : itens){
            if(item.qtde > 1)
                resultado.append(item.produto.getDescricao()).append('s');
            else
                resultado.append(item.produto.getDescricao());
            resultado.append(">").append(item.qtde).append(">").append(item.getPrecoItem()/item.qtde).append(">").append(item.getPrecoItem());
            resultado.append("\n");
        }
        resultado.append(getPrecoTotal());
        return resultado.toString();
    }
}
