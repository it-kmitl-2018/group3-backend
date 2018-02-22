package th.ac.kmitl.it.soa.group3.model;

import org.omg.CORBA.TypeCode;
import java.sql.Timestamp;

public class ExchangedDocumentModel {

    private String id;
    private String name;
    private TypeCode typeCode;
    private Timestamp issueDateTime;
    private String purpose;
    private TypeCode purposeCode;
    private String globalID;
    private Timestamp creationDateTime;

    public ExchangedDocumentModel() {
    }

    public ExchangedDocumentModel(String id, String name, TypeCode typeCode, Timestamp issueDateTime, String purpose, TypeCode purposeCode, String globalID, Timestamp creationDateTime) {
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.issueDateTime = issueDateTime;
        this.purpose = purpose;
        this.purposeCode = purposeCode;
        this.globalID = globalID;
        this.creationDateTime = creationDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeCode getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(TypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public Timestamp getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(Timestamp issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public TypeCode getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(TypeCode purposeCode) {
        this.purposeCode = purposeCode;
    }

    public String getGlobalID() {
        return globalID;
    }

    public void setGlobalID(String globalID) {
        this.globalID = globalID;
    }

    public Timestamp getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Timestamp creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
