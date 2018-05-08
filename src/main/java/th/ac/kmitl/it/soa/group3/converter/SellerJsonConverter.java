package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.gson.Gson;
import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradePartyModel;

@JsonRootName("seller")
public class SellerJsonConverter {

    @JsonProperty("tax_number")
    private String taxNumber;

    @JsonProperty("name_th")
    private String nameTh;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telephone")
    private String telephoneNumber;

    @JsonProperty("address")
    private SellerAddressJsonConverter addressJsonConverter;

    public SellerJsonConverter(TradePartyModel tradePartyModel) {
        this.taxNumber = tradePartyModel.specifiedTaxRegistration.id;
        this.nameTh = tradePartyModel.name;
        this.email = tradePartyModel.definedTradeContact.emailUriUniversalCommunicationModel.uriID;
        this.telephoneNumber = tradePartyModel.definedTradeContact.telephoneUniversalCommunicationModel.phoneNumber;
        this.addressJsonConverter = new SellerAddressJsonConverter(tradePartyModel.postalTradeAddress);
    }

}
