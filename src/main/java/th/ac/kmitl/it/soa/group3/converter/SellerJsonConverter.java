package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradePartyModel;

@JsonClassDescription("seller")
public class SellerJsonConverter {

    private TradePartyModel tradePartyModel;

    @JsonProperty("tax_number")
    private String taxNumber;

    @JsonProperty("branch_number")
    private String branchNumber;

    @JsonProperty("name_en")
    private String nameEn;

    @JsonProperty("name_th")
    private String nameTh;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telephone")
    private String telephoneNumber;

    @JsonProperty("fax")
    private String faxNumber;

    public SellerJsonConverter(TradePartyModel tradePartyModel) {
        this.tradePartyModel = tradePartyModel;
    }

    public String getJsonString() {
        
    }



}
