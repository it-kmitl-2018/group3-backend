package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedTradeSettlementMonetarySummationModel {

    private double taxTotalAmount;
    private double netLineTotalAmount;
    private double netIncludingTaxesLineTotalAmount;

    private SpecifiedTradeSettlementMonetarySummationModel(Builder builder) {
        this.taxTotalAmount = builder.taxTotalAmount;
        this.netLineTotalAmount = builder.netLineTotalAmount;
        this.netIncludingTaxesLineTotalAmount = builder.netIncludingTaxesLineTotalAmount;
    }

    public double getTaxTotalAmount() {
        return taxTotalAmount;
    }

    public void setTaxTotalAmount(double taxTotalAmount) {
        this.taxTotalAmount = taxTotalAmount;
    }

    public double getNetLineTotalAmount() {
        return netLineTotalAmount;
    }

    public void setNetLineTotalAmount(double netLineTotalAmount) {
        this.netLineTotalAmount = netLineTotalAmount;
    }

    public double getNetIncludingTaxesLineTotalAmount() {
        return netIncludingTaxesLineTotalAmount;
    }

    public void setNetIncludingTaxesLineTotalAmount(double netIncludingTaxesLineTotalAmount) {
        this.netIncludingTaxesLineTotalAmount = netIncludingTaxesLineTotalAmount;
    }

    public static class Builder {

        private double taxTotalAmount;
        private double netLineTotalAmount;
        private double netIncludingTaxesLineTotalAmount;

        public Builder withTaxTotalAmount(double taxTotalAmount) {
            this.taxTotalAmount = taxTotalAmount;
            return this;
        }

        public Builder withNetLineTotalAmount(double netLineTotalAmount) {
            this.netLineTotalAmount = netLineTotalAmount;
            return this;
        }

        public Builder withNetIncludingTaxesLineTotalAmount(double netIncludingTaxesLineTotalAmount) {
            this.netIncludingTaxesLineTotalAmount = netIncludingTaxesLineTotalAmount;
            return this;
        }

        public SpecifiedTradeSettlementMonetarySummationModel build() {
            return new SpecifiedTradeSettlementMonetarySummationModel(this);
        }
    }
}
