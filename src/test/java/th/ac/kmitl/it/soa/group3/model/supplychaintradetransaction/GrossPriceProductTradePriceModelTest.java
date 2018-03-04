package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrossPriceProductTradePriceModelTest {

    private double chargeAmount = 2000.00;

    @Test
    public void expectGrossProductPrice() {
        GrossPriceProductTradePriceModel.Builder builder = new GrossPriceProductTradePriceModel.Builder();
        GrossPriceProductTradePriceModel grossPriceProductTradePriceModel = builder
                .chargeAmount(this.chargeAmount)
                .build();

        assertEquals(this.chargeAmount, grossPriceProductTradePriceModel.chargeAmount);
    }
}
