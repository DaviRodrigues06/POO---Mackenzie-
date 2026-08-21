package Biblioteca;

public class Main {
    public static void main(String[] args){
        Usuario user1 = new Usuario("Davi", 0);
        Livro livro1 = new Livro(5874236589l, "O alquimista", "Paulo Coelho");

        user1.emprestarLivro(livro1);
        user1.verLivrosEmprestados();
        user1.devolverLivro(livro1);
        
    }
    
}
