package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

import org.junit.Test;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import static org.junit.jupiter.api.Assertions.*;

public class ExchangedDocumentModelTest {

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

    private IncludedNoteModel includedNote = new IncludedNoteModel.Builder()
            .subject(this.subject)
            .content(this.content)
            .build();

    @Test
    public void itShouldGetAllInfoByGetter() {
        ExchangedDocumentModel.Builder builder = new ExchangedDocumentModel.Builder();
        ExchangedDocumentModel exchangedDocument = builder
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalID(this.globalID)
                .creationDateTime(this.creationDateTime)
                .includedNote(this.includedNote)
                .build();

        assertEquals(this.id, exchangedDocument.id);
        assertEquals(this.name, exchangedDocument.name);
        assertEquals(this.typeCode, exchangedDocument.typeCode);
        assertEquals(this.issueDateTime, exchangedDocument.issueDateTime);
        assertEquals(this.purpose, exchangedDocument.purpose);
        assertEquals(this.purposeCode, exchangedDocument.purposeCode);
        assertEquals(this.globalID, exchangedDocument.globalID);
        assertEquals(this.creationDateTime, exchangedDocument.creationDateTime);
        assertEquals(this.includedNote, exchangedDocument.includedNote);
    }
}
