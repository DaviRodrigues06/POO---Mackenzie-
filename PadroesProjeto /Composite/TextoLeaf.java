package Composite;

public class TextoLeaf implements ComponenteGUI{
    private String conteudo;

    public TextoLeaf(String conteudo){
        this.conteudo = conteudo;
    }       

    public void renderizar(String identacao){
        System.out.println(identacao + "Texto: " + conteudo);
    }
}
