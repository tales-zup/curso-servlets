package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        Banco banco = new Banco();

        Empresa empresa = banco.getEmpresaPeloId(id);
        banco.remove(empresa);

        resp.sendRedirect("listaEmpresas");

    }
}
