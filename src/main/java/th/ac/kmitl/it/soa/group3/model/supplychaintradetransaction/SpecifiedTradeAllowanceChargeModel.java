package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;

public class SpecifiedTradeAllowanceChargeModel {

    private boolean chargeIndicator;
    private double actualAmount;
    private TypeCode reasonCode;
    private String reason;

    private SpecifiedTradeAllowanceChargeModel(Builder builder) {
        this.chargeIndicator = builder.chargeIndicator;
        this.actualAmount = builder.actualAmount;
        this.reasonCode = builder.reasonCode;
        this.reason = builder.reason;
    }

    public boolean isChargeIndicator() {
        return chargeIndicator;
    }

    public void setChargeIndicator(boolean chargeIndicator) {
        this.chargeIndicator = chargeIndicator;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public TypeCode getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(TypeCode reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public static class Builder {

        private boolean chargeIndicator;
        private double actualAmount;
        private TypeCode reasonCode;
        private String reason;

        public Builder withChargeIndicator(boolean chargeIndicator) {
            this.chargeIndicator = chargeIndicator;
            return this;
        }

        public Builder withActualAmount(double actualAmount) {
            this.actualAmount = actualAmount;
            return this;
        }

        public Builder withReasonCode(TypeCode reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        public Builder withReason(String reason) {
            this.reason = reason;
            return this;
        }

        public SpecifiedTradeAllowanceChargeModel build() {
            return new SpecifiedTradeAllowanceChargeModel(this);
        }
    }
}