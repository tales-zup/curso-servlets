package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String dataAberturaReq = req.getParameter("dataAbertura");
        Date dataAbertura;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(dataAberturaReq);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Banco banco = new Banco();
        Empresa empresa = banco.getEmpresaPeloId(id);
        empresa.setNome(nome);
        empresa.setDataAbertura(dataAbertura);

        resp.sendRedirect("listaEmpresas");

    }
}
