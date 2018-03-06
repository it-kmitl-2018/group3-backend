package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.ExchangedDocumentModel;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

@RestController
@Api(value = "ExchangedDocument XML", description = "This is ExchangedDocument XML")
public class ExchangedDocumentController {

    @GetMapping(value = "/exchangeddoc")
    public ExchangedDocumentModel exchangedDocumentXML() {
        IncludedNoteModel includedNote = IncludedNoteModel.builder()
                .subject("หมายเหตุ")
                .content("ค่าบริการเพิ่มเติม")
                .build();
        ExchangedDocumentModel exchangedDocument = ExchangedDocumentModel.builder()
                .id("RDTIV0575526000058001")
                .name(TypeCode.TAX_INVOICE.getDescription())
                .typeCode(TypeCode.TAX_INVOICE.getTypeCode())
                .issueDateTime(new Timestamp(System.currentTimeMillis()))
                .purpose("คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง")
                .purposeCode("DCNS03")
                .globalID("ABCDEFGHIJKLMNOPQRST123456789012345")
                .creationDateTime(new Timestamp(System.currentTimeMillis()))
                .includedNote(includedNote)
                .build();

        return exchangedDocument;
    }
}
