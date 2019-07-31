package carrinho;

import java.io.Serializable;


public class ItemCarrinho implements Serializable {
    ///////////////////////////////////////
    // attributes
    int itemId;
    int produtoId;
    String nome;
    String imagem;
    float preco;
    int quantidade;

    ///////////////////////////////////////
    // operations
    public ItemCarrinho(int item_id, int produto_id, String nome,
        String imagem, float preco, int quantidade) {
        this.itemId = item_id;
        this.produtoId = produto_id;
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
        this.quantidade = quantidade;
    }
     // end ItemCarrinho        

    public int getItemId() {
        return this.itemId;
    }
     // end getItemId        

    public int getProdutoId() {
        return this.produtoId;
    }
     // end getProdutoId        

    public String getNome() {
        return this.nome;
    }
     // end getNome        

    public float getPreco() {
        return this.preco;
    }
     // end getPreco        

    public int getQuantidade() {
        return this.quantidade;
    }
     // end getQuantidade        

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
     // end setQuantidade        

    public String getImagem() {
        return this.imagem;
    }
     // end getImagem        

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
     // end setImagem        

    public boolean equals(Object o) {
        return ((this.getProdutoId()) == (((ItemCarrinho) o).getProdutoId()));
    }
     // end equals        

    public float getPrecoItemTotal() {
        return (this.quantidade * getPreco());
    }
     // end getPrecoItemTotal        
}
 // end ItemCarrinho
