package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
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

    private PostalTradeAddressModel.Builder builder = new PostalTradeAddressModel.Builder();
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
    public void itShouldGetAllInfoByGetter() {

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
