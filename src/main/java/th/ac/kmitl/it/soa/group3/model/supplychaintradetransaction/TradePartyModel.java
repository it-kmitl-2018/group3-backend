package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class TradePartyModel {

    public String id;
    public String globalID;
    public String name;
    public SpecifiedTaxRegistrationModel specifiedTaxRegistration;
    public DefinedTradeContactModel definedTradeContact;
    public PostalTradeAddressModel postalTradeAddress;
}
