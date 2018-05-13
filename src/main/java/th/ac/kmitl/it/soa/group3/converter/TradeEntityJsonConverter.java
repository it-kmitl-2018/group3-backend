package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.annotation.*;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradePartyModel;

@JsonRootName("seller")
public class TradeEntityJsonConverter {

    @JsonProperty("tax_number")
    private String taxNumber;

    @JsonProperty("name_th")
    private String nameTh;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telephone")
    private String telephoneNumber;

    @JsonProperty("address")
    private AddressJsonConverter addressJsonConverter;

    public TradeEntityJsonConverter(TradePartyModel tradePartyModel) {
        this.taxNumber = tradePartyModel.specifiedTaxRegistration.id;
        this.nameTh = tradePartyModel.name;
        this.email = tradePartyModel.definedTradeContact.emailUriUniversalCommunicationModel.uriID;
        this.telephoneNumber = tradePartyModel.definedTradeContact.telephoneUniversalCommunicationModel.phoneNumber;
        this.addressJsonConverter = new AddressJsonConverter(tradePartyModel.postalTradeAddress);
    }

}
