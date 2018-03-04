package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class IndividualTradeProductInstanceModelTest {

    private String batchID = "1/8";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void itShouldGetAllInfoByGetter() {
        IndividualTradeProductInstanceModel.Builder builder = new IndividualTradeProductInstanceModel.Builder();
        IndividualTradeProductInstanceModel tradeProductInstance = builder
                .batchID(this.batchID)
                .expiryDateTime(this.expiryDateTime)
                .build();

        assertEquals(this.batchID, tradeProductInstance.batchID);
        assertEquals(this.expiryDateTime, tradeProductInstance.expiryDateTime);
    }
}
