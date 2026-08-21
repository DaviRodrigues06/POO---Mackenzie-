package Biblioteca;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private Integer id;
    private ArrayList<Livro> livrosEmprestados = new ArrayList();

    public Usuario(String nome, Integer id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public Integer getId(){
        return this.id;
    }

    public void emprestarLivro(Livro livro){
        if(livro.getDisponivel()){
            this.livrosEmprestados.add(livro);
        }
    }
    
    public void devolverLivro(Livro livro){
        livrosEmprestados.remove(livro);
        livro.setDisponivel(false);
    }

    public void verLivrosEmprestados(){
        for (Livro livro : livrosEmprestados) {
            System.out.println(livro.getTitulo());
        }
    }
}
