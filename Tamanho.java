public class Tamanho {
    public String tamanho;
    public int quantidade;

    public Tamanho(String tamanho, int quantidade) {
        this.tamanho = tamanho;
        if (quantidade != 0 ) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;   
        }
    }

    public void setTamanho(String t) {
        this.tamanho = t;
    }

    public void setQuantidade(int q) {
        this.quantidade = q;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\n{Tamanho= " + tamanho +
                ", Quantidade= " + quantidade +
                '}';
    }
}
