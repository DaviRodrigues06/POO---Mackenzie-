package GerenciadorDeVeiculos;

public class Caminhao extends Veiculo{

    private double capacidadeTon;
    private int eixos;

    public Caminhao(String marca, String modelo, int ano, String info, double preco, boolean ligado,
            double velocidade, double capacidadeTon, int eixos) {
        super(marca, modelo, ano, info, preco, ligado, velocidade);
        this.capacidadeTon = capacidadeTon;
        this.eixos = eixos;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String info(){
        return super.info();
    }
    
}
