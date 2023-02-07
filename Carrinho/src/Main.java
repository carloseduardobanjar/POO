public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Carro");
        p1.setPreco(10);
        Produto p2 = new Produto(2, "Moto");
        p2.setPreco(20);
        Produto p3 = new Produto(3, "Bike");
        p3.setPreco(30);
        Carrinho c1 = new Carrinho();
        c1.adicionarProduto(p1, 1);
        c1.adicionarProduto(p2, 2);
        c1.adicionarProduto(p3, 3);
        System.out.println(c1.toString());
    }
}