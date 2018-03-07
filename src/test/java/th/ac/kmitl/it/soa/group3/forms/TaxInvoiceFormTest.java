package th.ac.kmitl.it.soa.group3.forms;

import org.junit.Test;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxInvoiceFormTest {

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
        TaxInvoiceForm taxInvoiceForm = new TaxInvoiceForm.Builder()
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

        assertEquals(this.id, taxInvoiceForm.id);
        assertEquals(this.name, taxInvoiceForm.name);
        assertEquals(this.typeCode, taxInvoiceForm.typeCode);
        assertEquals(this.issueDateTime, taxInvoiceForm.issueDateTime);
        assertEquals(this.purpose, taxInvoiceForm.purpose);
        assertEquals(this.purposeCode, taxInvoiceForm.purposeCode);
        assertEquals(this.globalID, taxInvoiceForm.globalID);
        assertEquals(this.creationDateTime, taxInvoiceForm.creationDateTime);
        assertEquals(this.subject, taxInvoiceForm.subject);
        assertEquals(this.content, taxInvoiceForm.content);
    }
}
