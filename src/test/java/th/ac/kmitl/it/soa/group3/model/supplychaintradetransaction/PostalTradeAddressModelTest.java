package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostalTradeAddressModelTest {

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

    @Test
    public void itShouldGetAllInfoByGetter() {
        PostalTradeAddressModel.Builder builder = new PostalTradeAddressModel.Builder();
        PostalTradeAddressModel postalTradeAddressModel = builder
                .withPostCode(this.postCode)
                .withBuildingName(this.buildingName)
                .withHouseNumber(this.houseNumber)
                .withSuiteNumber(this.suiteNumber)
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
        assertEquals(this.houseNumber, postalTradeAddressModel.houseNumber);
        assertEquals(this.suiteNumber, postalTradeAddressModel.suiteNumber);
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
