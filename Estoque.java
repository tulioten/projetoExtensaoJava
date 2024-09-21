import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Estoque {
    private Map<String, Map<String, Produto>> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        String nome = produto.getNome();
        String tipo = produto.getTipo();
        List<Tamanho> tamanho = produto.verificarQuantidade();
        
        produtos.putIfAbsent(nome, new HashMap<>());

        System.out.println(produto);
        System.out.println(tamanho);
        System.out.println(tipo);
        // produtos.get(nome).put( produto);
    }

    public void imprimirEstoque() {
        for (Entry<String, Map<String, Produto>> entry : produtos.entrySet()) {
            String nome = entry.getKey();
            System.out.println("\nProduto: " + nome + "\n");

            for (Entry<String, Produto> tamanhoEntry : entry.getValue().entrySet()) {
                Produto produto = tamanhoEntry.getValue();
                System.out.println(" Tamanho: " + produto.verificarQuantidade() + 
                                    "\n Categoria: " + produto.getCategoria()

                );
                        } 
                    }
    }

    // public Map<String, Integer> quantidadeTotalPorProduto() {
    //     Map<String, Integer> totalPorProduto = new HashMap<>();

    //     for (Entry<String, Map<String, Produto>> entry : produtos.entrySet()) {
    //         String nomeProduto = entry.getKey();
    //         int total = 0;

    //         for (Produto produto : entry.getValue().values()) {
    //             total += produto.verificarQuantidade();
    //         }
    //         totalPorProduto.put(nomeProduto, total);
    //     }
    //     return totalPorProduto;
    // }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Sunga", "Kit natação", "uniforme"));
        // estoque.imprimirEstoque();

        // Map<String, Integer> totais = estoque.quantidadeTotalPorProduto();
        // System.out.println(totais);

    }
}
