public class FineDining extends Restaurante{
    private int estrelasMichelin;

    public FineDining(String nome, int estrelasMichelin){
        super(nome);
        this.estrelasMichelin = estrelasMichelin;
    }

    @Override
    public double ajustarMedia(double media){
        media += estrelasMichelin * 0.5;
        if(media > 5){
            media = 5;
        }
        return media;
    }

}