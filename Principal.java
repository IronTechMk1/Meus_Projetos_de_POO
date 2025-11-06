public class Principal {
    public static void main(String[] args) {

        lista lista1 = new lista();

        lista1.adicionarCanal(new Canal(5, "Globo"));
        lista1.adicionarCanal(new Canal(7, "Record"));
        lista1.adicionarCanal(new Canal(9, "SBT"));

        tv tv1 = new tv(101, lista1);
        controle ControleRemoto = new controle(tv1);
        // Testando a TV e o controle remoto
        tv1.LigaDesliga();
        ControleRemoto.LigaDesliga();

    }
}
