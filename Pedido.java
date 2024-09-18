import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private UUID id;
    private Cliente cliente;
    private List<Produto> produtos;
    private Boolean conferido;
    private LocalDateTime criadoEm, finalizadoEm;

    
    public Pedido(Cliente cliente){
        this.id = UUID.randomUUID();
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
        this.conferido = false;
        this.criadoEm = LocalDateTime.now();
    
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public boolean isConferido() {
        return conferido;
    }

    public void setConferido(boolean conferido) {
        this.conferido = conferido;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public LocalDateTime getFinalizadoEm() {
        return finalizadoEm;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
    
    public void finalizarPedido() {
        if (this.finalizadoEm == null) {
            this.finalizadoEm = LocalDateTime.now();
            this.conferido = true;
        }
    }
    
}
