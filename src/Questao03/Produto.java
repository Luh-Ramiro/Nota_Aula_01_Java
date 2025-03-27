public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }


    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }


    public void exibirEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque disponível: " + quantidadeEmEstoque + " unidades");
    }
}
