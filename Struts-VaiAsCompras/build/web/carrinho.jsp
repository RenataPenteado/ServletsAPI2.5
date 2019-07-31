<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html:html> 
  <head>
    <title>Carrinho de Compras</title>
    <html:base/> 
  </head>

  <body>
    <h2 align="center">Seu Carrinho de Compras</h2>
    <br>

    <logic:greaterThan scope="session" name="carrinho" property="tamanho" value="0"> 
      <form action="carrinho.do?method=atualizar" method="post">
        <table border="1" bordercolor="#000000" cellspacing="0" cellpadding="5" width="100%">
          <tr> 
            <th align="center" width="20%">Imagem</th>
            <th align="center" width="27%">Nome</th>
            <th align="center" width="15%">Pre&ccedil;o</th>
            <th align="center" width="15%">Quantidade</th>
            <th align="center" width="15%">Pre&ccedil;o Total</th>
            <th align="center" width="8%">Remover</th>
          </tr>
             
          <!-- LISTAGEM DE PRODUTOS -->
          <logic:iterate id="item" scope="session" name="carrinho" property="itensCarrinho">
            <tr>
              <td align="center" width="20%"><image src='<bean:write name="item" property="imagem"/>' height="60" ></td>
              <td align="center" width="27%"><bean:write name="item" property="nome"/></td>
              <td align="center" width="15%">R$ <bean:write name="item" property="preco"/></td>
              <td align="center" width="15%"><input type="text" size=3 name='quant<bean:write name="item" property="produtoId"/>' value='<bean:write name="item" property="quantidade"/>'></td>
              <td align="center" width="15%">R$ <bean:write name="item" property="precoItemTotal"/></td>
              <td align="center" width="8%"><html:link page="/carrinho.do?method=remover" paramName="item" paramId="id" paramProperty="produtoId">remover</html:link></td>
            </tr>
          </logic:iterate> 
              
          <tr>
            <th colspan="5" align="right"><b>Total do Carrinho:</b></th> 
            <td colspan="2" align="center" width="3%"> R$ <bean:write name="carrinho" property="precoTotal"/></td>
          </tr>
        </table>
          
        <br>
        <center>
          <input type="button" value="Voltar" onClick="javascript:document.location='catalogo.do'">
          <input type="submit" value="Atualizar">
          <input type="button" value="Limpar" onClick="javascript:document.location='carrinho.do?method=limparCarrinho'">
        </center>
      </form>
    </logic:greaterThan>

    <logic:lessEqual scope="session" name="carrinho" property="tamanho" value="0"> 
    <br><h3>Seu carrinho est&aacute; vazio.</h3>
    <br><input type="button" value="Voltar" onClick="javascript:document.location='catalogo.do'">
    </logic:lessEqual>
  </body>
</html:html>