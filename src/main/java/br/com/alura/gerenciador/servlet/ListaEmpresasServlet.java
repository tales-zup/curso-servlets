package br.com.alura.gerenciador.servlet;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Banco banco = new Banco();
        List<Empresa> empresas = Banco.getEmpresas();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Lista de empresas</h3>");
        out.println("<ul>");
        for(Empresa e : empresas)
            out.println("<li>" + e.getNome() + "</li>");
        out.println("</ul>");
        out.println("</body></html>");

    }

}
