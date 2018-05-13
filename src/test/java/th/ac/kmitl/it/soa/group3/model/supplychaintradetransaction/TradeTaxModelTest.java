package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTaxModelTest {

    private String typeCode = "VAT";
    private double calculatedRate = 0.07;
    private double basisAmount = 100.00;
    private double calculatedAmount = 7.00;
    private TradeTaxModel tradeTaxModel;
    private String expectedXML = "<rsm:ApplicableHeaderTradeDelivery>" +
            "<ram:TypeCode>VAT</ram:TypeCode>" +
            "<ram:CalculatedRate>0.07</ram:CalculatedRate>" +
            "<ram:BasisAmount>100.0</ram:BasisAmount>" +
            "<ram:CalculatedAmount>7.0</ram:CalculatedAmount>" +
            "</rsm:ApplicableHeaderTradeDelivery>";

    @Before
    public void beforeEachTest() {
        this.tradeTaxModel = new TradeTaxModel.Builder()
                .typeCode(this.typeCode)
                .calculatedRate(this.calculatedRate)
                .basisAmount(this.basisAmount)
                .calculatedAmount(this.calculatedAmount)
                .build();
    }

    @Test
    public void expectTradingTaxInfo() {
        assertEquals(this.typeCode, this.tradeTaxModel.typeCode);
        assertEquals(this.calculatedRate, this.tradeTaxModel.calculatedRate);
        assertEquals(this.basisAmount, this.tradeTaxModel.basisAmount);
        assertEquals(this.calculatedAmount, this.tradeTaxModel.calculatedAmount);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.tradeTaxModel);

        assertEquals(this.expectedXML, xml);
    }
}
