package desconto;

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double total) {
        return total * 0.8;
    }
    
}
