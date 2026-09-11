package ConcessionariaDeVeiculos;

public class VeiculoUsado extends Veiculo{

    private Integer quilometragem;
    private boolean unicoDono;

    public VeiculoUsado(String marca, String modelo, Integer ano, Double preco, String placa, Integer quilometragem, boolean unicoDono) {
        super(marca, modelo, ano, preco, placa);
        this.quilometragem = quilometragem;
        this.unicoDono = unicoDono;
    }

    @Override
    public String getDescricao(){
        return "Descrição do veículo:\nmarca: " + marca + "\nmodelo: " + modelo + "\nano: " + ano + "\npreço: " + preco + "\nquilometragem: " + quilometragem + "\nunico dono: " + unicoDono; 
    }

    
}
