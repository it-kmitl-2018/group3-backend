package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class ApplicableHeaderTradeDeliveryModel {

    public TradePartyModel shipToTradeParty;
    public TradePartyModel shipFormTradeParty;
    public ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent;
}
