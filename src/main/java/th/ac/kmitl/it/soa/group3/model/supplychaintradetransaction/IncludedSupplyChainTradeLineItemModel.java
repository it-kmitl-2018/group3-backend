package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class IncludedSupplyChainTradeLineItemModel {

    private AssociatedDocumentLineDocumentModel associatedDocumentLineDocument;
    private SpecifiedTradeProductModel specifiedTradeProduct;
    private SpecifiedLineTradeAgreementModel specifiedLineTradeAgreement;
    private SpecifiedLineTradeDeliveryModel specifiedLineTradeDelivery;
    private SpecifiedLineTradeSettlementModel specifiedLineTradeSettlement;

    private IncludedSupplyChainTradeLineItemModel(Builder builder) {
        this.associatedDocumentLineDocument = builder.associatedDocumentLineDocument;
        this.specifiedTradeProduct = builder.specifiedTradeProduct;
        this.specifiedLineTradeAgreement = builder.specifiedLineTradeAgreement;
        this.specifiedLineTradeDelivery = builder.specifiedLineTradeDelivery;
        this.specifiedLineTradeSettlement = builder.specifiedLineTradeSettlement;
    }

    public AssociatedDocumentLineDocumentModel getAssociatedDocumentLineDocument() {
        return associatedDocumentLineDocument;
    }

    public void setAssociatedDocumentLineDocument(AssociatedDocumentLineDocumentModel associatedDocumentLineDocument) {
        this.associatedDocumentLineDocument = associatedDocumentLineDocument;
    }

    public SpecifiedTradeProductModel getSpecifiedTradeProduct() {
        return specifiedTradeProduct;
    }

    public void setSpecifiedTradeProduct(SpecifiedTradeProductModel specifiedTradeProduct) {
        this.specifiedTradeProduct = specifiedTradeProduct;
    }

    public SpecifiedLineTradeAgreementModel getSpecifiedLineTradeAgreement() {
        return specifiedLineTradeAgreement;
    }

    public void setSpecifiedLineTradeAgreement(SpecifiedLineTradeAgreementModel specifiedLineTradeAgreement) {
        this.specifiedLineTradeAgreement = specifiedLineTradeAgreement;
    }

    public SpecifiedLineTradeDeliveryModel getSpecifiedLineTradeDelivery() {
        return specifiedLineTradeDelivery;
    }

    public void setSpecifiedLineTradeDelivery(SpecifiedLineTradeDeliveryModel specifiedLineTradeDelivery) {
        this.specifiedLineTradeDelivery = specifiedLineTradeDelivery;
    }

    public SpecifiedLineTradeSettlementModel getSpecifiedLineTradeSettlement() {
        return specifiedLineTradeSettlement;
    }

    public void setSpecifiedLineTradeSettlement(SpecifiedLineTradeSettlementModel specifiedLineTradeSettlement) {
        this.specifiedLineTradeSettlement = specifiedLineTradeSettlement;
    }

    public static class Builder {

        private AssociatedDocumentLineDocumentModel associatedDocumentLineDocument;
        private SpecifiedTradeProductModel specifiedTradeProduct;
        private SpecifiedLineTradeAgreementModel specifiedLineTradeAgreement;
        private SpecifiedLineTradeDeliveryModel specifiedLineTradeDelivery;
        private SpecifiedLineTradeSettlementModel specifiedLineTradeSettlement;

        public Builder withAssociatedDocumentLineDocument(
                AssociatedDocumentLineDocumentModel associatedDocumentLineDocument) {
            this.associatedDocumentLineDocument = associatedDocumentLineDocument;
            return this;
        }

        public Builder withSpecifiedTradeProduct(
                SpecifiedTradeProductModel specifiedTradeProduct) {
            this.specifiedTradeProduct = specifiedTradeProduct;
            return this;
        }

        public Builder withSpecifiedLineTradeAgreement(
                SpecifiedLineTradeAgreementModel specifiedLineTradeAgreement) {
            this.specifiedLineTradeAgreement = specifiedLineTradeAgreement;
            return this;
        }

        public Builder withSpecifiedLineTradeDelivery(
                SpecifiedLineTradeDeliveryModel specifiedLineTradeDelivery) {
            this.specifiedLineTradeDelivery = specifiedLineTradeDelivery;
            return this;
        }

        public Builder withSpecifiedLineTradeSettlement(
                SpecifiedLineTradeSettlementModel specifiedLineTradeSettlement) {
            this.specifiedLineTradeSettlement = specifiedLineTradeSettlement;
            return this;
        }

        public IncludedSupplyChainTradeLineItemModel build() {
            return new IncludedSupplyChainTradeLineItemModel(this);
        }
    }
}
