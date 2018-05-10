package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.PostalTradeAddressModel;

import java.io.IOException;

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

    private String expectedJson = "{\"address\":{\"line_one\":\"99/2546 16 Nakkeeralamthong Krungthepkritha Nakkeera\",\"line_two\":\"PrachasukCondoTown 3/34\",\"city_name\":\"Sapansoong\",\"city_sub_division_name\":\"Sapansoong\",\"post_code\":\"10250\",\"country_sub_division\":\"10\",\"country_name\":\"TH\"}}";

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
    public void itShouldGetCorrectJsonString() throws JsonProcessingException {

        SellerAddressJsonConverter addressJsonConverter = new SellerAddressJsonConverter(postalTradeAddressModel);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(addressJsonConverter);
        result = result.trim().replaceAll("\n", "");

        assertNotNull(result);
        assertTrue(isJSONValid(result));
        assertEquals(result, expectedJson);
    }

    public static boolean isJSONValid(String jsonInString ) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(jsonInString);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}