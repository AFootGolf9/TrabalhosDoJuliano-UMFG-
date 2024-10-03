package pizza;

public class PizzaBuilder {
    private String massa;
    private String tamanho;
    private Pizza pizza = new Pizza();

    public PizzaBuilder() {
    }

    public PizzaBuilder setMassa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder setIngrediente(String ingrediente) {
        pizza.adicionaIngrediente(ingrediente);
        return this;
    }

    public Pizza build() {
        pizza.setMassa(massa);
        pizza.setTamanho(tamanho);
        return pizza;
    }
}
