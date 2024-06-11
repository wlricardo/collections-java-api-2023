public class App {
    public static void main(String[] args) throws Exception {

        OrdenarNumeros listaInteiros = new OrdenarNumeros();

        // listaInteiros.ordenarAscendente();
        // listaInteiros.exibirNumerosDaLista();
        listaInteiros.adicionarNumero(2);
        listaInteiros.adicionarNumero(1);
        listaInteiros.adicionarNumero(6);
        listaInteiros.adicionarNumero(0);
        listaInteiros.adicionarNumero(4);
        listaInteiros.adicionarNumero(3);
        listaInteiros.adicionarNumero(7);

        listaInteiros.exibirNumerosDaLista();
        System.err.println("---");
        System.out.println(listaInteiros.ordenarAscendente());
        System.err.println("---");
        System.out.println(listaInteiros.ordenarDescendente());
    }
}
