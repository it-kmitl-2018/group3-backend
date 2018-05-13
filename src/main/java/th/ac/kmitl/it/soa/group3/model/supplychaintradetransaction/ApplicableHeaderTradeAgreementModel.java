package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Builder(builderClassName = "Builder")
@JacksonXmlRootElement(localName = "rsm:ApplicableHeaderTradeAgreement")
public class ApplicableHeaderTradeAgreementModel {

    @JacksonXmlProperty(localName = "ram:SellerTradeParty")
    public TradePartyModel sellerTradeParty;

    @JacksonXmlProperty(localName = "ram:BuyerTradeParty")
    public TradePartyModel buyerTradeParty;

    @JacksonXmlProperty(localName = "ram:ApplicableTradeDeliveryTerms")
    public TradeDeliveryTermsModel tradeDeliveryTerms;

    @JacksonXmlProperty(localName = "ram:BuyerOrderReferencedReferencedDocument")
    public BuyerOrderReferencedReferencedDocumentModel buyerOrderReferencedReferencedDocument;

    @JacksonXmlProperty(localName = "ram:AdditionalReferencedDocument")
    public BuyerOrderReferencedReferencedDocumentModel additionalReferencedDocument;
}
