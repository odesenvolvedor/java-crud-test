package br.com.javaweb.jdbc.test;

import br.com.javaweb.jdbc.dao.ContatoDao;
import br.com.javaweb.jdbc.modelo.Contato;
import java.util.Calendar;

public class TestaInsere {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Java Web");
        contato.setEmail("contato@javaweb.com.br");
        contato.setEndereco("R. dos Javeiros 3185 cj87");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDao bd = new ContatoDao();

        bd.adiciona(contato);

        System.out.println("Gravado!");
        
    }
}
