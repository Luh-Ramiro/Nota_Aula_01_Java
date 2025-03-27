import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    // Construtor
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar um novo produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque: " + produto.getNome());
    }

    // Método para buscar um produto pelo nome
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    // Método para exibir todos os produtos no estoque
    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("\n=== Estoque Atual ===");
            for (Produto produto : produtos) {
                produto.exibirEstoque();
                System.out.println("----------------------");
            }
        }
    }
}
