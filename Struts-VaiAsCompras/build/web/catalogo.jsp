<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catálogo de Produtos</title>
        <html:base/>
    </head>

    <body>
        <h2 align="center">Catálogo de Produtos</h2>
        <center><b>Escolha o produto desejado na lista abaixo. Boas compras!</b></center>
        <br><br>

        <table border="0" cellspacing="5" cellpadding="1" width="100%">
            <logic:iterate id="produto" name="catalogo">
                <tr><td colspan="3"><hr></td></tr>
                <tr>
                    <td width="30%"><img src='<bean:write name="produto" property="imagem"/>' width="210"></td>
                    <td width="50%">
                        <table border="0" cellpadding="5">
                            <tr>
                                <td colspan="2" align="center"><font size="5px"><b><bean:write name="produto" property="nome" /></b></font></td>
                            </tr>
                            <tr>
                                <td valign="top"><b>Descrição:</b></td>
                                <td><bean:write name="produto" property="descricao" /></td>
                            </tr>
                            <tr>
                                <td><b>Preço:</b></td>
                                <td>R$ <bean:write name="produto" property="preco" /></td>
                            </tr>
                        </table>
                    </td>
                    <td align="center">
                        <html:link page="/carrinho.do?method=adicionarItem" paramName="produto" paramId="id" paramProperty="produtoId">
                    <image src="imagens/carrinho.jpg" height="40" border="0">
                    </html:link>
                    </td>
                    </tr>
                </logic:iterate>
                <tr>
                    <td colspan="3"><hr></td>
                </tr>
        </table>

        <br><br>
        <center>
            <input type="button" value="Carrinho" onClick="javascript:document.location='carrinho.do?method=visualizar'">
        </center>
    </body>
</html:html>