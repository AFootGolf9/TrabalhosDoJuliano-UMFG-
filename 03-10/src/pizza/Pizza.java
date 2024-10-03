package pizza;

import java.util.ArrayList;

public class Pizza {
    private String massa;
    private String tamanho;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public Pizza(String massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;
    }
    
    public Pizza() {
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pizza [ingredientes=" + ingredientes + ", massa=" + massa + ", tamanho=" + tamanho + "]";
    }
}