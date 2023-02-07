public class Main {
    public static void main(String[] args) {
        Avaliador<Avaliavel> guiaGenerico = new Avaliador("Guia");
        Hotel rioHotel = new Hotel("rioHotel");
        Carro calhambeque = new Carro("calhambeque");

        guiaGenerico.avaliar(rioHotel);
        guiaGenerico.avaliar(calhambeque);

        Avaliador<Carro> guiaQuatroRodas = new Avaliador<>("Quatro Rodas");
        // guiaQuatroRodas.avaliar(rioHotel);
        guiaQuatroRodas.avaliar(calhambeque);
    }
}