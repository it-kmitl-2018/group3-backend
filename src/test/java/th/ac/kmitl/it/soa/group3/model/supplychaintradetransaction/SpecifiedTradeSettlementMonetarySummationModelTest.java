package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTradeSettlementMonetarySummationModelTest {

    private double taxTotalAmount = 749;
    private double netLineTotalAmount = 10700;
    private double netIncludingTaxesLineTotalAmount = 11449;

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradeSettlementMonetarySummationModel.Builder builder =
                new SpecifiedTradeSettlementMonetarySummationModel.Builder();
        SpecifiedTradeSettlementMonetarySummationModel tradeSettlementModel = builder
                .taxTotalAmount(this.taxTotalAmount)
                .netLineTotalAmount(this.netLineTotalAmount)
                .netIncludingTaxesLineTotalAmount(this.netIncludingTaxesLineTotalAmount)
                .build();

        assertEquals(this.taxTotalAmount, tradeSettlementModel.taxTotalAmount);
        assertEquals(this.netLineTotalAmount, tradeSettlementModel.netLineTotalAmount);
        assertEquals(this.netIncludingTaxesLineTotalAmount, tradeSettlementModel.netIncludingTaxesLineTotalAmount);
    }
}
