package ConcessionariaDeVeiculos;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected Integer ano;
    protected Double preco;
    protected Integer totalVeiculos;
    protected String placa;

    public Veiculo(String marca, String modelo, Integer ano, Double preco, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.placa = placa;

    }

    public Integer getTotalVeiculos(){
        return this.totalVeiculos;
    }

    public String getDescricao(){
        return null;
    }
    
}
