package Composite;

import java.util.ArrayList;

public class PainelComposite implements ComponenteGUI{
    private String nome;
    private ArrayList<ComponenteGUI> listaComponentes = new ArrayList<ComponenteGUI>();

    public PainelComposite(String nome){
        this.nome = nome;
    }

    public void renderizar(String identacao){
        System.out.println(identacao + "Pasta: " + nome);

        for(ComponenteGUI comp : listaComponentes){
            comp.renderizar(" ");
        }
    }

    public void adicionarComponente(ComponenteGUI componente){
        listaComponentes.add(componente);
    }
}
