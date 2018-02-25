package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostalTradeAddressModelTest {

    private String postCode = "10250";
    private String buildingName = "PrachasukCondoTown";
    private String line1 = "99/2546 Precha";
    private String line2 = "96/96 Precha";
    private String line3 = "Nakkeeralamthong";
    private String line4 = "Nakkeera";
    private String line5 = "16";
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
                .withLine1(this.line1)
                .withLine2(this.line2)
                .withLine3(this.line3)
                .withLine4(this.line4)
                .withLine5(this.line5)
                .withStreetName(this.streetName)
                .withCityName(this.cityName)
                .withCitySubDivisionName(this.citySubDivisionName)
                .withCountryID(this.countryID)
                .withCountrySubDivisionID(this.countrySubDivisionID)
                .withBuildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postCode, postalTradeAddressModel.postCode);
        assertEquals(this.buildingName, postalTradeAddressModel.buildingName);
        assertEquals(this.line1, postalTradeAddressModel.line1);
        assertEquals(this.line2, postalTradeAddressModel.line2);
        assertEquals(this.line3, postalTradeAddressModel.line3);
        assertEquals(this.line4, postalTradeAddressModel.line4);
        assertEquals(this.line5, postalTradeAddressModel.line5);
        assertEquals(this.streetName, postalTradeAddressModel.streetName);
        assertEquals(this.cityName, postalTradeAddressModel.cityName);
        assertEquals(this.citySubDivisionName, postalTradeAddressModel.citySubDivisionName);
        assertEquals(this.countryID, postalTradeAddressModel.countryID);
        assertEquals(this.countrySubDivisionID, postalTradeAddressModel.countrySubDivisionID);
        assertEquals(this.buildingNumber, postalTradeAddressModel.buildingNumber);
    }
}
