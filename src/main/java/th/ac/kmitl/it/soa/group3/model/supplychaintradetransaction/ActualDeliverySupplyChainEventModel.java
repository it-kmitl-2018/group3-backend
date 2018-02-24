package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import java.sql.Timestamp;

public class ActualDeliverySupplyChainEventModel {

    private Timestamp occurrenceDateTime;

    private ActualDeliverySupplyChainEventModel(Builder builder) {
        this.occurrenceDateTime = builder.occurrenceDateTime;
    }

    public Timestamp getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    public void setOccurrenceDateTime(Timestamp occurrenceDateTime) {
        this.occurrenceDateTime = occurrenceDateTime;
    }

    public static class Builder {

        private Timestamp occurrenceDateTime;

        public Builder withOccurrenceDateTime(Timestamp occurrenceDateTime) {
            this.occurrenceDateTime = occurrenceDateTime;
            return this;
        }

        public ActualDeliverySupplyChainEventModel build() {
            return new ActualDeliverySupplyChainEventModel(this);
        }
    }
}
