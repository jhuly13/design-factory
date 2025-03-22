package modelo;

import java.math.BigDecimal;

public class Orcamento {
    public BigDecimal valorOrcamento;
    private String IcmsRegiao;

    public Orcamento(String icmsRegiao, BigDecimal valorOrcamento) {
        IcmsRegiao = icmsRegiao;
        this.valorOrcamento = valorOrcamento;
    }
}
