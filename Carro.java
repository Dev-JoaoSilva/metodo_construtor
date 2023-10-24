public class Carro{
    // 5 Atributos para o Carro com 5 Construtores
    private String cor;
    private String modelo;
    private String placa;
    private int aro;
    private double valorCarro;

    public int getAro() {
        return aro;
    }
    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorCarro() {
        return valorCarro;
    }
    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }
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