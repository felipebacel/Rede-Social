package redesocial.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Usuario{
    public String nomeUsuario;
    protected String email;
    protected String senha;
    protected char[] senhaS;
    public int tipoConta; // 0 usuario , 1 pessoa, 2 empresa
   //coisas de adm
    private Pessoa Pessoa_sessao;
    private Empresa Empresa_sessao;
    
    protected HashMap<String, String> listaAmigo = new HashMap<String, String>();
    
    private ArrayList<Pessoa> listaPessoa = new ArrayList();
    private ArrayList<Empresa> listaEmpresa = new ArrayList();
   //construtor (precisa?? PRECISA!!)
    public Usuario(){
        this.tipoConta = 0;
    }

    public Usuario(String nomeUsuario, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
    }
   //metodos
    public void CriarUsuario(String indetificador, String email, String senha, int tipo) {
        this.nomeUsuario = indetificador;
        this.email = email;
        this.senha = indetificador;
        this.tipoConta = tipo;
    }
    
    public Usuario getPessoa(String nome){
         for(int i = 0; i < listaPessoa.size(); i++){
             if (listaPessoa.get(i).nomeUsuario.equals(nome)){
                 Pessoa esse = listaPessoa.get(i);
                 return esse;
             }
         }
        return null;
     }
    
         public int getPessoaIndex(String nome){
         for(int i = 0; i < listaPessoa.size(); i++){
             if (listaPessoa.get(i).nomeUsuario.equals(nome)){
                 return i;
             }
         }
        return 0;
     }
    
     public Pessoa getPessoaEmail(String email){
         for(int i = 0; i < listaPessoa.size(); i++){
             if (listaPessoa.get(i).email.equals(email)){
                 Pessoa esse = listaPessoa.get(i);
                 return esse;
             }
         }
        return null;
     }
         
     public void adicinar(Pessoa pessoa){
        listaPessoa.add(pessoa);
     }
     
     public void atualizarP(String perfilMOD,String email, String senha ,String nome_perfil, String descricao){
         Pessoa novo = new Pessoa(email, descricao, nome_perfil, email, senha);
         System.out.println(this.listaPessoa.get(getPessoaIndex(nome_perfil)) + " <--- " + novo.toString());
         this.listaPessoa.set(this.getPessoaIndex(perfilMOD), novo);
     }
     public void atualizarE(String perfilMOD ,String email, String senha ,String nome_perfil, String CNPJ, String ramo){
         Empresa novo = new Empresa(CNPJ, nome_perfil, ramo, email, senha);
         System.out.println(this.listaEmpresa.get(getEmpresaIndex(nome_perfil)) + " <--- " + novo.toString());
         this.listaEmpresa.set(this.getEmpresaIndex(perfilMOD), novo);
     }
     
     public void adicionarPessoa (String nome, String descricao, String nomeUsuario,String email, String senha){
         Pessoa pessoa = new Pessoa(nome, senha, nomeUsuario, email, senha);
         listaPessoa.add(pessoa);
     }
     public void adicionarPessoa (String nomeUsuario,String email, String senha){
         Pessoa pessoa = new Pessoa(nomeUsuario, email, senha);
         listaPessoa.add(pessoa);
     }
     public void adicionarPessoaS (){
         /*função "segura" de adicionar pessoas para que não haja pessoas com 
         com id ou indetificação como usuario iguais*/
     }
     public void removerPessoa (Pessoa pessoaRM){
         listaPessoa.remove(pessoaRM);
     }

     public void fazerAmizade(Usuario usu1, Usuario usu2){
         usu1.listaAmigo.put(usu2.getNomeUsuario(), usu2.getClass().getSimpleName());
         usu2.listaAmigo.put(usu1.getNomeUsuario(), usu1.getClass().getSimpleName());
     }
     public void desfazerAmizade(Usuario usu1, Usuario usu2){
         usu1.listaAmigo.remove(usu2.getNomeUsuario(), usu2.getClass().getSimpleName());
         usu2.listaAmigo.remove(usu1.getNomeUsuario(), usu1.getClass().getSimpleName());
     }
     

     // EMPRESSSASSSSSSS
     public Usuario getEmpresa(String nome){
         for(int i = 0; i < listaEmpresa.size(); i++){
             if (listaEmpresa.get(i).nomeUsuario.equals(nome)){
                 Empresa esse = listaEmpresa.get(i);
                 return esse;
             }
         }
        return null;
     }
     
     public int getEmpresaIndex(String nome){
         for(int i = 0; i < listaEmpresa.size(); i++){
             if (listaEmpresa.get(i).nomeUsuario.equals(nome)){
                 return i;
             }
         }
        return 0;
     }
     
     public Empresa getEmpresaEmail(String email){
         for(int i = 0; i < listaEmpresa.size(); i++){
             if (listaEmpresa.get(i).email.equals(email)){
                 Empresa esse = listaEmpresa.get(i);
                 return esse;
             }
         }
        return null;
     }
     
     public void adicionar(Empresa empresa){
         listaEmpresa.add(empresa);
     }
     public void adicionarEmpresa(String cnpj, String ramo, String nomeUsuario,String email, String senha){
         Empresa empresa = new Empresa(cnpj, ramo, nomeUsuario, email, senha);
         listaEmpresa.add(empresa);
     }
     
     public void removerEmpresa (Pessoa pessoaRM){
         listaPessoa.remove(pessoaRM);
     }
     public void adicionarProduto (String nome_da_empresa, String[] produtos){
         for (int i = 0; i < listaEmpresa.size(); i++){
             if (nome_da_empresa.equals(listaEmpresa.get(i).nomeUsuario)){
                 
                 for (int j = 0; j < produtos.length; j++){
                     listaEmpresa.get(i).produtos.add(produtos[j]);
                 }//adiciona os produtos na empresa
             }
         }
     } 
     public void listar(){
         System.out.print("Pessoas = [\n");
         for (int i = 0; i < listaPessoa.size(); i++){
             System.out.println(i + " " + listaPessoa.get(i).toString());
         }
         System.out.println("]");
         
         System.out.print("Empresas = [");
         for (int i = 0; i < listaEmpresa.size(); i++){
             System.out.println(i + " " + listaEmpresa.get(i).toString());
         }
         System.out.println("]");
     }
     
    
    //arraylist metodos
    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public ArrayList<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(ArrayList<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }
    
    //gets e setters
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    public char[] getSenhaS() {
        return senhaS;
    }

    public void setSenhaS(char[] senhaS) {
        this.senhaS = senhaS;
    }

    public Pessoa getPessoa_sessao() {
        return Pessoa_sessao;
    }

    public void setPessoa_sessao(Pessoa Pessoa_sessao) {
        this.Pessoa_sessao = Pessoa_sessao;
    }

    public Empresa getEmpresa_sessao() {
        return Empresa_sessao;
    }

    public void setEmpresa_sessao(Empresa Empresa_sessao) {
        this.Empresa_sessao = Empresa_sessao;
    }

    public HashMap<String, String> getListaAmigo() {
        return listaAmigo;
    }

    public void setListaAmigo(HashMap<String, String> listaAmigo) {
        this.listaAmigo = listaAmigo;
    }
    
    
}