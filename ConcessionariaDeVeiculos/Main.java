package ConcessionariaDeVeiculos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        ArrayList<Veiculo> vendas = new ArrayList<>();
        Map<String, Veiculo> listaVeiculos = new HashMap<>();
        Concessionaria concessionaria = new Concessionaria(listaVeiculos, vendas);
       
        VeiculoNovo veiculo = new VeiculoNovo("Volkswagen", "Nivus highline", 2023, 100000.00,"ACB123", 1);
        VeiculoUsado veiculo2 = new VeiculoUsado("Chevrolet", "Meriva", 2008, 30000.00, "EAI3422", 93000, true);
        
        concessionaria.cadastrarVeiculo(veiculo);
        concessionaria.cadastrarVeiculo(veiculo2);

        concessionaria.exibirEstoque();

        concessionaria.registrarVenda(veiculo.placa);

        concessionaria.exibirEstoque();

        concessionaria.exibirVendas();
        
    }
    
}
