package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

public class IncludedNoteModel {

    private String subject;
    private String content;

    private IncludedNoteModel(InvoiceBuilder builder) {
        this.subject = builder.subject;
        this.content = builder.content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class InvoiceBuilder {

        private String subject;
        private String content;

        public InvoiceBuilder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public InvoiceBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public IncludedNoteModel build() {
            return new IncludedNoteModel(this);
        }
    }
}
