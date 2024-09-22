import java.util.UUID;
import java.util.ArrayList;
import java.util.List;


public class Produto {
  private UUID id;
  private String nome, categoria, tipo;
  private List<Tamanho> tamanhos;


  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  public String getNome() {
    return nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public String getTipo() {
    return tipo;
  }

  public Produto() {
    new Produto();
  }

  public Produto(String nome, String categoria, String tipo) {
    this.id = UUID.randomUUID();
    this.nome = nome;
    this.categoria = categoria;
    this.tipo = tipo;
  
  
    if(tipo.toLowerCase().equals("uniforme") || tipo.toLowerCase().equals("farda")) {
      this.tamanhos = criarTamanhosFixos();
    } else {
      this.tamanhos = new ArrayList<>();
    }
  }

  public void alterarQuantidade(String tamanho, int quantidade) {
    for (Tamanho t : tamanhos) {
      if (t.getTamanho().equalsIgnoreCase(tamanho)) {
        t.setQuantidade(quantidade);
        return;
      }
    }
  }

  public List<Tamanho> verificarQuantidade() {
      return tamanhos;
      
    }
  

  public List<Tamanho> criarTamanhosFixos() {
    List<Tamanho> tamanhosFixos = new ArrayList<>();

    tamanhosFixos.add(new Tamanho("p_infantil", 3));
    tamanhosFixos.add(new Tamanho("m_infantil", 4));
    tamanhosFixos.add(new Tamanho("g_infantil", 12));
    tamanhosFixos.add(new Tamanho("gg_infantil", 10));
    tamanhosFixos.add(new Tamanho("p_adulto", 9));
    tamanhosFixos.add(new Tamanho("m_adulto", 20));
    tamanhosFixos.add(new Tamanho("g_adulto", 14));
    tamanhosFixos.add(new Tamanho("gg_adulto", 3));

    return tamanhosFixos;
  }
  //Criando tamanhos para uniformes.


  @Override
  public String toString() {
    return "Produto{" +
    "\n id= " + id +
    "\n nome= " + nome +
    "\n categoria= " + categoria +
    "\n tamanhos= " + tamanhos +
    "\n }";
  }

  // public static void main(String[] args) {
  //   Produto Sunga = new Produto("Sunga", "Natacao", "uniforme");
    
  //   Sunga.alterarQuantidade("p_infantil", 12);
  //   Sunga.alterarQuantidade("m_infantil", 25);
  //   Sunga.alterarQuantidade("g_infantil", 14);
  //   Sunga.alterarQuantidade("gg_infantil", 3);
  //   Sunga.alterarQuantidade("p_adulto", 9);
  //   Sunga.alterarQuantidade("m_adulto", 17);
  //   Sunga.alterarQuantidade("g_adulto", 5);
  //   Sunga.alterarQuantidade("gg_adulto", 2);
  //   System.out.println(Sunga);
  // }

}




