package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeDeliveryTermsModelTest {

    private final String deliveryTypeCode = "DDP";

    @Test
    public void expectDeliveryTypeCode() {
        TradeDeliveryTermsModel.Builder builder = new TradeDeliveryTermsModel.Builder();
        TradeDeliveryTermsModel tradeDeliveryTermsModel = builder
                .deliveryTypeCode(this.deliveryTypeCode)
                .build();

        assertEquals(this.deliveryTypeCode, tradeDeliveryTermsModel.deliveryTypeCode);
    }
}
