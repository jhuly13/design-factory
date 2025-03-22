package teste;

import modelo.Orcamento;
import patters_factory.IcmsFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento("ICMS_MG", new BigDecimal("800.0"));
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado("ICMS_SP").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}
