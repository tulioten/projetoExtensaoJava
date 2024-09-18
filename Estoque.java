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
            System.out.println("\nProduto: " + nome + "\n");

            for (Entry<String, Produto> tamanhoEntry : entry.getValue().entrySet()) {
                Produto produto = tamanhoEntry.getValue();
                System.out.println(" Tamanho: " + produto.getTamanho() + 
                                    "\n Categoria: " + produto.getCategoria() +
                                    "\n Gênero: " + produto.getGenero() +
                                    "\n Modelagem: " + produto.getModelagem() +
                                    "\n Quantidade: " + produto.getQuantidade() + "\n"
                );
            } 
        }
    }

    public Map<String, Integer> quantidadeTotalPorProduto() {
        Map<String, Integer> totalPorProduto = new HashMap<>();

        for (Entry<String, Map<String, Produto>> entry : produtos.entrySet()) {
            String nomeProduto = entry.getKey();
            int total = 0;

            for (Produto produto : entry.getValue().values()) {
                total += produto.getQuantidade();
            }
            totalPorProduto.put(nomeProduto, total);
        }
        return totalPorProduto;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Maiô", "P","Kit Natação", "Fem", "Infantil", 50));
        estoque.adicionarProduto(new Produto("Maiô", "G", "Kit Natação", "Fem", "Adulto", 12));

        estoque.adicionarProduto(new Produto("Sunga", "M", "Kit Natação", "Masc", "Adulto", 9));
        estoque.adicionarProduto(new Produto("Sunga", "GG", "Kit Natação", "Masc", "Infantil", 34));

        estoque.imprimirEstoque();

        Map<String, Integer> totais = estoque.quantidadeTotalPorProduto();
        System.out.println(totais);

    }
}
