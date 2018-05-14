package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "rsm:ApplicableHeaderTradeDelivery")
@Builder(builderClassName = "Builder")
public class ApplicableHeaderTradeDeliveryModel {

    @JacksonXmlProperty(localName = "ram:ShipToTradeParty")
    public TradePartyModel shipToTradeParty;

    @JacksonXmlProperty(localName = "ram:ShipFromTradePartys")
    public TradePartyModel shipFormTradeParty;

    @JacksonXmlProperty(localName = "ram:ActualDeliverySupplyChainEvent")
    public ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent;
}
