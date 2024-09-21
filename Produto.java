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

  // public Produto() {
  //   new Produto();
  // }

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

    tamanhosFixos.add(new Tamanho("p_infantil", 0));
    tamanhosFixos.add(new Tamanho("m_infantil", 0));
    tamanhosFixos.add(new Tamanho("g_infantil", 0));
    tamanhosFixos.add(new Tamanho("gg_infantil", 0));
    tamanhosFixos.add(new Tamanho("p_adulto", 0));
    tamanhosFixos.add(new Tamanho("m_adulto", 0));
    tamanhosFixos.add(new Tamanho("g_adulto", 0));
    tamanhosFixos.add(new Tamanho("gg_adulto", 0));

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

}