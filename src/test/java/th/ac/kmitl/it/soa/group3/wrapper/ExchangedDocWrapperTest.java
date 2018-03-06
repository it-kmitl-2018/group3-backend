package th.ac.kmitl.it.soa.group3.wrapper;

import java.sql.Timestamp;

import org.junit.Test;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangedDocWrapperTest {

    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";
    private String id = "RDTIV0575526000058001";
    private String name = TypeCode.TAX_INVOICE.getDescription();
    private String typeCode = TypeCode.TAX_INVOICE.getTypeCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void itShouldGetAllInfoByGetter() {
        ExchangedDocWrapper.Builder builder = new ExchangedDocWrapper.Builder();
        ExchangedDocWrapper wrapper = builder
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalID(this.globalID)
                .creationDateTime(this.creationDateTime)
                .subject(this.subject)
                .content(this.content)
                .build();

        assertEquals(this.id, wrapper.id);
        assertEquals(this.name, wrapper.name);
        assertEquals(this.typeCode, wrapper.typeCode);
        assertEquals(this.issueDateTime, wrapper.issueDateTime);
        assertEquals(this.purpose, wrapper.purpose);
        assertEquals(this.purposeCode, wrapper.purposeCode);
        assertEquals(this.globalID, wrapper.globalID);
        assertEquals(this.creationDateTime, wrapper.creationDateTime);
        assertEquals(this.subject, wrapper.subject);
        assertEquals(this.content, wrapper.content);
    }
}
