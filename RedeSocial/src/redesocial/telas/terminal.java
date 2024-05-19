/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redesocial.telas;

import java.util.ArrayList;
import redesocial.classes.Empresa;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;

/**
 *
 * @author gustavo
 */
public class terminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario adm = new Usuario();
        Pessoa junior = new Pessoa("Joselito", "Junior@gmail", "jun10r");
        Pessoa gustavo = new Pessoa("Gustavo", "Gustavo@gmail", "gust4v0");
        Empresa barzin = new Empresa("1231123", "Espasso", "viagens_a_Lua", "LuaViagens@gmail", "123lua4lua321");
        adm.adicinar(junior);
        adm.adicionarPessoa("carlao", "carlao@", "carlao1234");
        adm.listar();
        System.out.println(adm.getListaPessoa());
        adm.fazerAmizade(1, 0);
        adm.listar();

    }
    
}
