package redesocial.classes;

import java.util.ArrayList;

public class Pessoa extends Usuario {
    public String nome = super.nomeUsuario;
    public String descr;
    public ArrayList<Integer> amigos = new ArrayList();
    //costrutor
    public Pessoa() {
        super.tipoConta = 1;
    }

    public Pessoa(String nome, String descr) {
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
    }
    public Pessoa(String nome_de_usuario, String email, String senha){
        super(nome_de_usuario, email, senha);
    }
    
    public Pessoa(String nome, String descr, String nomeUsuario, String email, String senha) {
        super(nomeUsuario, email, senha);
        
        super.tipoConta = 1;
        
        this.nome = nome;
        this.descr = descr;
    }
    //metodos
    public void adicionarAmigo(Integer amigo){
        amigos.addLast(amigo);
    }
    public void removerAmigo(int id_da_pessoa){
        amigos.remove(id_da_pessoa);
        
    }
    //get e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public int getTipoConta() {
        return tipoConta;
    }
    @Override 
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    public ArrayList<Integer> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Integer> amigos) {
        this.amigos = amigos;
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", descr=" + descr +", amigos= {"+ getAmigos() +"}" +", email="+ super.email
                + ", nome usuario=" + super.nomeUsuario + ", senha=" + super.senha + '}';

    }

    
}
