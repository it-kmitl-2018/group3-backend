package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTradeAllowanceChargeModelTest {

    private boolean chargeIndicator = true;
    private double actualAmount = 100.00;
    private String reasonCode = "ส่วนลดจากราคาปกติ";
    private String reason = "95";
    private SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge;
    private String expectedXML = "<rsm:SpecifiedTradeAllowanceCharge>" +
            "<ram:ChargeIndicator>true</ram:ChargeIndicator>" +
            "<ram:ActualAmount>100.0</ram:ActualAmount>" +
            "<ram:ReasonCode>ส่วนลดจากราคาปกติ</ram:ReasonCode>" +
            "<ram:Reason>95</ram:Reason>" +
            "</rsm:SpecifiedTradeAllowanceCharge>";

    @Before
    public void beforeEachTest() {
        this.tradeAllowanceCharge = new SpecifiedTradeAllowanceChargeModel.Builder()
                .chargeIndicator(this.chargeIndicator)
                .actualAmount(this.actualAmount)
                .reasonCode(this.reasonCode)
                .reason(this.reason)
                .build();
    }

    @Test
    public void itShouldGetAllInfoByGetter() {
        assertEquals(this.chargeIndicator, this.tradeAllowanceCharge.chargeIndicator);
        assertEquals(this.actualAmount, this.tradeAllowanceCharge.actualAmount);
        assertEquals(this.reasonCode, this.tradeAllowanceCharge.reasonCode);
        assertEquals(this.reason, this.tradeAllowanceCharge.reason);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.tradeAllowanceCharge);

        assertEquals(this.expectedXML, xml);
    }
}
