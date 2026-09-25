import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Restaurante> listaRestaurantes = new ArrayList();

        Restaurante restaurante1 = new FastFood("McDonald's", "Hamburguer");
        Restaurante restaurante2 = new FineDining("Habibs", 2);

        listaRestaurantes.add(restaurante1);
        listaRestaurantes.add(restaurante2);

        Avaliacao avaliacao1 = new Avaliacao("01/01/2024", 5, "Ótimo atendimento!");
        Avaliacao avaliacao2 = new Avaliacao("02/01/2024", 4, "Comida boa, mas poderia ser mais rápida.");
        Avaliacao avaliacao3 = new Avaliacao("03/01/2024", 3, "Preço justo, mas o ambiente é barulhento.");

        restaurante1.adicionarAvaliacao(avaliacao1);
        restaurante1.adicionarAvaliacao(avaliacao2);
        restaurante1.adicionarAvaliacao(avaliacao3);

        restaurante2.adicionarAvaliacao(avaliacao1);
        restaurante2.adicionarAvaliacao(avaliacao2);
        restaurante2.adicionarAvaliacao(avaliacao3);

        


    }
}
