public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 5.80, 2);
        carrinho.adicionarItem("Arroz", 7.25, 2);
        carrinho.adicionarItem("Carne", 27.55, 1);
        carrinho.adicionarItem("Manga", 12.35, 2);

        carrinho.exibirItens();
        System.out.println("\n Valor total das compras: R$ " + carrinho.calcularValorTotal());

        System.out.println("\n Removendo item inexistente...");
        carrinho.removerItem("Caju");

        System.out.println("\n Removendo item existente...");
        carrinho.removerItem("Manga");

        carrinho.exibirItens();
        System.out.println("\n Valor total das compras: R$ " + carrinho.calcularValorTotal());
        System.out.println("\n Fim do programa...\n");

    }
}
