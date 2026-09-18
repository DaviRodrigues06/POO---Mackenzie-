import java.util.ArrayList;
import java.util.HashMap;

public class Loja {

    HashMap<String, Produto> produtos;

    ArrayList<Produto> vendas;

    public Loja(HashMap<String, Produto> produtos, ArrayList<Produto> vendas){
        this.produtos = produtos;
        this.vendas = vendas;
    }

    public void cadastrarProduto(Produto produto){
        produtos.put(produto.getCodigo(), produto);
    }

    public void registrarVenda(String codigo){
        System.out.println("O produto "+ codigo + " foi vendido!");
        vendas.add(produtos.remove(codigo));
    }

    public void exibirEstoque(){
        System.out.println("Estoque:");
        for(Produto produto : produtos.values()){
            System.out.println(produto.getDescricao() + "\n");
        }
    }

    public void exibirVendas(){
        System.out.println("Vendas:");
        for(Produto produto : vendas){
            System.out.println(produto.getDescricao() + "\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<Produto> vendas = new ArrayList<>();
        HashMap<String, Produto> produtos = new HashMap<>();

        Loja loja = new Loja(produtos, vendas);

        Produto produto0 = new ProdutoFisico("Iphone Duo","Eletrônicos", 21000.0, "aaa", 0.2);
        Produto produto1 = new ProdutoFisico("Blusa nike", "Roupa", 300.0, "aab", 0.3);
        Produto produto2 = new ProdutoDigital("Zelda", "Jogo", 350.0, "aac", 6000, ".java");
        Produto produto3 = new ProdutoDigital("Codex", "Assinatura", 99.99, "aad", 5000, ".java");

        loja.cadastrarProduto(produto0);
        loja.cadastrarProduto(produto1);
        loja.cadastrarProduto(produto2);
        loja.cadastrarProduto(produto3);

        loja.exibirEstoque();

        loja.registrarVenda("aaa");

        loja.exibirEstoque();

        loja.exibirVendas();



    }
    
}
