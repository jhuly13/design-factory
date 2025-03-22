package patters_factory;

import modelo.Orcamento;

import java.math.BigDecimal;

public interface CalculoPorRegiao {
    public BigDecimal calculoPorRegiao(Orcamento orcamento);
}
