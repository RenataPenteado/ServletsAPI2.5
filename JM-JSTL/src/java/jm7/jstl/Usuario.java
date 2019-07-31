package jm7.jstl;

public class Usuario {

  String nome;
  String username;
  String senha;
   
  public Usuario() {  }
  public void setNome( String nome ) { this.nome = nome; }
  public void setUsername( String username ) { this.username = username; }
  public void setSenha( String senha ) { this.senha = senha; }
  public String getNome() { return this.nome; }
  public String getUsername() { return this.username; }
  public String getSenha() { return this.senha; }
}
