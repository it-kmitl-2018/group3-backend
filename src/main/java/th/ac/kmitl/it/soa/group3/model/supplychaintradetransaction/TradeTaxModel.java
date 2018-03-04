package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class TradeTaxModel {

    public String typeCode;
    public double calculatedRate;
    public double basisAmount;
    public double calculatedAmount;
}
