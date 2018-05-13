package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TradeEntityJsonConverterTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String name = "บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด";
    private String taxID = "123456789012300000";
    private String personName = "Alice";
    private String departmentName = "Accounting";
    private String email = "example@mail.com";
    private String phoneNo = "(+66) 89-1234567";
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
    private SpecifiedTaxRegistrationModel specifiedTaxRegistration;
    private DefinedTradeContactModel definedTradeContact;
    private PostalTradeAddressModel postalTradeAddress;
    private EmailUriUniversalCommunicationModel emailUriUniversal;
    private TelephoneUniversalCommunicationModel telephoneUniversal;
    private TradePartyModel tradePartyModel;

    private String expectedJson = "{\"tax_number\":\"123456789012300000\",\"name_th\":\"บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด\",\"email\":\"example@mail.com\",\"telephone\":\"(+66) 89-1234567\",\"address\":{\"line_one\":\"99/2546 16 Nakkeeralamthong Krungthepkritha Nakkeera\",\"line_two\":\"PrachasukCondoTown 3/34\",\"city_name\":\"Sapansoong\",\"city_sub_division_name\":\"Sapansoong\",\"post_code\":\"10250\",\"country_sub_division\":\"10\",\"country_name\":\"TH\"}}";

    @Test
    public void itShouldGetJsonString() throws JsonProcessingException {

        this.specifiedTaxRegistration = SpecifiedTaxRegistrationModel.builder()
                .id(this.taxID)
                .build();

        this.emailUriUniversal = EmailUriUniversalCommunicationModel.builder()
                .uriID(this.email)
                .build();

        this.telephoneUniversal = TelephoneUniversalCommunicationModel.builder()
                .phoneNumber(this.phoneNo)
                .build();

        this.definedTradeContact = DefinedTradeContactModel.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .emailUriUniversalCommunicationModel(this.emailUriUniversal)
                .telephoneUniversalCommunicationModel(this.telephoneUniversal)
                .build();

        this.postalTradeAddress = PostalTradeAddressModel.builder()
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

        TradePartyModel.Builder builder = TradePartyModel.builder();
        this.tradePartyModel = builder
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        TradeEntityJsonConverter sellerJsonConverter = new TradeEntityJsonConverter(tradePartyModel);

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(sellerJsonConverter);
        System.out.println(result);
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