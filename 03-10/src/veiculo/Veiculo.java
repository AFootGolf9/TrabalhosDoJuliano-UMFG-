package veiculo;

public class Veiculo {
    private String tipo;
    private String cor;
    private int rodas;

    public Veiculo(String tipo, String cor, int rodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.rodas = rodas;
    }

    public Veiculo() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo [cor=" + cor + ", rodas=" + rodas + ", tipo=" + tipo + "]";
    }
}
