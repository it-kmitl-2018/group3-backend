package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostalTradeAddressModelTest {

    private String postCode = "10250";
    private String buildingName = "PrachasukCondoTown";
    private String addressLine1 = "99/2546 Precha";
    private String addressLine2 = "96/96 Precha";
    private String soi = "Nakkeeralamthong";
    private String village = "Nakkeera";
    private String moo = "16";
    private String streetName = "Krungthepkritha";
    private String cityName = "Sapansoong";
    private String citySubDivisionName = "Sapansoong";
    private String countryID = "TH";
    private String countrySubDivisionID = "10";
    private String buildingNumber = "3/34";

    @Test
    public void itShouldGetAllInfoByGetter() {
        PostalTradeAddressModel.Builder builder = new PostalTradeAddressModel.Builder();
        PostalTradeAddressModel postalTradeAddressModel = builder
                .withPostCode(this.postCode)
                .withBuildingName(this.buildingName)
                .withAddressLine1(this.addressLine1)
                .withAddressLine2(this.addressLine2)
                .withSoi(this.soi)
                .withVillage(this.village)
                .withMoo(this.moo)
                .withStreetName(this.streetName)
                .withCityName(this.cityName)
                .withCitySubDivisionName(this.citySubDivisionName)
                .withCountryID(this.countryID)
                .withCountrySubDivisionID(this.countrySubDivisionID)
                .withBuildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postCode, postalTradeAddressModel.postCode);
        assertEquals(this.buildingName, postalTradeAddressModel.buildingName);
        assertEquals(this.addressLine1, postalTradeAddressModel.addressLine1);
        assertEquals(this.addressLine2, postalTradeAddressModel.addressLine2);
        assertEquals(this.soi, postalTradeAddressModel.soi);
        assertEquals(this.village, postalTradeAddressModel.village);
        assertEquals(this.moo, postalTradeAddressModel.moo);
        assertEquals(this.streetName, postalTradeAddressModel.streetName);
        assertEquals(this.cityName, postalTradeAddressModel.cityName);
        assertEquals(this.citySubDivisionName, postalTradeAddressModel.citySubDivisionName);
        assertEquals(this.countryID, postalTradeAddressModel.countryID);
        assertEquals(this.countrySubDivisionID, postalTradeAddressModel.countrySubDivisionID);
        assertEquals(this.buildingNumber, postalTradeAddressModel.buildingNumber);
    }
}
