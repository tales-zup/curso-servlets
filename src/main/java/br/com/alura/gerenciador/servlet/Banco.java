package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSerial = 1;

    static {
        Empresa empresa1 = new Empresa();
        empresa1.setNome("Zup");
        empresa1.setId(Banco.chaveSerial++);

        Empresa empresa2 = new Empresa();
        empresa2.setId(Banco.chaveSerial++);
        empresa2.setNome("Alura");

        Banco.lista.add(empresa1);
        Banco.lista.add(empresa2);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSerial++);
        Banco.lista.add(empresa);
    }

    public void remove(Empresa empresa) {
        Banco.lista.remove(empresa);
    }

    public Empresa getEmpresaPeloId(Integer id) {
        for(Empresa e : getEmpresas())
            if(Objects.equals(e.getId(), id))
                return e;
        return null;
    }

    public static List<Empresa> getEmpresas() {
        return Banco.lista;
    }

}
