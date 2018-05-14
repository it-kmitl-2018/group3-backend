package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedTradeAllowanceChargeModel;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeAllowanceXMLConverterTest {

    private boolean chargeIndicator = true;
    private double actualAmount = 100.00;
    private String reasonCode = "ส่วนลดจากราคาปกติ";
    private String reason = "95";
    private TradeAllowanceXMLConverter tradeAllowanceXMLConverter;
    private SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge;
    private String expectedXML = "<rsm:SpecifiedTradeAllowanceCharge>" +
            "<ram:ChargeIndicator>true</ram:ChargeIndicator>" +
            "<ram:ActualAmount>100.0</ram:ActualAmount>" +
            "<ram:ReasonCode>ส่วนลดจากราคาปกติ</ram:ReasonCode>" +
            "<ram:Reason>95</ram:Reason>" +
            "</rsm:SpecifiedTradeAllowanceCharge>";

    @Before
    public void beforeEachTest() {
        this.tradeAllowanceCharge = SpecifiedTradeAllowanceChargeModel.builder()
                .chargeIndicator(this.chargeIndicator)
                .actualAmount(this.actualAmount)
                .reasonCode(this.reasonCode)
                .reason(this.reason)
                .build();

        this.tradeAllowanceXMLConverter = new TradeAllowanceXMLConverter(this.tradeAllowanceCharge);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.tradeAllowanceXMLConverter);

        assertEquals(this.expectedXML, xml);
    }
}
