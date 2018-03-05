package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedLineTradeSettlementModel {

    public TradeTaxModel tradeTaxModel;
    public SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceChargeModel;
    public SpecifiedTradeSettlementMonetarySummationModel specifiedTradeSettlementMonetarySummationModel;
}