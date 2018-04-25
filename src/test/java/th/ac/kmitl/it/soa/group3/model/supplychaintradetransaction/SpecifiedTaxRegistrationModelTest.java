package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTaxRegistrationModelTest {

    private String id = "1234567890123";
    private SpecifiedTaxRegistrationModel specTaxRegister;

    @Before
    public void beforeEachTest() {
        this.specTaxRegister = new SpecifiedTaxRegistrationModel.Builder()
                .id(this.id)
                .build();
    }

    @Test
    public void itShouldGetIDByGetter() {
        assertEquals(this.id, this.specTaxRegister.id);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.specTaxRegister);

        assertNotNull(xml);
    }

    @Test
    public void itShouldGetJSONString() {
        Gson gson = new Gson();
        String json = gson.toJson(this.specTaxRegister);

        assertNotNull(json);
    }
}
