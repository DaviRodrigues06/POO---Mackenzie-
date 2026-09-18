package GerenciadorDeVeiculos;

public class Main {
    public static void main(String[] args) {
    Concessionaria concessionaria = new Concessionaria();

    Carro carro = new Carro("Toyota", "Corolla", 2024,
        "Carro Toyota Corolla - 4 portas e airbag", 145000, false, 0, 4, true);
    Moto moto = new Moto("Honda", "CB 500", 2023,
        "Moto Honda CB 500 - 471 cilindradas", 42000, false, 0, 471);
    Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2022,
        "Caminhao Volvo FH 540 - capacidade de 25 toneladas", 650000, false, 0, 25, 6);

    concessionaria.adicionar(carro);
    concessionaria.adicionar(moto);
    concessionaria.adicionar(caminhao);

    System.out.println("Veiculos em estoque:");
    concessionaria.listar();

    System.out.printf("IPVA do %s: R$ %.2f%n", carro.getModelo(), carro.calcularIPVA());
    System.out.printf("IPVA da %s: R$ %.2f%n", moto.getModelo(), moto.calcularIPVA());
    System.out.printf("IPVA do %s: R$ %.2f%n", caminhao.getModelo(), caminhao.calcularIPVA());

    System.out.println("\nDemonstracao com o carro:");
    carro.ligar();
    System.out.println("Carro ligado: " + carro.isLigado());
    carro.acelerar();
    System.out.println("Velocidade apos acelerar: " + carro.getVelocidade() + " km/h");
    carro.frear();
    System.out.println("Velocidade apos frear: " + carro.getVelocidade() + " km/h");
    carro.desligar();
    System.out.println("Carro ligado: " + carro.isLigado());
    }
    
}
