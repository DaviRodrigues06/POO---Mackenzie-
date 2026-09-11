package ConcessionariaDeVeiculos;

public class VeiculoNovo extends Veiculo{

    private Integer garantiaAnos;

    public VeiculoNovo(String marca, String modelo, Integer ano, Double preco, String placa, Integer garantiaAnos) {
        super(marca, modelo, ano, preco, placa);
        this.garantiaAnos = garantiaAnos;        
    }

    @Override
    public String getDescricao() {
        String descricao = "Descrição do veículo:\nmarca: " + marca + "\nmodelo: " + modelo + "\nano: " + ano + "\npreço: " + preco + "\ngarantia em anos: " + garantiaAnos;
        return descricao; 
    }

}