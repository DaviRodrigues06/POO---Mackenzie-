package GerenciadorDeVeiculos;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String info;
    private double preco;
    private boolean ligado;
    private double velocidade;

    public Veiculo(String marca, String modelo, int ano, String info, double preco, boolean ligado, double velocidade){
        if(preco >= 0 && ano > 0){
            this.preco = preco;
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.info = info;
            this.ligado = ligado;
            this.velocidade = velocidade;
        }
        

    }

    public void ligar(){
        this.ligado =  true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public String info(){
        return this.info;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    

    
}
