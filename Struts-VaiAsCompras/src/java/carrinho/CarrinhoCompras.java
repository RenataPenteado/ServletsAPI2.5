package carrinho;

import java.util.ArrayList;
import java.util.Iterator;


public class CarrinhoCompras {
    ///////////////////////////////////////
    // attributes
    float precoTotal;

    ///////////////////////////////////////
    // associations
    ArrayList itensCarrinho;

    ///////////////////////////////////////
    // operations
    public CarrinhoCompras() {
        // inicializa carrinho
        itensCarrinho = new ArrayList();
        precoTotal = 0;
    }
     // end CarrinhoCompras        

    public void adicionaItem(ItemCarrinho item) {
        // verifica se item ja esta na lista
        int posItem = itensCarrinho.indexOf(item);

        if (posItem != -1) {
            // se ja contem, incrementa quantidade
            ItemCarrinho itemCarrinho = (ItemCarrinho) itensCarrinho.get(posItem);
            itemCarrinho.setQuantidade(itemCarrinho.getQuantidade() +
                item.getQuantidade());
        } else {
            // caso contrario, adiciona na lista
            itensCarrinho.add(item);
        }

        recalcularPrecoTotal();
    }
     // end adicionaItem        

    public void atualizaQuantidade(int id, int quantidade) {
        // encontra item a ser atualizado
        Iterator i = itensCarrinho.iterator();

        while (i.hasNext()) {
            ItemCarrinho item = (ItemCarrinho) i.next();

            if ((item.getProdutoId()) == id) {
                // quando encontrado, atualiza sua quantidade
                item.setQuantidade(quantidade);
            }
        }

        recalcularPrecoTotal();
    }
     // end atualizaQuantidade        

    public void removeItem(int id) {
        // encontra item a ser removido
        Iterator i = itensCarrinho.iterator();
        boolean removido = false;

        while ((i.hasNext()) && (!removido)) {
            ItemCarrinho item = (ItemCarrinho) i.next();

            if ((item.getProdutoId()) == id) {
                // quando encontrado, remove-o
                itensCarrinho.remove(item);
                removido = true;
            }
        }

        recalcularPrecoTotal();
    }
     // end removeItem        

    public void limparCarrinho() {
        itensCarrinho.clear();
    }
     // end limparCarrinho        

    public int getTamanho() {
        return (itensCarrinho.size());
    }
     // end getTamanho        

    public ArrayList getItensCarrinho() {
        return (this.itensCarrinho);
    }
     // end getItensCarrinho        

    public float getPrecoTotal() {
        return (this.precoTotal);
    }
     // end getPrecoTotal        

    private void recalcularPrecoTotal() {
        precoTotal = 0;

        // recalcula preco total da compra
        Iterator i = itensCarrinho.iterator();

        while (i.hasNext())
            precoTotal += ((ItemCarrinho) i.next()).getPrecoItemTotal();
    }
     // end recalcularPrecoTotal        
}
 // end CarrinhoCompras
