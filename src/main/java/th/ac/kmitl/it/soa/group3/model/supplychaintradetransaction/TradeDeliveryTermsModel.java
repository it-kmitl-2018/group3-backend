package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "rsm:ApplicableTradeDeliveryTerms")
@Builder(builderClassName = "Builder")
public class TradeDeliveryTermsModel {

    @JacksonXmlProperty(localName = "ram:DeliveryTypeCode")
    public String deliveryTypeCode;
}
