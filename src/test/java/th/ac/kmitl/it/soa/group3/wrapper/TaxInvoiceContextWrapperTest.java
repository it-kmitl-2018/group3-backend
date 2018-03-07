package th.ac.kmitl.it.soa.group3.wrapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxInvoiceContextWrapperTest {

    private String id = "AER123";
    private TaxInvoiceContextWrapper wrapper = TaxInvoiceContextWrapper.builder()
            .guidelineDocumentId(this.id)
            .build();

    @Test
    void itShouldGetIdByWrapper() {
        assertNotNull(this.wrapper.getModel());
        assertNotNull(this.wrapper.getModel().taxInvoiceContextSpecModel);
        assertEquals(this.id, wrapper.getModel().taxInvoiceContextSpecModel.id);
    }

    @Test
    public void itShouldGetXmlString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.wrapper.getModel());

        assertNotNull(xml);
    }
}