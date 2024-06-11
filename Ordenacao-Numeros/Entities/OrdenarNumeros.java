import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumeros {

    private List<Integer> listaDeNumeros;

    public OrdenarNumeros() {
        listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemCrescente = new ArrayList<>(this.listaDeNumeros);

        if (!ordemCrescente.isEmpty()) {
            Collections.sort(ordemCrescente);
            return ordemCrescente;
        } else {
            throw new RuntimeException("\n ** A lista está vazia **");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDecrescente = new ArrayList<>(this.listaDeNumeros);

        if (!ordemDecrescente.isEmpty()) {
            Collections.sort(ordemDecrescente.reversed());
            return ordemDecrescente;
        } else {
            throw new RuntimeException("\n ** A lista está vazia **");
        }
    }

    public void exibirNumerosDaLista() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println(this.listaDeNumeros);
        } else {
            throw new RuntimeException("\n ** A lista está vazia **");
        }
    }

}