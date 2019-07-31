package database;

import produto.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;


public class MySqlCatalogoDAO implements CatalogoDAO {
    ///////////////////////////////////////
    // attributes
    public static final String TABELA_PRODUTO = "tabProduto";
    public static final String DATASOURCE = "java:comp/env/jdbc/Carrinho";

    ///////////////////////////////////////
    // operations
    public Produto recuperarProduto(int id_produto) throws Exception {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Produto produto;

        try {
            c = getDataSource().getConnection();
            ps = c.prepareStatement("select * from " + TABELA_PRODUTO +
                    " where id=" + id_produto,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();
            rs.next();
            produto = new Produto(rs.getInt("id"), rs.getString("nome"),
                    rs.getString("descricao"), rs.getString("imagem"),
                    rs.getFloat("preco"));
            ps.close();
            c.close();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return (produto);
    }
     // end recuperarProduto        

    public ArrayList recuperarCatalogoProdutos() throws Exception {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList catalogo = new ArrayList();

        try {
            c = getDataSource().getConnection();
            ps = c.prepareStatement("select * from " + TABELA_PRODUTO,
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery();

            while (rs.next()) {
                catalogo.add(new Produto(rs.getInt("id"), rs.getString("nome"),
                        rs.getString("descricao"), rs.getString("imagem"),
                        rs.getFloat("preco")));
            }

            ps.close();
            c.close();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

        return (catalogo);
    }
     // end recuperarCatalogoProdutos        

    private DataSource getDataSource() throws Exception {
        try {
            InitialContext ic = new InitialContext();

            DataSource ds = (DataSource) ic.lookup(DATASOURCE);

            return ds;
        } catch (NamingException ne) {
            throw new Exception("Erro ao adquirir datasource - " +
                ne.getMessage());
        }
    }
     // end getDataSource        
}
 // end MySqlCatalogoDAO
