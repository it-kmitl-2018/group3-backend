package th.ac.kmitl.it.soa.group3.model;

public class IncludedNoteModel {

    private String subject;
    private String content;

    public IncludedNoteModel() {
    }

    public IncludedNoteModel(String subject,
                             String content) {
        this.subject = subject;
        this.content = content;
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
}
