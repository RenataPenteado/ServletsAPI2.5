package org.apache.jsp.useBeanSample1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.litinow.utils.Dog;
import com.litinow.utils.Person;

public final class useBeanSample1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>useBeanSample1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>useBean Sample 1</h1>\n");
      out.write("        ");
      com.litinow.utils.Person personSample1 = null;
      synchronized (_jspx_page_context) {
        personSample1 = (com.litinow.utils.Person) _jspx_page_context.getAttribute("personSample1", PageContext.PAGE_SCOPE);
        if (personSample1 == null){
          personSample1 = new com.litinow.utils.Person();
          _jspx_page_context.setAttribute("personSample1", personSample1, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("            ");
          org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("personSample1"), request);
          out.write("\n");
          out.write("        ");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        ");

            ((Person)pageContext.getAttribute("personSample1")).setDog((Dog) request.getAttribute("dog"));
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Person created by jsp:useBean</h1>\n");
      out.write("        Name: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.litinow.utils.Person)_jspx_page_context.findAttribute("personSample1")).getName())));
      out.write("<br>\n");
      out.write("        Address: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.litinow.utils.Person)_jspx_page_context.findAttribute("personSample1")).getAddress())));
      out.write("<br>\n");
      out.write("        Phone: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.litinow.utils.Person)_jspx_page_context.findAttribute("personSample1")).getPhone())));
      out.write("<br>\n");
      out.write("        <br><br>\n");
      out.write("        <h1>Person datails by EL</h1>\n");
      out.write("        Name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${personSample1.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("        Address: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${personSample1.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("        Phone: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${personSample1.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("        Person's Dog name: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${personSample1.dog.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("        Dog name Att from request: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dog.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
