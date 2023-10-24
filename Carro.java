public class Carro{
    // 5 Atributos para o Carro com 5 Construtores
    private String cor;
    private String modelo;
    private String placa;
    private int aro;
    private double valorCarro;

    public Carro(){

    }

    public Carro(int aro){
        this.aro=aro;
    }

    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }

    public Carro(int aro, String modelo, String placa){
        this.aro=aro;
        this.modelo=modelo;
        this.placa=placa;
    }

    public Carro(int aro, String modelo, String placa, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.placa=placa;
        this.cor=cor;
    }

    public Carro(int aro, String modelo, String placa, String cor, double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.placa=placa;
        this.cor=cor;
        this.valorCarro=valorCarro;
    }
}