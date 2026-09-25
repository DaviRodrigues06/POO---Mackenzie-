import java.util.ArrayList;

public abstract class Restaurante{
    private String nome;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    private int totalAvaliacoes;

    public Restaurante(String nome){
        this.nome = nome;
    }

    public void adicionarAvaliacao(Avaliacao a){
        avaliacoes.add(a);
    }

    protected abstract double ajustarMedia(double media);

    public double calcularMedia(){
        int media = 0;

        for(Avaliacao avaliacao : avaliacoes){
            media += avaliacao.getNota();
        }

        return ajustarMedia( media / avaliacoes.size());
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Avaliacao> getAvaliacoes(){
        return avaliacoes;
    }

    public static int totalAvaliacoes(ArrayList<Restaurante> listaRestaurantes){
        int totalAvaliacoes = 0;
        for(Restaurante restaurante : listaRestaurantes){
            totalAvaliacoes = restaurante.getAvaliacoes().size();
        }
        return totalAvaliacoes;
    }

    public Restaurante melhorAvaliado(ArrayList<Restaurante> listaRestaurantes){
        Restaurante melhorAvaliado = null;
        for(Restaurante restaurante : listaRestaurantes){
            if(restaurante.calcularMedia() > melhorAvaliado.calcularMedia()){
                melhorAvaliado = restaurante;
            }
        }

        return melhorAvaliado;
    }


}