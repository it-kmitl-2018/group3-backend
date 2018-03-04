package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTaxModelTest {

    private final String typeCode = "VAT";
    private final double calculatedRate = 0.07;
    private final double basisAmount = 100.00;
    private final double calculatedAmount = 7.00;

    @Test
    public void expectTradingTaxInfo() {
        TradeTaxModel.Builder builder =  new TradeTaxModel.Builder();
        TradeTaxModel tradeTaxModel = builder
                .typeCode(this.typeCode)
                .calculatedRate(this.calculatedRate)
                .basisAmount(this.basisAmount)
                .calculatedAmount(this.calculatedAmount)
                .build();

        assertEquals(this.typeCode, tradeTaxModel.typeCode);
        assertEquals(this.calculatedRate, tradeTaxModel.calculatedRate);
        assertEquals(this.basisAmount, tradeTaxModel.basisAmount);
        assertEquals(this.calculatedAmount, tradeTaxModel.calculatedAmount);
    }
}
