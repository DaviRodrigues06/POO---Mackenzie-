public class FineDining extends Restaurante{
    private int estrelasMichelin;

    public FineDining(String nome, int estrelasMichelin){
        super(nome);
        this.estrelasMichelin = estrelasMichelin;
    }

    @Override
    public double ajustarMedia(double media){
        
    }

}