package Composite;

public class BotaoLeaf implements ComponenteGUI {
   private String nome;

   public BotaoLeaf(String var1) {
      this.nome = var1;
    }

    public void renderizar(String var1) {
      System.out.println(var1 + "botão: " + this.nome);
   }
}
