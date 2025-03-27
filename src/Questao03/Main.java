import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        // Adicionando alguns produtos ao estoque
        estoque.adicionarProduto(new Produto("Shampoo", 15.99, 10));
        estoque.adicionarProduto(new Produto("Sabonete", 5.50, 20));
        estoque.adicionarProduto(new Produto("Condicionador", 18.99, 15));

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Exibir Estoque");
            System.out.println("2 - Adicionar Estoque");
            System.out.println("3 - Vender Produto");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    estoque.exibirEstoque();
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAdicionar = scanner.nextLine();
                    Produto produtoAdicionar = estoque.buscarProduto(nomeAdicionar);
                    if (produtoAdicionar != null) {
                        System.out.print("Quantidade para adicionar: ");
                        int quantidade = scanner.nextInt();
                        produtoAdicionar.adicionarEstoque(quantidade);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeVender = scanner.nextLine();
                    Produto produtoVender = estoque.buscarProduto(nomeVender);
                    if (produtoVender != null) {
                        System.out.print("Quantidade para vender: ");
                        int quantidade = scanner.nextInt();
                        produtoVender.vender(quantidade);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}




