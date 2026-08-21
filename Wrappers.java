import java.util.Scanner;

public class Wrappers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numeroInt = input.nextInt();

        System.out.println("Digite um numero decimal:");
        float numeroFloat = input.nextFloat();

        System.out.println("Digite um numero long:");
        long numeroLong = input.nextLong();

        System.out.println("Digite um char:");
        char caractere = input.next().charAt(0);

        Integer numeroInteger = Integer.valueOf(numeroInt);
        Float numeroFloat2 = Float.valueOf(numeroFloat);
        Long numeroLong2 = Long.valueOf(numeroLong);
        Character caractere2 = Character.valueOf(caractere);

        numeroInteger += 10;

        numeroLong2 -= 100;

        numeroFloat2 *= 2.5f;

        System.out.println("Integer + 10: " + numeroInteger + "\nLong - 100: " + numeroLong2 + "\nFloat * 2.5: " + numeroFloat2 + "\n");

        if(Character.isLetter(caractere2)){
            System.out.println("Caractere é uma letra");
        }else{
            System.out.println("Não é uma letra");
        }

    }
}