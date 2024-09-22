import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        String nome = produto.getNome();
        String tipo = produto.getTipo();
        List<Tamanho> tamanho = produto.verificarQuantidade();
        
        produtos.putIfAbsent(nome, produto);

        // System.out.println(produto);
        // System.out.println(tamanho);
        // System.out.println(tipo);
        // produtos.get(nome).put( produto);
    }

    public void imprimirEstoque() {
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            String nome = entry.getKey();
            Produto produto = entry.getValue(); 
            System.out.println(entry.getKey());
            System.out.println(produto.verificarQuantidade());
            // List<Tamanho> tamanhos = entry.getValue()
            // System.out.println("\nProduto: " + nome  );
            // System.out.println();
        }
    }

    public void quantidadeTotalPorProduto(Produto produto){}

    public void quantidadeTotalPorProduto() {
        Map<String, Integer> totalPorProduto = new HashMap<>();

        for (Entry<String, Produto> entry : produtos.entrySet()) {
            System.out.println(entry.getValue());
            Produto produto = entry.getValue();

            List<Tamanho>tamanhosPorProduto = produto.verificarQuantidade();
            int total = 0;
            for (Tamanho t : tamanhosPorProduto) {
                total += t.getQuantidade();
            }
            System.out.println(entry.getValue() + " " + total);
            // String nomeProduto = entry.getKey();
            // int total = 0;

            // for (Produto produto : entry.getValue().values()) {
            //     ;
            // }
            // totalPorProduto.put(nomeProduto, total);
        }
        // return totalPorProduto;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Sunga", "Kit natação", "uniforme"));
        estoque.adicionarProduto(new Produto("Maiô", "Kit natação", "uniforme"));
        estoque.adicionarProduto(new Produto("Blusa M/M", "Kit Educando", "uniforme"));
        // estoque.imprimirEstoque();
        estoque.quantidadeTotalPorProduto();

        // Map<String, Integer> totais = estoque.quantidadeTotalPorProduto();
        // System.out.println(totais);

    }
}


