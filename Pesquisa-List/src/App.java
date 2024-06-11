public class App {
    public static void main(String[] args) throws Exception {

        SomarNumerosInteiros listaNumerosInteiros = new SomarNumerosInteiros();

        listaNumerosInteiros.exibirNumeros();
        listaNumerosInteiros.adicionarNumero(2);
        listaNumerosInteiros.adicionarNumero(3);
        listaNumerosInteiros.adicionarNumero(7);
        listaNumerosInteiros.adicionarNumero(-4);
        listaNumerosInteiros.adicionarNumero(1);
        listaNumerosInteiros.adicionarNumero(5);
        System.out.println("Soma dos números: " + listaNumerosInteiros.calcularSoma());
        System.out.println("Maior númerdo da lista: " + listaNumerosInteiros.encontrarMaiorNumero());
        System.out.println("Menor número da lista: " + listaNumerosInteiros.encontrarMenorNumero());
    }
}
