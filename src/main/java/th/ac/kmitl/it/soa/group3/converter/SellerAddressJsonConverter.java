package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.PostalTradeAddressModel;

@JsonRootName("address")
public class SellerAddressJsonConverter {

    @JsonProperty("line_one")
    private String lineOne;

    @JsonProperty("line_two")
    private String lineTwo;

    @JsonProperty("city_name")
    private String cityName;

    @JsonProperty("city_sub_division_name")
    private String citySubDivisionName;

    @JsonProperty("post_code")
    private String postCode;

    @JsonProperty("country_sub_division")
    private String countrySubDivision;

    @JsonProperty("country_name")
    private String countryName;


    public SellerAddressJsonConverter(PostalTradeAddressModel postalTradeAddressModel) {
        this.lineOne = postalTradeAddressModel.houseNumber + " "
                + postalTradeAddressModel.moo + " "
                + postalTradeAddressModel.soi + " "
                + postalTradeAddressModel.streetName + " "
                + postalTradeAddressModel.village;

        this.lineTwo = postalTradeAddressModel.buildingName + " "
                + postalTradeAddressModel.buildingNumber;

        this.cityName = postalTradeAddressModel.cityName;
        this.citySubDivisionName = postalTradeAddressModel.citySubDivisionName;
        this.postCode = postalTradeAddressModel.postCode;
        this.countrySubDivision = postalTradeAddressModel.countrySubDivisionID;
        this.countryName = postalTradeAddressModel.countryID;
    }

}
