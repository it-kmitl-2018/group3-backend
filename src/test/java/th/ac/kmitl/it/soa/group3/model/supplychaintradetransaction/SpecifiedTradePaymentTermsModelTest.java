package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTradePaymentTermsModelTest {

    private String typeCode = "888";
    private String description = "This is description";
    private Timestamp dueDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradePaymentTermsModel.Builder builder = new SpecifiedTradePaymentTermsModel.Builder();
        SpecifiedTradePaymentTermsModel tradePaymentTermsModel = builder
                .typeCode(this.typeCode)
                .description(this.description)
                .dueDateTime(this.dueDateTime)
                .build();

        assertEquals(this.typeCode, tradePaymentTermsModel.typeCode);
        assertEquals(this.description, tradePaymentTermsModel.description);
        assertEquals(this.dueDateTime, tradePaymentTermsModel.dueDateTime);
    }
}
