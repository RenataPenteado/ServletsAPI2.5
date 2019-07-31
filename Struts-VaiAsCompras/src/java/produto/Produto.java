package produto;

public class Produto {
    ///////////////////////////////////////
    // attributes
    private int produtoId;
    private String nome;
    private String descricao;
    private String imagem;
    private float preco;

    ///////////////////////////////////////
    // operations
    public Produto(int produto_id, String nome, String desc, String imagem,
        float preco) {
        this.produtoId = produto_id;
        this.nome = nome;
        this.descricao = desc;
        this.imagem = imagem;
        this.preco = preco;
    }
     // end Produto        

    public int getProdutoId() {
        return this.produtoId;
    }
     // end getProdutoId        

    public void setProdutoId(int produto_id) {
        this.produtoId = produto_id;
    }
     // end setProdutoId        

    public String getNome() {
        return this.nome;
    }
     // end getNome        

    public void setNome(String nome) {
        this.nome = nome;
    }
     // end setNome        

    public String getDescricao() {
        return this.descricao;
    }
     // end getDescricao        

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     // end setDescricao        

    public float getPreco() {
        return this.preco;
    }
     // end getPreco        

    public void setPreco(float preco) {
        this.preco = preco;
    }
     // end setPreco        

    public String getImagem() {
        return this.imagem;
    }
     // end getImagem        

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
     // end setImagem        
}
 // end Produto
