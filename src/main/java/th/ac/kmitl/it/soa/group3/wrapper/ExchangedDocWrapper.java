package th.ac.kmitl.it.soa.group3.wrapper;

import lombok.Builder;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.ExchangedDocumentModel;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

@Builder(builderClassName = "Builder")
public class ExchangedDocWrapper {

    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime;
    public String purpose;
    public String purposeCode;
    public String globalID;
    public Timestamp creationDateTime;
    public String subject;
    public String content;

    public ExchangedDocWrapper() {
    }

    public ExchangedDocWrapper(String id,
                               String name,
                               String typeCode,
                               Timestamp issueDateTime,
                               String purpose,
                               String purposeCode,
                               String globalID,
                               Timestamp creationDateTime,
                               String subject,
                               String content) {
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.issueDateTime = issueDateTime;
        this.purpose = purpose;
        this.purposeCode = purposeCode;
        this.globalID = globalID;
        this.creationDateTime = creationDateTime;
        this.subject = subject;
        this.content = content;
    }

    public ExchangedDocumentModel getModelClass() {
        IncludedNoteModel includedNote = IncludedNoteModel.builder()
                .subject(this.subject)
                .content(this.content)
                .build();
        ExchangedDocumentModel exchangedDocument = ExchangedDocumentModel.builder()
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .creationDateTime(this.creationDateTime)
                .includedNote(includedNote)
                .build();

        return exchangedDocument;
    }
}
