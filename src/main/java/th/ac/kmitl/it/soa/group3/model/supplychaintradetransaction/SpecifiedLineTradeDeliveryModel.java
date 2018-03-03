package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedLineTradeDeliveryModel {

    public int billedQuantity;
    public int perPackageUnitQuantity;
}
