package Biblioteca;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private int id;
    private boolean adm;
    private ArrayList<Livro> livrosEmprestados = new ArrayList();
    private String senha;

    public Usuario(String nome, int id, boolean adm, String senha){
        this.nome = nome;
        this.id = id;
        this.adm = adm;
        this.senha = senha;
    }

    public Usuario() {
        //TODO Auto-generated constructor stub
    }

    public String getNome(){
        return this.nome;
    }
    public Integer getId(){
        return this.id;
    }

    public String getSenha(){
        return this.senha;
    }

    public boolean getAdm(){
        return this.adm;
    }

    public void emprestarLivro(Livro livro){
        if(livro.getDisponivel() && livrosEmprestados.size() < 6){
            this.livrosEmprestados.add(livro);
            livro.setDisponivel(false);
        }else{
            System.out.println("Livro indisponivel ou limite de emprestimos atingido.");
        }
    }
    
    public void devolverLivro(Livro livro){
        livrosEmprestados.remove(livro);
        livro.setDisponivel(true);
    }

    public void verLivrosEmprestados(){
        if(livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestado");
        }else{
            System.out.println("Livros emprestados:");
            for (Livro livro : livrosEmprestados) {
                System.out.println(livro.getTitulo());
                System.out.println(livro.getAutor());
                System.out.println(livro.getIsbn() + "\n");
            }
        }
        
    }
}
