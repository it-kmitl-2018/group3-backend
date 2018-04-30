package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder(builderClassName = "Builder")
public class TradePartyModel {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;

    @JacksonXmlProperty(localName = "ram:GlobalID")
    public String globalID;

    @JacksonXmlProperty(localName = "ram:Name")
    public String name;

    @JacksonXmlProperty(localName = "ram:SpecifiedTaxRegistration")
    public SpecifiedTaxRegistrationModel specifiedTaxRegistration;

    @JacksonXmlProperty(localName = "ram:DefinedTradeContact")
    public DefinedTradeContactModel definedTradeContact;

    @JacksonXmlProperty(localName = "ram:PostalTradeAddress")
    public PostalTradeAddressModel postalTradeAddress;
}
