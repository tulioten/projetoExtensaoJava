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
    }

    public void modificarQuantidade(String item, String tam, int quant) {
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(item)) {
                Produto produto = entry.getValue();
                produto.alterarQuantidade(tam, quant);
            }
        }
    }

    public void imprimirEstoqueTotal() {
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            String nome = entry.getKey();
            Produto produto = entry.getValue(); 
            System.out.println(entry.getKey());
            System.out.println(produto.verificarQuantidade());
        }
    }

    public void imprimirEstoqueDoProduto(String item) {
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(item)) {
                System.out.println(entry);
            }
        }
    }

    public void quantidadeTotalPorProduto(String item){
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(item)) {
                
                Produto produto = entry.getValue();
                List<Tamanho>tamanhosPorProduto = produto.verificarQuantidade();
                
                int total = 0;
                for (Tamanho t : tamanhosPorProduto) {
                    total += t.getQuantidade();
            }
                System.out.println(item + " têm " + total + " unidades.");
            }
        }
        
    }

    public void quantidadeTotalEstoque() {
        for (Entry<String, Produto> entry : produtos.entrySet()) {
            System.out.println(entry.getValue());
            Produto produto = entry.getValue();
            

            List<Tamanho>tamanhosPorProduto = produto.verificarQuantidade();
            int total = 0;
            for (Tamanho t : tamanhosPorProduto) {
                total += t.getQuantidade();
            }
            System.out.println(produto.getNome() + " têm " + total + " peças");
        }
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Produto("Sunga", "Kit natação", "uniforme"));
        estoque.adicionarProduto(new Produto("Maiô", "Kit natação", "uniforme"));
        estoque.adicionarProduto(new Produto("Blusa M/M", "Kit Educando", "uniforme"));
        // estoque.imprimirEstoqueTotal();
        // estoque.quantidadeTotalPorProduto();
        estoque.imprimirEstoqueDoProduto("Sunga");
        estoque.modificarQuantidade("Sunga", "p_adulto", 60);
        estoque.imprimirEstoqueDoProduto("Sunga");
        // Map<String, Integer> totais = estoque.quantidadeTotalPorProduto();
        // System.out.println(totais);

    }
}

