package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedLineTradeDeliveryModelTest {

    private int billedQuantity = 300;
    private int perPackageUnitQuantity = 10;

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedLineTradeDeliveryModel.Builder builder = new SpecifiedLineTradeDeliveryModel.Builder();
        SpecifiedLineTradeDeliveryModel lineTradeDelivery = builder
                .billedQuantity(this.billedQuantity)
                .perPackageUnitQuantity(this.perPackageUnitQuantity)
                .build();

        assertEquals(this.billedQuantity, lineTradeDelivery.billedQuantity);
        assertEquals(this.perPackageUnitQuantity, lineTradeDelivery.perPackageUnitQuantity);
    }
}
