package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));

        Banco banco = new Banco();
        Empresa empresa = banco.getEmpresaPeloId(id);
        req.setAttribute("empresa", empresa);

        RequestDispatcher rd = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(req, resp);

    }
}
