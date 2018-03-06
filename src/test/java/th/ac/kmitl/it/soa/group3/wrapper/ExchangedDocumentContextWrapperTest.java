package th.ac.kmitl.it.soa.group3.wrapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangedDocumentContextWrapperTest {

    private String id = "AER123";

    private ExchangedDocumentContextWrapper wrapper = ExchangedDocumentContextWrapper.builder()
            .guidelineDocumentId(this.id)
            .build();

    @Test
    void itShouldGetIdByWrapper() {

        assertNotNull(this.wrapper.getModel());
        assertNotNull(this.wrapper.getModel().guidelineSpecifiedDocumentContextParameterModel);
        assertEquals(this.id, wrapper.getModel().guidelineSpecifiedDocumentContextParameterModel.id);
    }

    @Test
    public void itShouldGetXmlString() throws JsonProcessingException {

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.wrapper.getModel());

        assertNotNull(xml);
    }
}