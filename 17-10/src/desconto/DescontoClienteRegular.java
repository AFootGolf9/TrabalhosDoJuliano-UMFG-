package desconto;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double calcularDesconto(double total) {
        return total * 0.9;
    }
    
}
