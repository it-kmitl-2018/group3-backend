package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedTradeSettlementHeaderMonetarySummationModel {

    public double originalInformationAmount;
    public double lineTotalAmount;
    public double differenceSalesInformationAmount;
    public double allowanceTotalAmount;
    public double chargeTotalAmount;
    public double taxBasisTotalAmount;
    public double taxTotalAmount;
    public double grandTotalAmount;
}
