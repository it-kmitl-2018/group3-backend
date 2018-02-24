package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedTradeSettlementHeaderMonetarySummationModel {

    private double originalInformationAmount;
    private double lineTotalAmount;
    private double differenceSalesInformationAmount;
    private double allowanceTotalAmount;
    private double chargeTotalAmount;
    private double taxBasisTotalAmount;
    private double taxTotalAmount;
    private double grandTotalAmount;

    private SpecifiedTradeSettlementHeaderMonetarySummationModel(Builder builder) {
        this.originalInformationAmount = builder.originalInformationAmount;
        this.lineTotalAmount = builder.lineTotalAmount;
        this.differenceSalesInformationAmount = builder.differenceSalesInformationAmount;
        this.allowanceTotalAmount = builder.allowanceTotalAmount;
        this.chargeTotalAmount = builder.chargeTotalAmount;
        this.taxBasisTotalAmount = builder.taxBasisTotalAmount;
        this.taxTotalAmount = builder.taxTotalAmount;
        this.grandTotalAmount = builder.grandTotalAmount;
    }

    public double getOriginalInformationAmount() {
        return originalInformationAmount;
    }

    public void setOriginalInformationAmount(double originalInformationAmount) {
        this.originalInformationAmount = originalInformationAmount;
    }

    public double getLineTotalAmount() {
        return lineTotalAmount;
    }

    public void setLineTotalAmount(double lineTotalAmount) {
        this.lineTotalAmount = lineTotalAmount;
    }

    public double getDifferenceSalesInformationAmount() {
        return differenceSalesInformationAmount;
    }

    public void setDifferenceSalesInformationAmount(double differenceSalesInformationAmount) {
        this.differenceSalesInformationAmount = differenceSalesInformationAmount;
    }

    public double getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    public void setAllowanceTotalAmount(double allowanceTotalAmount) {
        this.allowanceTotalAmount = allowanceTotalAmount;
    }

    public double getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    public void setChargeTotalAmount(double chargeTotalAmount) {
        this.chargeTotalAmount = chargeTotalAmount;
    }

    public double getTaxBasisTotalAmount() {
        return taxBasisTotalAmount;
    }

    public void setTaxBasisTotalAmount(double taxBasisTotalAmount) {
        this.taxBasisTotalAmount = taxBasisTotalAmount;
    }

    public double getTaxTotalAmount() {
        return taxTotalAmount;
    }

    public void setTaxTotalAmount(double taxTotalAmount) {
        this.taxTotalAmount = taxTotalAmount;
    }

    public double getGrandTotalAmount() {
        return grandTotalAmount;
    }

    public void setGrandTotalAmount(double grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }

    public static class Builder {

        private double originalInformationAmount;
        private double lineTotalAmount;
        private double differenceSalesInformationAmount;
        private double allowanceTotalAmount;
        private double chargeTotalAmount;
        private double taxBasisTotalAmount;
        private double taxTotalAmount;
        private double grandTotalAmount;

        public Builder withOriginalInformationAmount(double originalInformationAmount) {
            this.originalInformationAmount = originalInformationAmount;
            return this;
        }

        public Builder withLineTotalAmount(double lineTotalAmount) {
            this.lineTotalAmount = lineTotalAmount;
            return this;
        }

        public Builder withDifferenceSalesInformationAmount(double differenceSalesInformationAmount) {
            this.differenceSalesInformationAmount = differenceSalesInformationAmount;
            return this;
        }

        public Builder withAllowanceTotalAmount(double allowanceTotalAmount) {
            this.allowanceTotalAmount = allowanceTotalAmount;
            return this;
        }

        public Builder withChargeTotalAmount(double chargeTotalAmount) {
            this.chargeTotalAmount = chargeTotalAmount;
            return this;
        }

        public Builder withTaxBasisTotalAmount(double taxBasisTotalAmount) {
            this.taxBasisTotalAmount = taxBasisTotalAmount;
            return this;
        }

        public Builder withTaxTotalAmount(double taxTotalAmount) {
            this.taxTotalAmount = taxTotalAmount;
            return this;
        }

        public Builder withGrandTotalAmount(double grandTotalAmount) {
            this.grandTotalAmount = grandTotalAmount;
            return this;
        }

        public SpecifiedTradeSettlementHeaderMonetarySummationModel build() {
            return new SpecifiedTradeSettlementHeaderMonetarySummationModel(this);
        }
    }
}
