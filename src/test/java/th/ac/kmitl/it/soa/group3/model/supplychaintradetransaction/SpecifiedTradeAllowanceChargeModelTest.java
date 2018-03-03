package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTradeAllowanceChargeModelTest {

    private boolean chargeIndicator = true;
    private double actualAmount = 100.00;
    private String reasonCode = "ส่วนลดจากราคาปกติ";
    private String reason = "95";

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradeAllowanceChargeModel.Builder builder = new SpecifiedTradeAllowanceChargeModel.Builder();
        SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge = builder
                .chargeIndicator(this.chargeIndicator)
                .actualAmount(this.actualAmount)
                .reasonCode(this.reasonCode)
                .reason(this.reason)
                .build();

        assertEquals(this.chargeIndicator, tradeAllowanceCharge.chargeIndicator);
        assertEquals(this.actualAmount, tradeAllowanceCharge.actualAmount);
        assertEquals(this.reasonCode, tradeAllowanceCharge.reasonCode);
        assertEquals(this.reason, tradeAllowanceCharge.reason);
    }
}
