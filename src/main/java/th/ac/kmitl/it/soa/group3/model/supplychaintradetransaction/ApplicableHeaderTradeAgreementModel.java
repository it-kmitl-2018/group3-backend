package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class ApplicableHeaderTradeAgreementModel {

    public TradePartyModel sellerTradeParty;
    public TradePartyModel buyerTradeParty;
    public TradeDeliveryTermsModel tradeDeliveryTerms;
    public BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument;
    public BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument;
}
