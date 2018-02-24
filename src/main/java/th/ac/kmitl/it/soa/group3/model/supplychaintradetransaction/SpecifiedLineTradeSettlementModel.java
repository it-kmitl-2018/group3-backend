package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedLineTradeSettlementModel {

    private ApplicableTradeTaxModel applicableTradeTax;
    private SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge;
    private SpecifiedTradeSettlementMonetarySummationModel specifiedTradeSettlementMonetarySummation;

    private SpecifiedLineTradeSettlementModel(Builder builder) {
        this.applicableTradeTax = builder.applicableTradeTax;
        this.specifiedTradeAllowanceCharge = builder.specifiedTradeAllowanceCharge;
        this.specifiedTradeSettlementMonetarySummation = builder.specifiedTradeSettlementMonetarySummation;
    }

    public ApplicableTradeTaxModel getApplicableTradeTax() {
        return applicableTradeTax;
    }

    public void setApplicableTradeTax(ApplicableTradeTaxModel applicableTradeTax) {
        this.applicableTradeTax = applicableTradeTax;
    }

    public SpecifiedTradeAllowanceChargeModel getSpecifiedTradeAllowanceCharge() {
        return specifiedTradeAllowanceCharge;
    }

    public void setSpecifiedTradeAllowanceCharge(SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge) {
        this.specifiedTradeAllowanceCharge = specifiedTradeAllowanceCharge;
    }

    public SpecifiedTradeSettlementMonetarySummationModel getSpecifiedTradeSettlementMonetarySummation() {
        return specifiedTradeSettlementMonetarySummation;
    }

    public void setSpecifiedTradeSettlementMonetarySummation(SpecifiedTradeSettlementMonetarySummationModel specifiedTradeSettlementMonetarySummation) {
        this.specifiedTradeSettlementMonetarySummation = specifiedTradeSettlementMonetarySummation;
    }

    public static class Builder {

        private ApplicableTradeTaxModel applicableTradeTax;
        private SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge;
        private SpecifiedTradeSettlementMonetarySummationModel specifiedTradeSettlementMonetarySummation;

        public Builder withApplicableTradeTax(ApplicableTradeTaxModel applicableTradeTax) {
            this.applicableTradeTax = applicableTradeTax;
            return this;
        }

        public Builder withSpecifiedTradeAllowanceCharge(
                SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge) {
            this.specifiedTradeAllowanceCharge = specifiedTradeAllowanceCharge;
            return this;
        }

        public Builder withSpecifiedTradeSettlementMonetarySummation(
                SpecifiedTradeSettlementMonetarySummationModel specifiedTradeSettlementMonetarySummation) {
            this.specifiedTradeSettlementMonetarySummation = specifiedTradeSettlementMonetarySummation;
            return this;
        }

        public SpecifiedLineTradeSettlementModel build() {
            return new SpecifiedLineTradeSettlementModel(this);
        }
    }
}
