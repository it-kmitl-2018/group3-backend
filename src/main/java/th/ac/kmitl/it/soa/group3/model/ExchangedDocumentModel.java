package th.ac.kmitl.it.soa.group3.model;

import org.omg.CORBA.TypeCode;
import java.sql.Timestamp;

public final class ExchangedDocumentModel {

    private final String id;
    private final String name;
    private final TypeCode typeCode;
    private final Timestamp issueDateTime;
    private final String purpose;
    private final TypeCode purposeCode;
    private final String globalID;
    private final Timestamp creationDateTime;
    private final IncludedNoteModel includedNote;

    private ExchangedDocumentModel(InvoiceBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.typeCode = builder.typeCode;
        this.issueDateTime = builder.issueDateTime;
        this.purpose = builder.purpose;
        this.purposeCode = builder.purposeCode;
        this.globalID = builder.globalID;
        this.creationDateTime = builder.creationDateTime;
        this.includedNote = builder.includedNote;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeCode getTypeCode() {
        return typeCode;
    }

    public Timestamp getIssueDateTime() {
        return issueDateTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public TypeCode getPurposeCode() {
        return purposeCode;
    }

    public String getGlobalID() {
        return globalID;
    }

    public Timestamp getCreationDateTime() {
        return creationDateTime;
    }

    public IncludedNoteModel getIncludedNote() {
        return includedNote;
    }

    public static class InvoiceBuilder {

        private final String id;
        private final Timestamp issueDateTime;
        private String name;
        private TypeCode typeCode;
        private String purpose;
        private TypeCode purposeCode;
        private String globalID;
        private Timestamp creationDateTime;
        private IncludedNoteModel includedNote;

        public InvoiceBuilder(String id,
                       Timestamp issueDateTime) {
            this.id = id;
            this.issueDateTime = issueDateTime;
        }

        public InvoiceBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceBuilder withTypeCode(TypeCode typeCode) {
            this.typeCode = typeCode;
            return this;
        }

        public InvoiceBuilder withPurpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        public InvoiceBuilder withPurposeCode(TypeCode purposeCode) {
            this.purposeCode = purposeCode;
            return this;
        }

        public InvoiceBuilder withGlobalID(String globalID) {
            this.globalID = globalID;
            return this;
        }

        public InvoiceBuilder withCreationDateTime(Timestamp creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }

        public InvoiceBuilder withIncludedNote(IncludedNoteModel includedNote) {
            this.includedNote = includedNote;
            return this;
        }

        public ExchangedDocumentModel build() {
            return new ExchangedDocumentModel(this);
        }
    }
}
