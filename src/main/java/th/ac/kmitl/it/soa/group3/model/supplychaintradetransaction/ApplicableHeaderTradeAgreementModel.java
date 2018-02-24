package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class ApplicableHeaderTradeAgreementModel {

    private TradePartyModel sellerTradeParty;
    private TradePartyModel buyerTradeParty;
    private ApplicableTradeDeliveryTermsModel applicableTradeDeliveryTerms;
    private BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument;
    private BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument;

    private ApplicableHeaderTradeAgreementModel(Builder builder) {
        this.sellerTradeParty = builder.sellerTradeParty;
        this.buyerTradeParty = builder.buyerTradeParty;
        this.applicableTradeDeliveryTerms = builder.applicableTradeDeliveryTerms;
        this.buyerOrderReferencedReferencedDocument = builder.buyerOrderReferencedReferencedDocument;
        this.additionalReferencedDocument = builder.additionalReferencedDocument;
    }

    public TradePartyModel getSellerTradeParty() {
        return sellerTradeParty;
    }

    public void setSellerTradeParty(TradePartyModel sellerTradeParty) {
        this.sellerTradeParty = sellerTradeParty;
    }

    public TradePartyModel getBuyerTradeParty() {
        return buyerTradeParty;
    }

    public void setBuyerTradeParty(TradePartyModel buyerTradeParty) {
        this.buyerTradeParty = buyerTradeParty;
    }

    public ApplicableTradeDeliveryTermsModel getApplicableTradeDeliveryTerms() {
        return applicableTradeDeliveryTerms;
    }

    public void setApplicableTradeDeliveryTerms(ApplicableTradeDeliveryTermsModel applicableTradeDeliveryTerms) {
        this.applicableTradeDeliveryTerms = applicableTradeDeliveryTerms;
    }

    public BuyerOrderReferencedReferencedDocumentModel getBuyerOrderReferencedReferencedDocument() {
        return buyerOrderReferencedReferencedDocument;
    }

    public void setBuyerOrderReferencedReferencedDocument(BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument) {
        this.buyerOrderReferencedReferencedDocument = buyerOrderReferencedReferencedDocument;
    }

    public BuyerOrderReferencedReferencedDocumentModel getAdditionalReferencedDocument() {
        return additionalReferencedDocument;
    }

    public void setAdditionalReferencedDocument(BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument) {
        this.additionalReferencedDocument = additionalReferencedDocument;
    }

    public static class Builder {

        private TradePartyModel sellerTradeParty;
        private TradePartyModel buyerTradeParty;
        private ApplicableTradeDeliveryTermsModel applicableTradeDeliveryTerms;
        private BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument;
        private BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument;

        public Builder withSellerTradeParty(TradePartyModel sellerTradeParty) {
            this.sellerTradeParty = sellerTradeParty;
            return this;
        }

        public Builder withBuyerTradeParty(TradePartyModel buyerTradeParty) {
            this.buyerTradeParty = buyerTradeParty;
            return this;
        }

        public Builder withApplicableTradeDeliveryTerms(
                ApplicableTradeDeliveryTermsModel applicableTradeDeliveryTerms) {
            this.applicableTradeDeliveryTerms = applicableTradeDeliveryTerms;
            return this;
        }

        public Builder withBuyerOrderReferencedReferencedDocument(
                BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument) {
            this.buyerOrderReferencedReferencedDocument = buyerOrderReferencedReferencedDocument;
            return this;
        }

        public Builder withAdditionalReferencedDocument(
                BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument) {
            this.additionalReferencedDocument = additionalReferencedDocument;
            return this;
        }

        public ApplicableHeaderTradeAgreementModel build() {
            return new ApplicableHeaderTradeAgreementModel(this);
        }
    }
}
