import java.util.ArrayList;
import java.util.List;

public class SomarNumerosInteiros {

    List<Integer> listaDeNumerosInteiros;

    public SomarNumerosInteiros() {
        listaDeNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer i : listaDeNumerosInteiros) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaDeNumerosInteiros.isEmpty()) {
            for (Integer i : listaDeNumerosInteiros) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("\n ** A lista está vazia **");
        }
    }

    public int encontrarMenorNumero() {
        int menorNUmero = Integer.MAX_VALUE;
        if (!listaDeNumerosInteiros.isEmpty()) {
            for (Integer i : listaDeNumerosInteiros) {
                if (i <= menorNUmero) {
                    menorNUmero = i;
                }
            }
            return menorNUmero;
        } else {
            throw new RuntimeException("\n ** A lista está vazia **");
        }
    }

    public void exibirNumeros() {
        System.out.println(this.listaDeNumerosInteiros);
    }
}
