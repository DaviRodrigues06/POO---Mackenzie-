public abstract class Produto {

    private String nome;
    private String categoria;
    private double preco;
    private String codigo;

    public Produto(String nome, String categoria, double preco, String codigo){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getDescricao(){
        return "Nome: "+ nome + "\nCategoria: " + categoria + "\nPreço: " + preco + "\nCódigo: " + codigo
        ;
    }

    public String toString(){
        return "";

    }

    public String getCodigo(){
        return codigo;
    }
    
    
}
