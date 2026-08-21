import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Jokempo {
    static int vitoriasJog = 0, vitoriasComp = 0, empates = 0;
    static String[] listaOpcoes = {"Pedra", "Papel", "Tesoura"};
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int jogador = menu();
            
            int maquina = random.nextInt(3) + 1;

            jogar(jogador, maquina);
            continuar = continuarJogando();
        }

    }

    public static int menu() {
        int opcao = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nEscolha uma opção:\n1 - Pedra\n2 - Papel\n3 - Tesoura\n");
            try {
                opcao = scanner.nextInt();
                if (opcao >= 1 && opcao <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Digite 1, 2 ou 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número válido");
                scanner.nextLine(); 
            }
        }
        return opcao;
    }

    public static void jogar(int jogadaJog, int jogadaComp) {
        System.out.println("Você jogou: " + listaOpcoes[jogadaJog - 1]);
        System.out.println("A máquina jogou: " + listaOpcoes[jogadaComp - 1]);

        if (jogadaJog == jogadaComp) {
            empates++;
            System.out.println("Resultado: Empate!");
        } else if (jogadaComp == jogadaJog + 1 || (jogadaComp == 1 && jogadaJog == 3)) {
            vitoriasComp++;
            System.out.println("Resultado: Computador ganhou!");
        } else {
            vitoriasJog++;
            System.out.println("Resultado: Você ganhou!");
        }
    }

    public static boolean continuarJogando() {
        System.out.println("\nDeseja jogar novamente? (s/n)");
        char escolha = scanner.next().toLowerCase().charAt(0);

        while (escolha != 'n' && escolha != 's') {
            System.out.println("Opção inválida! Deseja jogar novamente? (s/n)");
            escolha = scanner.next().toLowerCase().charAt(0);
        }

        if (escolha == 'n') {
            System.out.println("\nPLACAR FINAL");
            System.out.println("Vitórias: " + vitoriasJog);
            System.out.println("Derrotas: " + vitoriasComp);
            System.out.println("Empates: " + empates);
            System.out.println("Finalizando...");
            return false;
        }
        return true;
    }
}