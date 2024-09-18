import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nome, cidade, UF, pessoaResponsavel, email, telefone;

  private void setNome() {
    this.nome = nome;
  } 
  
  private void setCidade() {
    this.cidade = cidade;
  }
  
  private void setUF() {
    this.UF = UF;
  }
  
  private void setPessoaResponsavel() {
    this.pessoaResponsavel = pessoaResponsavel;
  }

  private void setEmail() {
    this.email = email;
  }
  
  private void setTelefone() {
    this.telefone = telefone;
  }
  
  public String getNome() {
    return nome;
  }

  public String getCidade() {
    return cidade;
  }
  
  public String getUF() {
    return UF;
  }
  
  public String getPessoaResponsavel() {
    return pessoaResponsavel;
  }

  public String getEmail() {
    return email;
  }
  
  public String getTelefone() {
    return telefone;
  }

  @Override
  public String toString() {
    return "Cliente: {" +
    "\n Nome: " + nome + 
    "\n Cidade: " + cidade + 
    "\n UF: " + UF + 
    "\n Responsável: " + pessoaResponsavel + 
    "\n Email: " + email +
    "\n }";
  }
 

  public Cliente(String pessoaResponsavel, String cidade, String email, String nome, String UF) {
    this.id = UUID.randomUUID();
    this.pessoaResponsavel = pessoaResponsavel;
    this.cidade = cidade;
    this.email = email;
    this.nome = nome;
    this.UF = UF;
  }

}
