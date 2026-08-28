package GerenciadorDeVeiculos;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String info, double preco, boolean ligado, double velocidade, int cilindradas) {
        super(marca, modelo, ano, info, preco, ligado, velocidade);
        this.cilindradas = cilindradas;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String info(){
        return this.info();
    }


    
}
