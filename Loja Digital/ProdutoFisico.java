public class ProdutoFisico extends Produto{

    private double pesoKg;

    public ProdutoFisico(String nome, String categoria, double preco, String codigo, double pesoKg) {
        super(nome, categoria, preco, codigo);
        this.pesoKg = pesoKg;
    }

    @Override 
    public String getDescricao(){
        return super.getDescricao() + "\nPeso em kg: " + pesoKg;
    }


}