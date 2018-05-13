package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TradeDeliveryTermsModelTest {

    private String deliveryTypeCode = "DDP";
    private String expectedXML = "<rsm:ApplicableTradeDeliveryTerms>" +
            "<ram:DeliveryTypeCode>DDP</ram:DeliveryTypeCode>" +
            "</rsm:ApplicableTradeDeliveryTerms>";

    @Test
    public void expectDeliveryTypeCode() {
        TradeDeliveryTermsModel.Builder builder = new TradeDeliveryTermsModel.Builder();
        TradeDeliveryTermsModel tradeDeliveryTermsModel = builder
                .deliveryTypeCode(this.deliveryTypeCode)
                .build();

        assertEquals(this.deliveryTypeCode, tradeDeliveryTermsModel.deliveryTypeCode);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        TradeDeliveryTermsModel.Builder builder = new TradeDeliveryTermsModel.Builder();
        TradeDeliveryTermsModel tradeDeliveryTermsModel = builder
                .deliveryTypeCode(this.deliveryTypeCode)
                .build();

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(tradeDeliveryTermsModel);

        assertEquals(this.expectedXML, xml);
    }
}
