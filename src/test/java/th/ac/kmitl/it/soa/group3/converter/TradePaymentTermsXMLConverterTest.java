package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedTradePaymentTermsModel;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradePaymentTermsXMLConverterTest {

    private String typeCode = "888";
    private String description = "This is description";
    private Timestamp dueDateTime = new Timestamp(1526304633239l);
    private TradePaymentTermsXMLConverter tradePaymentTermsXMLConverter;
    private SpecifiedTradePaymentTermsModel tradePaymentTerms;
    private String expectedXML = "<rsm:SpecifiedTradePaymentTerms>" +
            "<ram:TypeCode>888</ram:TypeCode>" +
            "<ram:Description>This is description</ram:Description>" +
            "<ram:DueDateDateTime>1526304633239</ram:DueDateDateTime>" +
            "</rsm:SpecifiedTradePaymentTerms>";

    @Before
    public void beforeEachTest() {
        this.tradePaymentTerms = SpecifiedTradePaymentTermsModel.builder()
                .typeCode(this.typeCode)
                .description(this.description)
                .dueDateTime(this.dueDateTime)
                .build();

        this.tradePaymentTermsXMLConverter = new TradePaymentTermsXMLConverter(this.tradePaymentTerms);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.tradePaymentTermsXMLConverter);

        assertEquals(this.expectedXML, xml);
    }
}
