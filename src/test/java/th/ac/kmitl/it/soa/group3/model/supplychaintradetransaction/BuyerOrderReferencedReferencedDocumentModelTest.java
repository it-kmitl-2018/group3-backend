package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerOrderReferencedReferencedDocumentModelTest {

    private String issueAssignedID = "ABC1254";
    private Timestamp issueDateTime = new Timestamp(1526199106608l);
    private TypeCode referenceTypeCode = TypeCode.RECEIPT;
    private BuyerOrderReferencedReferencedDocumentModel buyOrderDocumentModel;
    private String expectedXML = "<BuyerOrderReferencedReferencedDocumentModel>" +
            "<ram:IssuerAssignedID>ABC1254</ram:IssuerAssignedID>" +
            "<ram:IssueDateTime>1526199106608</ram:IssueDateTime>" +
            "<ram:ReferenceTypeCode>RECEIPT</ram:ReferenceTypeCode>" +
            "</BuyerOrderReferencedReferencedDocumentModel>";

    @Before
    public void beforeEachTest() {
        this.buyOrderDocumentModel = BuyerOrderReferencedReferencedDocumentModel.builder()
                .issueAssignedID(this.issueAssignedID)
                .issueDateTime(this.issueDateTime)
                .referenceTypeCode(this.referenceTypeCode)
                .build();
    }

    @Test
    public void itShouldGetAllInfoByGetter() {
        assertEquals(this.issueAssignedID, this.buyOrderDocumentModel.issueAssignedID);
        assertEquals(this.issueDateTime, this.buyOrderDocumentModel.issueDateTime);
        assertEquals(this.referenceTypeCode, this.buyOrderDocumentModel.referenceTypeCode);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.buyOrderDocumentModel);

        assertEquals(this.expectedXML, xml);
    }
}
