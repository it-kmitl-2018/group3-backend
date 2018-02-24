package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import java.sql.Timestamp;

public class IndividualTradeProductInstanceModel {

    private String batchID;
    private Timestamp expiryDateTime;

    private IndividualTradeProductInstanceModel(Builder builder) {
        this.batchID = builder.batchID;
        this.expiryDateTime = builder.expiryDateTime;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public Timestamp getExpiryDateTime() {
        return expiryDateTime;
    }

    public void setExpiryDateTime(Timestamp expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    public static class Builder {

        private String batchID;
        private Timestamp expiryDateTime;

        public Builder withBatchID(String batchID) {
            this.batchID = batchID;
            return this;
        }

        public Builder withExpiryDateTime(Timestamp expiryDateTime) {
            this.expiryDateTime = expiryDateTime;
            return this;
        }

        public IndividualTradeProductInstanceModel build() {
            return new IndividualTradeProductInstanceModel(this);
        }
    }
}
