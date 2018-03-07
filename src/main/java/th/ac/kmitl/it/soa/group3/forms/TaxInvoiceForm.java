package th.ac.kmitl.it.soa.group3.forms;

import lombok.Builder;
import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class TaxInvoiceForm {

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

    public TaxInvoiceForm() {
    }

    public TaxInvoiceForm(String id,
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
}
