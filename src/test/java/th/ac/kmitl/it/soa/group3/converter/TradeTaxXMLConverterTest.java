package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradeTaxModel;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTaxXMLConverterTest {

    private String typeCode = "VAT";
    private double calculatedRate = 0.07;
    private double basisAmount = 100.00;
    private double calculatedAmount = 7.00;
    private TradeTaxXMLConverter tradeTaxXMLConverter;
    private TradeTaxModel tradeTax;
    private String expectedXML = "<rsm:ApplicableTradeTax>" +
            "<ram:TypeCode>VAT</ram:TypeCode>" +
            "<ram:CalculatedRate>0.07</ram:CalculatedRate>" +
            "<ram:BasisAmount>100.0</ram:BasisAmount>" +
            "<ram:CalculatedAmount>7.0</ram:CalculatedAmount>" +
            "</rsm:ApplicableTradeTax>";

    @Before
    public void beforeEachTest() {
        this.tradeTax = TradeTaxModel.builder()
                .typeCode(this.typeCode)
                .calculatedRate(this.calculatedRate)
                .basisAmount(this.basisAmount)
                .calculatedAmount(this.calculatedAmount)
                .build();

        this.tradeTaxXMLConverter = new TradeTaxXMLConverter(this.tradeTax);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.tradeTaxXMLConverter);

        assertEquals(this.expectedXML, xml);
    }
}
