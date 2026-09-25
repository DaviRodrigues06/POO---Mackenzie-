import java.util.ArrayList;

public class FastFood extends Restaurante{
    private String tipo;

    public FastFood(String nome, String tipo){
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public double ajustarMedia(double media){
        return media;
    }
}