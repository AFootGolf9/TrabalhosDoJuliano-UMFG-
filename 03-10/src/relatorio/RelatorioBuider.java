package relatorio;

public class RelatorioBuider {
    private Relatorio relatorio = new Relatorio();

    public RelatorioBuider() {
    }

    public RelatorioBuider setTitulo(String titulo) {
        relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuider setDescricao(String descricao) {
        relatorio.setDescricao(descricao);
        return this;
    }

    public RelatorioBuider setRodape(String rodape) {
        relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build() {
        return relatorio;
    }
}
