package Biblioteca;

public class Livro {

    private int isbn;
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(int isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar(Usuario usuario){
        disponivel = false;
        System.out.println("O livro foi emprestado para o usuario:");
        System.out.println(usuario.getId());
    }

    public int getIsbn(){
        return this.isbn;
    }
    public void setDisponivel(boolean i){
        disponivel = i;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean getDisponivel(){
        return this.disponivel;
    }
    
}
