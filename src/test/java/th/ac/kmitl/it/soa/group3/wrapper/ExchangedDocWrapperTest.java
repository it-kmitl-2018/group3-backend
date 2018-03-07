package th.ac.kmitl.it.soa.group3.wrapper;

import java.sql.Timestamp;
import org.junit.Test;
import th.ac.kmitl.it.soa.group3.forms.TaxInvoiceForm;
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
    private TaxInvoiceForm taxInvoiceForm;

    @Test
    public void itShouldGetAllInfoByGetter() {
        this.taxInvoiceForm = TaxInvoiceForm.builder()
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
        ExchangedDocWrapper wrapper = new ExchangedDocWrapper(taxInvoiceForm);

        assertEquals(this.taxInvoiceForm, wrapper.taxInvoiceForm);
    }
}
