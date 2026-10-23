package Composite;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        BotaoLeaf botao1 = new BotaoLeaf("Salvar");
        BotaoLeaf botao2 = new BotaoLeaf("Cancelar");
        TextoLeaf texto1 = new TextoLeaf("Bem-vindo ao sistema!");

        PainelComposite painelPrincipal = new PainelComposite("Tela Principal");

        PainelComposite painelSecundario = new PainelComposite("Menu de Opções");

        painelSecundario.adicionarComponente(botao1);
        painelSecundario.adicionarComponente(botao2);

        painelPrincipal.adicionarComponente(texto1);
        painelPrincipal.adicionarComponente(painelSecundario);

        painelPrincipal.renderizar("");
        

    }
}