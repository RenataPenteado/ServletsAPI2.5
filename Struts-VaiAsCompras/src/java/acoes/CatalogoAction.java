package acoes;

import database.CatalogoDAO;
import database.MySqlCatalogoDAO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CatalogoAction extends Action {
    ///////////////////////////////////////
    // operations
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // instancia base de dados
        CatalogoDAO catalogoDAO = new MySqlCatalogoDAO();

        // recupera catalogo de produtos
        ArrayList catalogoProdutos = catalogoDAO.recuperarCatalogoProdutos();

        // seta-o como atributo de sessao
        request.setAttribute("catalogo", catalogoProdutos);

        // retorna
        return mapping.findForward("sucesso");
    }
     // end execute        
}
 // end CatalogoAction
