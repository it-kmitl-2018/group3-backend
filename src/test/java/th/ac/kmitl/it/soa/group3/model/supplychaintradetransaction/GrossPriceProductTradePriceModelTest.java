package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrossPriceProductTradePriceModelTest {

    private boolean chargeIndicator = true;
    private double chargeAmount = 2000.00;
    private double actualAmount = 100.00;
    private String reasonCode = "82";
    private String reason = "Loading charge";

    private SpecifiedTradeAllowanceChargeModel appliedTradeAllowanceCharge =
            new SpecifiedTradeAllowanceChargeModel.Builder()
                    .chargeIndicator(this.chargeIndicator)
                    .actualAmount(this.actualAmount)
                    .reasonCode(this.reasonCode)
                    .reason(this.reason)
                    .build();

    @Test
    public void expectGrossProductPrice() {
        GrossPriceProductTradePriceModel.Builder builder = new GrossPriceProductTradePriceModel.Builder();
        GrossPriceProductTradePriceModel grossPriceProductTradePriceModel = builder
                .chargeAmount(this.chargeAmount)
                .appliedTradeAllowanceCharge(this.appliedTradeAllowanceCharge)
                .build();

        assertEquals(this.chargeAmount, grossPriceProductTradePriceModel.chargeAmount);
        assertEquals(this.appliedTradeAllowanceCharge, grossPriceProductTradePriceModel.appliedTradeAllowanceCharge);
    }
}
