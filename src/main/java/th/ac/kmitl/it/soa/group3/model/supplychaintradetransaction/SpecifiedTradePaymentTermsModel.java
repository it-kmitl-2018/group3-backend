package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;
import java.sql.Timestamp;

public class SpecifiedTradePaymentTermsModel {

    private TypeCode typeCode;
    private String description;
    private Timestamp dueDateTime;

    private SpecifiedTradePaymentTermsModel(Builder builder) {
        this.typeCode = builder.typeCode;
        this.description = builder.description;
        this.dueDateTime = builder.dueDateTime;
    }

    public TypeCode getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(TypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDueDateTime() {
        return dueDateTime;
    }

    public void setDueDateTime(Timestamp dueDateTime) {
        this.dueDateTime = dueDateTime;
    }

    public static class Builder {

        private TypeCode typeCode;
        private String description;
        private Timestamp dueDateTime;

        public Builder withTypeCode(TypeCode typeCode) {
            this.typeCode = typeCode;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withDueDateTime(Timestamp dueDateTime) {
            this.dueDateTime = dueDateTime;
            return this;
        }

        public SpecifiedTradePaymentTermsModel build() {
            return new SpecifiedTradePaymentTermsModel(this);
        }
    }
}
