package GerenciadorDeVeiculos;

public class Carro extends Veiculo{

    private int portas;
    private boolean temAirbag;

    public Carro(String marca, String modelo, int ano, String info, double preco, boolean ligado, double velocidade, int portas, boolean temAirbag) {
        super(marca, modelo, ano, info, preco, ligado, velocidade);

        this.portas = portas;
        this.temAirbag = temAirbag;
        
    }
    
    @Override
    public String info(){
        return super.info();
    }


    
}
