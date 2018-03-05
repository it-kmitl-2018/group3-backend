package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecifiedLineTradeSettlementModelTest {

    private boolean chargeIndicator = true;
    private double actualAmount = 100.00;
    private double taxTotalAmount = 749.99;
    private double netLineTotalAmount = 10700.99;
    private double netIncludingTaxesLineTotalAmount = 11449.99;
    private double calculatedRate = 0.07;
    private double basisAmount = 100.00;
    private double calculatedAmount = 7.00;
    private String reasonCode = "82";
    private String reason = "Loading charge";
    private String taxTypeCode = "VAT";

    private TradeTaxModel tradeTaxModel =
            new TradeTaxModel.Builder()
                    .typeCode(this.taxTypeCode)
                    .calculatedRate(this.calculatedRate)
                    .basisAmount(this.basisAmount)
                    .calculatedAmount(this.calculatedAmount)
                    .build();

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
                .tradeTaxModel(this.tradeTaxModel)
                .specifiedTradeAllowanceChargeModel(this.tradeAllowanceCharge)
                .specifiedTradeSettlementMonetarySummationModel(this.tradeSettlementSummation)
                .build();

        assertEquals(this.tradeTaxModel, tradeSettlementModel.tradeTaxModel);
        assertEquals(this.tradeAllowanceCharge, tradeSettlementModel.specifiedTradeAllowanceChargeModel);
        assertEquals(this.tradeSettlementSummation,
                tradeSettlementModel.specifiedTradeSettlementMonetarySummationModel);
    }
}
