package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class GrossPriceProductTradePriceModel {

    private double chargeAmount;
    private SpecifiedTradeAllowanceChargeModel appliedTradeAllowanceCharge;

    private GrossPriceProductTradePriceModel(Builder builder) {
        this.chargeAmount = builder.chargeAmount;
        this.appliedTradeAllowanceCharge = builder.appliedTradeAllowanceCharge;
    }

    public double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public SpecifiedTradeAllowanceChargeModel getAppliedTradeAllowanceCharge() {
        return appliedTradeAllowanceCharge;
    }

    public void setAppliedTradeAllowanceCharge(SpecifiedTradeAllowanceChargeModel appliedTradeAllowanceCharge) {
        this.appliedTradeAllowanceCharge = appliedTradeAllowanceCharge;
    }

    public static class Builder {

        private double chargeAmount;
        private SpecifiedTradeAllowanceChargeModel appliedTradeAllowanceCharge;

        public Builder withChargeAmount(double chargeAmount) {
            this.chargeAmount = chargeAmount;
            return this;
        }

        public Builder withAppliedTradeAllowanceCharge(
                SpecifiedTradeAllowanceChargeModel appliedTradeAllowanceCharge) {
            this.appliedTradeAllowanceCharge = appliedTradeAllowanceCharge;
            return this;
        }

        public GrossPriceProductTradePriceModel build() {
            return new GrossPriceProductTradePriceModel(this);
        }
    }
}
