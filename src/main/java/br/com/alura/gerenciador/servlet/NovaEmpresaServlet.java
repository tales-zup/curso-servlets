package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String nome = req.getParameter("nome");

        Empresa empresa = new Empresa();
        empresa.setNome(nome);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        System.out.println("Cadastrando nova empresa!");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("A empresa " + nome + " foi criada!");
        out.println("</body></html>");

    }
}
