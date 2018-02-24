package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;
import java.sql.Timestamp;

public class BuyerOrderReferencedReferencedDocumentModel {

    private String issuerAssignedID;
    private Timestamp issueDateTime;
    private TypeCode referenceTypeCode;

    private BuyerOrderReferencedReferencedDocumentModel(Builder builder) {
        this.issuerAssignedID = builder.issuerAssignedID;
        this.issueDateTime = builder.issueDateTime;
        this.referenceTypeCode = builder.referenceTypeCode;
    }

    public String getIssueAssignedID() {
        return issuerAssignedID;
    }

    public void setIssueAssignedID(String issueAssignedID) {
        this.issuerAssignedID = issueAssignedID;
    }

    public Timestamp getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(Timestamp issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public TypeCode getReferenceTypeCode() {
        return referenceTypeCode;
    }

    public void setReferenceTypeCode(TypeCode referenceTypeCode) {
        this.referenceTypeCode = referenceTypeCode;
    }

    public static class Builder {

        private String issuerAssignedID;
        private Timestamp issueDateTime;
        private TypeCode referenceTypeCode;

        public Builder withIssueAssignedID(String issuerAssignedID) {
            this.issuerAssignedID = issuerAssignedID;
            return this;
        }

        public Builder withIssueDateTime(Timestamp issueDateTime) {
            this.issueDateTime = issueDateTime;
            return this;
        }

        public Builder withReferenceTypeCode(TypeCode referenceTypeCode) {
            this.referenceTypeCode = referenceTypeCode;
            return this;
        }

        public BuyerOrderReferencedReferencedDocumentModel build() {
            return new BuyerOrderReferencedReferencedDocumentModel(this);
        }
    }
}
