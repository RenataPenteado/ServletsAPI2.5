package database;

import produto.Produto;

import java.util.ArrayList;


/**
 * @poseidon-object-id [lsm:1e3940a:f8ce2cc23d:-7fc5]
 */
public interface CatalogoDAO {
    ///////////////////////////////////////
    // operations
    public Produto recuperarProduto(int id_produto) throws Exception;

    public ArrayList recuperarCatalogoProdutos() throws Exception;
}
 // end CatalogoDAO
