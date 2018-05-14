package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.mock.JsonExportConverterMock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonExportConverterTest {

    private String expectedJson = "{\"number\":\"AEFF15745\",\"seller\":{\"tax_number\":\"123456789012300000\"" +
            ",\"name_th\":\"บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด\",\"email\":\"example@mail.com\",\"telephone\":\"" +
            "(+66) 89-1234567\",\"address\":{\"line_one\":\"99/2546 16 Nakkeeralamthong Krungthepkritha Nakkeera\"," +
            "\"line_two\":\"PrachasukCondoTown 3/34\",\"city_name\":\"Sapansoong\",\"city_sub_division_name\":" +
            "\"Sapansoong\",\"post_code\":\"10250\",\"country_sub_division\":\"10\",\"country_name\":\"TH\"}}," +
            "\"buyer\":{\"tax_number\":\"123456789012300000\",\"name_th\":\"บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด\"," +
            "\"email\":\"example@mail.com\",\"telephone\":\"(+66) 89-1234567\",\"address\":{\"line_one\":" +
            "\"99/2546 16 Nakkeeralamthong Krungthepkritha Nakkeera\",\"line_two\":\"PrachasukCondoTown 3/34\"," +
            "\"city_name\":\"Sapansoong\",\"city_sub_division_name\":\"Sapansoong\",\"post_code\":\"10250\"," +
            "\"country_sub_division\":\"10\",\"country_name\":\"TH\"}},\"transaction_date\":\"2018-04-01 12:12:12\"," +
            "\"items\":[{\"description\":\"Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้\"," +
            "\"quantity\":1,\"price_per_item\":3990000.0,\"have_vat\":true,\"vat_rate\":0.07}]}";

    @Test
    public void itShouldGetJsonString() throws JsonProcessingException {

        JsonExportConverter jsonExportConverter = new JsonExportConverterMock().getJsonExportConverterMock();

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(jsonExportConverter);
        System.out.println(result);
        result = result.trim().replaceAll("\n", "");

        assertNotNull(result);
        assertTrue(isJSONValid(result));
        assertEquals(expectedJson, result);
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