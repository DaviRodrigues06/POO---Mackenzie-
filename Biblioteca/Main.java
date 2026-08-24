package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(livros, usuarios);

        Scanner scanner = new Scanner(System.in);

        Usuario user1 = new Usuario("Davi", 0, true, "12345");
        Livro livro1 = new Livro(36589, "O alquimista", "Paulo Coelho");

        Usuario user2 = new Usuario("Kevin", 1, false, "123");


        biblioteca.addLivro(livro1);
        biblioteca.addUsuario(user1);
        biblioteca.addUsuario(user2);

        System.out.println("--- Login ---");
        System.out.print("ID usuario: ");
        int idLogin = scanner.nextInt();
        System.out.print("Senha: ");
        String senhaLogin = scanner.next();
        scanner.nextLine();

        Usuario usuarioLogado = null;

        for(Usuario usuario : biblioteca.listarUsuarios()){
            if(usuario.getId() == idLogin && usuario.getSenha().equals(senhaLogin)){
                usuarioLogado = usuario;
                break;
            }
        }

        if(usuarioLogado == null){
            System.out.println("Usuário ou senha inválidos.");
            return;
        }

        System.out.println("Login realizado! Bem-vindo, " + usuarioLogado.getNome() + "!");

        if(usuarioLogado.getAdm()){
            boolean menuAdm = true;
            while(menuAdm){
                System.out.println("\nMENU DE ADM:");
                System.out.println("1 - Adicionar usuario adm");
                System.out.println("2 - Remover usuario");
                System.out.println("3 - Adicionar livro");
                System.out.println("4 - Remover livro");
                System.out.println("5 - Listar usuarios");
                System.out.println("6 - Listar livros");
                System.out.println("7 - Buscar usuario por id");
                System.out.println("8 - Buscar livro por isbn");
                System.out.println("9 - Sair");
                System.out.print("Opção: ");
                
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch(opcao){
                    case 1:
                        System.out.print("Nome do novo adm: ");
                        String nome = scanner.nextLine();

                        System.out.print("ID do adm: ");
                        int idNova = scanner.nextInt();

                        System.out.print("Senha do novo adm: ");
                        String senhaNova = scanner.next();
                        scanner.nextLine();

                        biblioteca.addUsuario(new Usuario(nome, idNova, true, senhaNova));
                        System.out.println("Novo adm criado!");
                        break;
                    
                    case 2:
                        System.out.print("Informe o ID do usuario a ser removido: ");
                        int idRemoverUsuario = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.removerUsuario(idRemoverUsuario);
                        System.out.println("Usuario removido!");
                        break;

                    case 3:
                        System.out.print("Informe o titulo do livro: ");
                        String tituloLivroNovo = scanner.nextLine();

                        System.out.print("Informe o nome do autor do livro: ");
                        String autorLivroNovo = scanner.nextLine();

                        System.out.print("Informe o isbn do livro: ");
                        int isbnLivroNovo = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.addLivro(new Livro(isbnLivroNovo, tituloLivroNovo, autorLivroNovo));
                        System.out.println("Livro adicionado!");
                        break;

                    case 4:
                        System.out.print("Informe o isbn do livro a ser removido: ");
                        int isbnRemoverLivro = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.removerLivro(isbnRemoverLivro);
                        System.out.println("Livro removido!");
                        break;
                    
                    case 5:
                        for(Usuario u : biblioteca.listarUsuarios()){
                            System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome() + " | ADM: " + u.getAdm());
                        }
                        break;
                    
                    case 6:
                        if(livros.isEmpty()){
                            System.out.println("Nenhum livro cadastrado.");
                            break;
                        }
                        for (Livro livro : livros) {
                            System.out.println("Titulo: " + livro.getTitulo());
                            System.out.println("Autor: " + livro.getAutor());
                            System.out.println("Está disponível: " + livro.getDisponivel());
                            System.out.println("ISBN: " + livro.getIsbn() + "\n");
                        }
                        break;

                    case 7:
                        System.out.print("Digite o id do usuario que vc quer buscar: ");
                        int idBuscarUsuario = scanner.nextInt();
                        scanner.nextLine();

                        Usuario usuarioRetornado = biblioteca.buscarUsuario(idBuscarUsuario);

                        if(usuarioRetornado != null){
                            System.out.println("Nome: " + usuarioRetornado.getNome());
                            System.out.println("Id: " + usuarioRetornado.getId());
                            System.out.println("É adm: " + usuarioRetornado.getAdm());
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                        break;
                    case 8:
                        System.out.println("Digite o isbn do livro que vc quer buscar: ");
                        int isbnBuscarLivro = scanner.nextInt();

                        Livro livroRetornado = biblioteca.buscarLivro(isbnBuscarLivro);


                        if(livroRetornado != null){
                            System.out.println("Titulo: " + livroRetornado.getTitulo());
                            System.out.println("Autor: " + livroRetornado.getTitulo());
                            System.out.println("ISBN: " + livroRetornado.getIsbn());
                            System.out.println("Esta disponivel: " + livroRetornado.getDisponivel());

                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                        break;

                    case 9:
                        menuAdm = false;
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        }else{
            boolean menuUsuario = true;
            while(menuUsuario){
                System.out.println("\nMENU DE USUARIO:");
                System.out.println("1 - Ver livros disponiveis");
                System.out.println("2 - Alugar livro");
                System.out.println("3 - Devolver livro por isbn");
                System.out.println("4 - Ver meus livros alugados");
                System.out.println("5 - Sair");
                System.out.print("Opção: ");
                
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch(opcao){
                    case 1:
                        if(livros.isEmpty()){
                            System.out.println("Nenhum livro cadastrado.");
                            break;
                        }
                        for (Livro livro : livros) {
                            System.out.println("Titulo: " + livro.getTitulo());
                            System.out.println("Autor: " + livro.getAutor());
                            System.out.println("Está disponível: " + livro.getDisponivel());
                            System.out.println("ISBN: " + livro.getIsbn() + "\n");
                        }
                        break;
                    case 2:
                        System.out.println("Informe o isbn do livro que vc quer alugar:");
                        int isbnAlugar = scanner.nextInt();

                        usuarioLogado.emprestarLivro(biblioteca.buscarLivro(isbnAlugar));

                        System.out.println("Livro alugado!");
                        break;
                    case 3:
                        System.out.println("Informe o isbn do livro que vc quer devolver:");
                        int isbnDevolver = scanner.nextInt();

                        usuarioLogado.devolverLivro(biblioteca.buscarLivro(isbnDevolver));

                        System.out.println("Livro devolvido!");
                        break;
                    case 4:
                        usuarioLogado.verLivrosEmprestados();
                        break;
                    case 5:
                        System.out.println("saindo...");
                        menuUsuario = false;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }


            }
        }
    }
}