package desconto;

public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(double total) {
        return total;
    }
    
}
