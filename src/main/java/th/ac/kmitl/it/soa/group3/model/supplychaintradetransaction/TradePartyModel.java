package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder(builderClassName = "Builder")
public class TradePartyModel {

    @JacksonXmlProperty(localName = "ram:ID")
    @JsonProperty("id")
    public String id;

    @JacksonXmlProperty(localName = "ram:GlobalID")
    @JsonProperty("globalID")
    public String globalID;

    @JacksonXmlProperty(localName = "ram:Name")
    @JsonProperty("name")
    public String name;

    @JacksonXmlProperty(localName = "ram:SpecifiedTaxRegistration")
    @JsonProperty("specifiedTaxRegistration")
    public SpecifiedTaxRegistrationModel specifiedTaxRegistration;

    @JacksonXmlProperty(localName = "ram:DefinedTradeContact")
    @JsonProperty("definedTradeContact")
    public DefinedTradeContactModel definedTradeContact;

    @JacksonXmlProperty(localName = "ram:PostalTradeAddress")
    @JsonProperty("postalTradeAddress")
    public PostalTradeAddressModel postalTradeAddress;
}
