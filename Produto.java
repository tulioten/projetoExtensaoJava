import java.util.UUID;

public class Produto {
  private UUID id;
  private String nome, tamanho, categoria, genero, modelagem;
  private int quantidade;


  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }
  
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  public void setModelagem(String modelagem) {
    this.modelagem = modelagem;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }
  
  public String getTamanho() {
    return tamanho;
  }

  public String getCategoria() {
    return categoria;
  }

  public String getGenero() {
    return genero;
  }

  public String getModelagem() {
    return modelagem;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public Produto(String nome, String tamanho, String categoria, String genero, String modelagem, int quantidade) {
    this.id = UUID.randomUUID();
    this.nome = nome;
    this.categoria = categoria;
    this.tamanho = tamanho;
    this.genero = genero;
    this.modelagem = modelagem;
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "Produto{" +
    "\nid= " + id +
    "\n nome= " + nome +
    "\n tamanho= " + tamanho +
    "\n categoria= " + categoria +
    "\n genero= " + genero +
    "\n modelagem= " + modelagem +
    "\n quantidade= " + quantidade +
    "\n }";
  }

}