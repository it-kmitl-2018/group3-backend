package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

import lombok.Builder;
import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class ExchangedDocumentModel {

    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime;
    public String purpose;
    public String purposeCode;
    public String globalID;
    public Timestamp creationDateTime;
    public IncludedNoteModel includedNote;
}
