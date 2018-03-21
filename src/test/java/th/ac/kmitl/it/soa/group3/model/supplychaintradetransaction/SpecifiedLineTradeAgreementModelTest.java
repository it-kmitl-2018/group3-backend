package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedLineTradeAgreementModelTest {

    private boolean chargeIndicator = true;
    private double chargeAmount = 2000.00;
    private double actualAmount = 100.00;
    private String reasonCode = "82";
    private String reason = "Loading charge";

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge = new SpecifiedTradeAllowanceChargeModel.Builder()
                .chargeIndicator(this.chargeIndicator)
                .actualAmount(this.actualAmount)
                .reasonCode(this.reasonCode)
                .reason(this.reason)
                .build();

        GrossPriceProductTradePriceModel grossPrice = new GrossPriceProductTradePriceModel.Builder()
                .chargeAmount(this.chargeAmount)
                .appliedTradeAllowanceCharge(tradeAllowanceCharge)
                .build();

        SpecifiedLineTradeAgreementModel lineTradeAgreement = new SpecifiedLineTradeAgreementModel.Builder()
                .grossPriceProductTradePrice(grossPrice)
                .build();

        assertEquals(this.chargeIndicator, lineTradeAgreement
                .grossPriceProductTradePrice
                .appliedTradeAllowanceCharge
                .chargeIndicator);
        assertEquals(this.chargeAmount, lineTradeAgreement
                .grossPriceProductTradePrice
                .chargeAmount);
        assertEquals(this.actualAmount, lineTradeAgreement
                .grossPriceProductTradePrice
                .appliedTradeAllowanceCharge
                .actualAmount);
        assertEquals(this.reasonCode, lineTradeAgreement
                .grossPriceProductTradePrice
                .appliedTradeAllowanceCharge
                .reasonCode);
        assertEquals(this.reason, lineTradeAgreement
                .grossPriceProductTradePrice
                .appliedTradeAllowanceCharge
                .reason);
    }
}
