package GerenciadorDeVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    List<Veiculo> estoque = new ArrayList<>();


public void adicionar(Veiculo veiculo){
    estoque.add(veiculo);

}

public void removerPorModelo(String modelo){
    for(Veiculo veiculo : estoque){
        if(veiculo.getModelo().equals(modelo)){
            estoque.remove(veiculo);
        }
    }

}

public List<Veiculo> buscarPorMarca(String marca){

    List<Veiculo> veiculosMarca = new ArrayList<>();

    for(Veiculo veiculo : estoque){
        if(veiculo.getMarca().equals(marca)){
            veiculosMarca.add(veiculo);
        }
    }
    return veiculosMarca;
}

public void listar(){
    for(Veiculo veiculo : estoque){
        System.out.println(veiculo.getInfo() + "\n");
    }
    
}

public double valorTotalEstoque(){
    double valorTotalEstoque = 0;
    for(Veiculo veiculo : estoque){
        valorTotalEstoque += veiculo.getPreco();
        }
        return valorTotalEstoque;
    }
    
}
    

