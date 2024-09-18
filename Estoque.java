import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Estoque {
    private Map<String, Map<String, Produto>> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        String nome = produto.getNome();
        String tamanho = produto.getTamanho();
        int quantidade = produto.getQuantidade();
        
        produtos.putIfAbsent(nome, new HashMap<>());
        produtos.get(nome).put(tamanho, produto);
    }

    public void imprimirEstoque() {
        for (Entry<String, Map<String, Produto>> entry : produtos.entrySet()) {
            String nome = entry.getKey();
            System.out.println("Produto: " + nome);

            for (Entry<String, Produto> tamanhoEntry : entry.getValue().entrySet()) {
                Produto produto = tamanhoEntry.getValue();
                System.out.println("Tamanho: " + produto.getTamanho() + 
                                    "\n Categoria: " + produto.getCategoria() +
                                    "\n Gênero: " + produto.getGenero() +
                                    "\n Modelagem: " + produto.getModelagem() +
                                    "\n Quantidade: " + produto.getQuantidade()
                );
            } 
        }
    }

    public int quantidadeTotalProduto() {
        int total = 0;

        for (Entry<String, Map<String, Produto>> entry : produtos.entrySet()) {
            Map<String, Produto> tamanhos = entry.getValue();
            for (Produto produto : tamanhos.values()) {
                total += produto.getQuantidade();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Sunga", "P","Kit Natação", "Masc", "Infantil", 50));
        estoque.adicionarProduto(new Produto("Sunga", "G", "Kit Natação", "Masc", "Adulto", 12));
        estoque.adicionarProduto(new Produto("Sunga", "M", "Kit Natação", "Masc", "Adulto", 9));
        estoque.adicionarProduto(new Produto("Sunga", "GG", "Kit Natação", "Masc", "Infantil", 34));

        estoque.imprimirEstoque();

        int total = estoque.quantidadeTotalProduto();

        System.out.println("A quantidade total do produto é: " + total+ " unidades.");
    }
}
