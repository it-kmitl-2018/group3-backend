package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class ApplicableHeaderTradeDeliveryModel {

    private TradePartyModel shipToTradeParty;
    private TradePartyModel shipFormTradeParty;
    private ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent;

    private ApplicableHeaderTradeDeliveryModel(Builder builder) {
        this.shipToTradeParty = builder.shipToTradeParty;
        this.shipFormTradeParty = builder.shipFormTradeParty;
        this.actualDeliverySupplyChainEvent = builder.actualDeliverySupplyChainEvent;
    }

    public TradePartyModel getShipToTradeParty() {
        return shipToTradeParty;
    }

    public void setShipToTradeParty(TradePartyModel shipToTradeParty) {
        this.shipToTradeParty = shipToTradeParty;
    }

    public TradePartyModel getShipFormTradeParty() {
        return shipFormTradeParty;
    }

    public void setShipFormTradeParty(TradePartyModel shipFormTradeParty) {
        this.shipFormTradeParty = shipFormTradeParty;
    }

    public ActualDeliverySupplyChainEventModel getActualDeliverySupplyChainEvent() {
        return actualDeliverySupplyChainEvent;
    }

    public void setActualDeliverySupplyChainEvent(ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent) {
        this.actualDeliverySupplyChainEvent = actualDeliverySupplyChainEvent;
    }

    public static class Builder {

        private TradePartyModel shipToTradeParty;
        private TradePartyModel shipFormTradeParty;
        private ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent;

        public Builder withShipToTradeParty(TradePartyModel shipToTradeParty) {
            this.shipToTradeParty = shipToTradeParty;
            return this;
        }

        public Builder withShipFormTradeParty(TradePartyModel shipFormTradeParty) {
            this.shipFormTradeParty = shipFormTradeParty;
            return this;
        }

        public Builder withActualDeliverySupplyChainEvent(
                ActualDeliverySupplyChainEventModel actualDeliverySupplyChainEvent) {
            this.actualDeliverySupplyChainEvent = actualDeliverySupplyChainEvent;
            return this;
        }

        public ApplicableHeaderTradeDeliveryModel build() {
            return new ApplicableHeaderTradeDeliveryModel(this);
        }
    }
}
