import java.util.Scanner;

interface FreteStrategy{
    public double calcularFrete(double peso, double valor);
}

class SedexFrete implements FreteStrategy{
    public double calcularFrete(double peso, double valor){
        return peso*1.45;
    }
}

class PacFrete implements FreteStrategy{
    public double calcularFrete(double peso, double valor){
        return peso*1.1;
    }
}

class FreteGratis implements FreteStrategy{
    public double calcularFrete(double peso, double valor){
        if(valor>200){
            return 0;
        }else{
            return peso;
        }
    }
}

class CalculadoraFrete{
    private FreteStrategy estrategia;

    void setEstrategia(FreteStrategy estrategia){
        this.estrategia = estrategia;
    }

    public double calcular(double peso, double valor){
        return estrategia.calcularFrete(peso, valor);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraFrete calc = new CalculadoraFrete();

        System.out.println("Qual é o peso do produto?");
        double peso = scanner.nextDouble();

        System.out.println("Qual é o valor do produto?");
        double valor = scanner.nextDouble();

        if(valor > 200){
            calc.setEstrategia(new FreteGratis());
            System.out.println("Parabéns, voce ganhou frete grátis!");
        }else{
            calc.setEstrategia(new SedexFrete());
            System.out.println("Frete pelo sedex:" + calc.calcular(3.0, 400.0));

            calc.setEstrategia(new PacFrete());
            System.out.println("Frete pelo PAC:" + calc.calcular(3.0, 400.0));
        }


    }
}