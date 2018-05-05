package th.ac.kmitl.it.soa.group3.converter;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.PostalTradeAddressModel;

import static org.junit.jupiter.api.Assertions.*;

class SellerAddressJsonConverterTest {

    private String postCode = "10250";
    private String buildingName = "PrachasukCondoTown";
    private String houseNumber = "99/2546";
    private String suiteNumber = "Room 828 8th Floor";
    private String soi = "Nakkeeralamthong";
    private String village = "Nakkeera";
    private String moo = "16";
    private String streetName = "Krungthepkritha";
    private String cityName = "Sapansoong";
    private String citySubDivisionName = "Sapansoong";
    private String countryID = "TH";
    private String countrySubDivisionID = "10";
    private String buildingNumber = "3/34";

    private PostalTradeAddressModel.Builder builder = PostalTradeAddressModel.builder();
    private PostalTradeAddressModel postalTradeAddressModel = builder
            .postCode(this.postCode)
            .buildingName(this.buildingName)
            .houseNumber(this.houseNumber)
            .suiteNumber(this.suiteNumber)
            .soi(this.soi)
            .village(this.village)
            .moo(this.moo)
            .streetName(this.streetName)
            .cityName(this.cityName)
            .citySubDivisionName(this.citySubDivisionName)
            .countryID(this.countryID)
            .countrySubDivisionID(this.countrySubDivisionID)
            .buildingNumber(this.buildingNumber)
            .build();


    @Test
    public void itShouldGetCorrectJsonString() {

        SellerAddressJsonConverter addressJsonConverter = new SellerAddressJsonConverter(postalTradeAddressModel);
        assertNotNull(addressJsonConverter.getJsonString());
    }

}