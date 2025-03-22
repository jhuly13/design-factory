package patters_factory;

import modelo.Orcamento;

import java.math.BigDecimal;

public class IcmsRJ implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new
                BigDecimal("0.17"));
    }
}