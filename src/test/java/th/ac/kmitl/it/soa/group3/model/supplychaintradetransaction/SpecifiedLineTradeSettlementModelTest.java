package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecifiedLineTradeSettlementModelTest {

    private boolean chargeIndicator = true;
    private double actualAmount = 100.00;
    private double taxTotalAmount = 749.99;
    private double netLineTotalAmount = 10700.99;
    private double netIncludingTaxesLineTotalAmount = 11449.99;
    private String reasonCode = "ส่วนลดจากราคาปกติ";
    private String reason = "95";

    private SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge =
            new SpecifiedTradeAllowanceChargeModel.Builder()
                    .chargeIndicator(this.chargeIndicator)
                    .actualAmount(this.actualAmount)
                    .reasonCode(this.reasonCode)
                    .reason(this.reason)
                    .build();


    private SpecifiedTradeSettlementMonetarySummationModel tradeSettlementSummation =
            new SpecifiedTradeSettlementMonetarySummationModel.Builder()
                    .taxTotalAmount(this.taxTotalAmount)
                    .netLineTotalAmount(this.netLineTotalAmount)
                    .netIncludingTaxesLineTotalAmount(this.netIncludingTaxesLineTotalAmount)
                    .build();

    @Test
    public void expectTradeSettlementInfo() {
        SpecifiedLineTradeSettlementModel.Builder builder = new SpecifiedLineTradeSettlementModel.Builder();
        SpecifiedLineTradeSettlementModel tradeSettlementModel = builder
                .specifiedTradeAllowanceChargeModel(this.tradeAllowanceCharge)
                .specifiedTradeSettlementMonetarySummationModel(this.tradeSettlementSummation)
                .build();

        assertEquals(this.tradeAllowanceCharge, tradeSettlementModel.specifiedTradeAllowanceChargeModel);
        assertEquals(this.tradeSettlementSummation,
                tradeSettlementModel.specifiedTradeSettlementMonetarySummationModel);
    }
}
