public class Main {
    public static void main(String[] args) {
        JogoOnline jogo =  new JogoOnline();
        Jogador j1 = new Jogador("Kadu", "123");
        Jogador j2 = new Jogador("Paulo", "456");
        Jogador j3 = new Jogador("Fatima", "789");
        jogo.cadastraJogador(j1);
        jogo.cadastraJogador(j2);
        jogo.cadastraJogador(j3);
        jogo.login("Kadu", "123");
        jogo.login("Paulo", "456");
        jogo.login("Fatima", "789");
        System.out.println(jogo.escolherAdversario("Kadu").getUsername());
        System.out.println(j1.getUsername() + ">" + j1.getSituacao() + ">" + j1.getScore() + ">" + j1.getPartida());
        System.out.println(j2.getUsername() + ">" + j2.getSituacao() + ">" + j2.getScore() + ">" + j2.getPartida());
        System.out.println(j3.getUsername() + ">" + j3.getSituacao() + ">" + j3.getScore() + ">" + j3.getPartida());
        System.out.println("-------------------------------------------------------------------------------");
        Partida p = jogo.iniciarPartida("Kadu", "Fatima");
        jogo.encerrarPartida(p, 0);
        System.out.println(j1.getUsername() + ">" + j1.getSituacao() + ">" + j1.getScore() + ">" + j1.getPartida());
        System.out.println(j2.getUsername() + ">" + j2.getSituacao() + ">" + j2.getScore() + ">" + j2.getPartida());
        System.out.println(j3.getUsername() + ">" + j3.getSituacao() + ">" + j3.getScore() + ">" + j3.getPartida());
        System.out.println("-------------------------------------------------------------------------------");
        Partida p1 = jogo.iniciarPartida("Paulo", "Fatima");
        jogo.encerrarPartida(p1, 1);
        System.out.println(j1.getUsername() + ">" + j1.getSituacao() + ">" + j1.getScore() + ">" + j1.getPartida());
        System.out.println(j2.getUsername() + ">" + j2.getSituacao() + ">" + j2.getScore() + ">" + j2.getPartida());
        System.out.println(j3.getUsername() + ">" + j3.getSituacao() + ">" + j3.getScore() + ">" + j3.getPartida());
    }
}