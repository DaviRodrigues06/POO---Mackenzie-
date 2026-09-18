public class ProdutoDigital extends Produto{

    private double tamanhoArquivoMB;

    private String formato;

    public ProdutoDigital(String nome, String categoria, double preco, String codigo, double tamanhoArquivoMB, String formato) {
        super(nome, categoria, preco, codigo);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
        this.formato = formato;
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "\nTamanho do arquivo em MB: " + tamanhoArquivoMB + "\nFormato do arquivo: " + formato;
    }
    
}
