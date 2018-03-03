package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerOrderReferencedReferencedDocumentModelTest {

    private String issueAssignedID = "ABC1254";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private TypeCode referenceTypeCode = TypeCode.RECEIPT;

    @Test
    public void itShouldGetAllInfoByGetter() {
        BuyerOrderReferencedReferencedDocumentModel.Builder builder =
                BuyerOrderReferencedReferencedDocumentModel.builder();
        BuyerOrderReferencedReferencedDocumentModel buyOrderDocumentModel = builder
                .issueAssignedID(this.issueAssignedID)
                .issueDateTime(this.issueDateTime)
                .referenceTypeCode(this.referenceTypeCode)
                .build();

        assertEquals(this.issueAssignedID, buyOrderDocumentModel.issueAssignedID);
        assertEquals(this.issueDateTime, buyOrderDocumentModel.issueDateTime);
        assertEquals(this.referenceTypeCode, buyOrderDocumentModel.referenceTypeCode);
    }
}
