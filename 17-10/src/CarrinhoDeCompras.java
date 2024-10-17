import java.util.ArrayList;

import desconto.DescontoStrategy;

public class CarrinhoDeCompras {
    
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    DescontoStrategy descontoEstrategy;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoEstrategy) {
        this.descontoEstrategy = descontoEstrategy;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return descontoEstrategy.calcularDesconto(total);
    }
}
