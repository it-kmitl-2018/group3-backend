package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SupplyChainTradeTransactionModel {

    private ApplicableHeaderTradeAgreementModel applicableHeaderTradeAgreement;
    private ApplicableHeaderTradeDeliveryModel applicableHeaderTradeDelivery;
    private ApplicableHeaderTradeSettlementModel applicableHeaderTradeSettlement;
    private IncludedSupplyChainTradeLineItemModel includedSupplyChainTradeLineItem;

    private SupplyChainTradeTransactionModel(Builder builder) {
        this.applicableHeaderTradeAgreement = builder.applicableHeaderTradeAgreement;
        this.applicableHeaderTradeDelivery = builder.applicableHeaderTradeDelivery;
        this.applicableHeaderTradeSettlement = builder.applicableHeaderTradeSettlement;
        this.includedSupplyChainTradeLineItem = builder.includedSupplyChainTradeLineItem;
    }

    public ApplicableHeaderTradeAgreementModel getApplicableHeaderTradeAgreement() {
        return applicableHeaderTradeAgreement;
    }

    public void setApplicableHeaderTradeAgreement(ApplicableHeaderTradeAgreementModel applicableHeaderTradeAgreement) {
        this.applicableHeaderTradeAgreement = applicableHeaderTradeAgreement;
    }

    public ApplicableHeaderTradeDeliveryModel getApplicableHeaderTradeDelivery() {
        return applicableHeaderTradeDelivery;
    }

    public void setApplicableHeaderTradeDelivery(ApplicableHeaderTradeDeliveryModel applicableHeaderTradeDelivery) {
        this.applicableHeaderTradeDelivery = applicableHeaderTradeDelivery;
    }

    public ApplicableHeaderTradeSettlementModel getApplicableHeaderTradeSettlement() {
        return applicableHeaderTradeSettlement;
    }

    public void setApplicableHeaderTradeSettlement(ApplicableHeaderTradeSettlementModel applicableHeaderTradeSettlement) {
        this.applicableHeaderTradeSettlement = applicableHeaderTradeSettlement;
    }

    public IncludedSupplyChainTradeLineItemModel getIncludedSupplyChainTradeLineItem() {
        return includedSupplyChainTradeLineItem;
    }

    public void setIncludedSupplyChainTradeLineItem(IncludedSupplyChainTradeLineItemModel includedSupplyChainTradeLineItem) {
        this.includedSupplyChainTradeLineItem = includedSupplyChainTradeLineItem;
    }

    public static class Builder {

        private ApplicableHeaderTradeAgreementModel applicableHeaderTradeAgreement;
        private ApplicableHeaderTradeDeliveryModel applicableHeaderTradeDelivery;
        private ApplicableHeaderTradeSettlementModel applicableHeaderTradeSettlement;
        private IncludedSupplyChainTradeLineItemModel includedSupplyChainTradeLineItem;

        public Builder withApplicableHeaderTradeAgreement(
                ApplicableHeaderTradeAgreementModel applicableHeaderTradeAgreement) {
            this.applicableHeaderTradeAgreement = applicableHeaderTradeAgreement;
            return this;
        }

        public Builder withApplicableHeaderTradeDelivery(
                ApplicableHeaderTradeDeliveryModel applicableHeaderTradeDelivery) {
            this.applicableHeaderTradeDelivery = applicableHeaderTradeDelivery;
            return this;
        }

        public Builder withApplicableHeaderTradeSettlement(
                ApplicableHeaderTradeSettlementModel applicableHeaderTradeSettlement) {
            this.applicableHeaderTradeSettlement = applicableHeaderTradeSettlement;
            return this;
        }

        public Builder withIncludedSupplyChainTradeLineItem(
                IncludedSupplyChainTradeLineItemModel includedSupplyChainTradeLineItem) {
            this.includedSupplyChainTradeLineItem = includedSupplyChainTradeLineItem;
            return this;
        }

        public SupplyChainTradeTransactionModel build() {
            return new SupplyChainTradeTransactionModel(this);
        }
    }
}
