package acoes;

import carrinho.CarrinhoCompras;
import carrinho.ItemCarrinho;

import database.CatalogoDAO;
import database.MySqlCatalogoDAO;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import produto.Produto;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CarrinhoComprasAction extends DispatchAction {
    ///////////////////////////////////////
    // operations
    public ActionForward atualizar(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // adquire carrinho de compras do usuario
        CarrinhoCompras carrinho = getCarrinho(request);

        // atualiza quantidades dos produtos, iterando sobre a lista
        // de produtos incluida no carrinho de compras. Eles estao
        // descritos no request como "quant[ID]=X"
        Iterator i = (carrinho.getItensCarrinho()).iterator();

        while (i.hasNext()) {
            // adquire ID do produto
            int id = ((ItemCarrinho) i.next()).getProdutoId();
            carrinho.atualizaQuantidade(id,
                Integer.parseInt(request.getParameter("quant" + id)));
        }

        return mapping.findForward("sucesso");
    }
     // end atualizar        

    public ActionForward remover(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // adquire carrinho de compras do usuario
        CarrinhoCompras carrinho = getCarrinho(request);

        // remove item, utilizando parametro "id" passado no request
        carrinho.removeItem(Integer.parseInt(request.getParameter("id")));

        return mapping.findForward("sucesso");
    }
     // end remover        

    public ActionForward limparCarrinho(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // adquire carrinho de compras do usuario
        CarrinhoCompras carrinho = getCarrinho(request);

        // limpa carrinho
        carrinho.limparCarrinho();

        return mapping.findForward("sucesso");
    }
     // end limparCarrinho        

    public ActionForward adicionarItem(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // adquire carrinho de compras do usuario
        CarrinhoCompras carrinho = getCarrinho(request);

        // adquire informacoes do produto a ser adicionado
        int idProduto = Integer.parseInt(request.getParameter("id"));
        String quantStr = request.getParameter("quantidade");

        // se quantidade nao foi passada, adiciona apenas 1 unidade
        int quantidade = 1;

        if (quantStr != null) {
            quantidade = Integer.parseInt(quantStr);
        }

        // instancia produto da base de dados
        CatalogoDAO catalogoDAO = new MySqlCatalogoDAO();
        Produto produto = catalogoDAO.recuperarProduto(Integer.parseInt(
                    request.getParameter("id")));

        // adiciona item no carrinho
        carrinho.adicionaItem(new ItemCarrinho(-1, produto.getProdutoId(),
                produto.getNome(), produto.getImagem(), produto.getPreco(), 1));

        return mapping.findForward("sucesso");
    }
     // end adicionarItem        

    public ActionForward visualizar(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // adquire carrinho de compras do usuario
        CarrinhoCompras carrinho = getCarrinho(request);

        // retorna
        return mapping.findForward("sucesso");
    }
     // end visualizar        

    public CarrinhoCompras getCarrinho(HttpServletRequest request) {
        // adquire carrinho da sessao
        CarrinhoCompras carrinho = (CarrinhoCompras) request.getSession()
                                                            .getAttribute("carrinho");

        // se nao existe, cria novo
        if (carrinho == null) {
            carrinho = new CarrinhoCompras(); // cria carrinho vazio
            request.getSession().setAttribute("carrinho", carrinho);
        }

        return carrinho;
    }
     // end getCarrinho        
}
 // end CarrinhoComprasAction
