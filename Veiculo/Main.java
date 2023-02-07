public class Main {
    public static void main(String args[]){
        Veiculo v1 = new Veiculo("honda", "fit", "kadu", 10, 5);
        v1.abastecerTanque(10);
        System.out.println("antes");
        System.out.println(v1.lerTanqueAtual());
        System.out.println(v1.lerRodagem());
        v1.fazerViagem(5);
        System.out.println("depois");
        System.out.println(v1.lerTanqueAtual());
        System.out.println(v1.lerRodagem());

    }
}
