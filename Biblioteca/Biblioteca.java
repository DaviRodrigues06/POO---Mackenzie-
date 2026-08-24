package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(ArrayList<Livro> livros, ArrayList<Usuario> usuarios){
        this.livros = livros;
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario user){
        usuarios.add(user);
    }

    public void removerUsuario(int id){
        usuarios.removeIf(u -> u.getId() == id);
    }

    public void editarUsuario(Usuario usuarioNovo){
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getId() == usuarioNovo.getId()){
                usuarios.set(i, usuarioNovo);
                return;
            }
        }
    }

    public ArrayList<Usuario> listarUsuarios(){
        return usuarios;
    }

    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public void removerLivro(int isbn){
        livros.removeIf(l -> l.getIsbn() == isbn);
    }

    public void editarLivro(Livro livroNovo){
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getIsbn() == livroNovo.getIsbn()){
                livros.set(i, livroNovo);
                return;
            }
        }
    }

    public ArrayList<Livro> listarLivros(){
        return livros;
    }

    public Livro buscarLivro(int isbn){
        for (Livro livro : livros) {
            if (livro.getIsbn() == isbn) {
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(int id){
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }
}