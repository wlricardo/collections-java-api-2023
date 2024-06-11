import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                if (item.getNome().equals(nome)) {
                    itensParaRemover.add(item);
                }
            }
            if (!itensParaRemover.isEmpty()) {
                listaDeItens.removeAll(itensParaRemover);
            } else {
                System.out.println("\n Item não localizado.");
            }
        } else {
            System.out.println("\n A lista de itens está vazia.");
        }
    }

    public double calcularValorTotal() {
        double total = 0.0;
        if (!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                total += item.getPreco();
            }
        } else {
            System.out.println("\n A lista de itens está vazia.");
        }
        return total;
    }

    public void exibirItens() {
        if (!listaDeItens.isEmpty()) {
            for (Item item : listaDeItens) {
                System.out.println(item);
            }
        } else {
            System.out.println("\n A lista de itens está vazia.");
        }
    }
}