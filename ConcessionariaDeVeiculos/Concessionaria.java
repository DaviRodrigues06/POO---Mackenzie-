package ConcessionariaDeVeiculos;

import java.util.ArrayList;
import java.util.Map;

public class Concessionaria {

    private Map<String, Veiculo> veiculos;
    private ArrayList<Veiculo> vendas;

    public Concessionaria(Map<String, Veiculo> veiculos, ArrayList<Veiculo> vendas){
        this.veiculos = veiculos;
        this.vendas = vendas;
    }

    public void cadastrarVeiculo(Veiculo veiculo){
        veiculos.put(veiculo.placa, veiculo);
    }

    public void registrarVenda(String chave){
        vendas.add(veiculos.get(chave));
        System.out.println("O "+ veiculos.get(chave).modelo +" foi vendido com sucesso!\n");
        veiculos.remove(chave);
    }

    public void exibirEstoque(){
        System.out.println("Estoque:");
        if (veiculos.isEmpty()){
            System.out.println("Nenhum veículo no estoque!");
            
        }else{
            for (Veiculo veiculo : veiculos.values()){
            System.out.println(veiculo.getDescricao() + "\n");
            }
        }
    }
    public void exibirVendas(){
        for(Veiculo veiculo : vendas){
            System.out.println("Veículos vendidos:\n" + veiculo.getDescricao() + "\n");
        }
    }
    
    
}
