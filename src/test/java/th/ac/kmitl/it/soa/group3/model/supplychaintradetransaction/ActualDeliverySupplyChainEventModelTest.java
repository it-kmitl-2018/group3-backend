package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class ActualDeliverySupplyChainEventModelTest {

    private Timestamp occurrenceDateTime = new Timestamp(1526201421814l);
    private ActualDeliverySupplyChainEventModel deliverySupplyChainModel;
    private String expectedXML = "<rsm:ActualDeliverySupplyChainEvent>" +
            "<ram:OccurrenceDateTime>1526201421814</ram:OccurrenceDateTime>" +
            "</rsm:ActualDeliverySupplyChainEvent>";

    @Before
    public void beforeEachTest() {
        this.deliverySupplyChainModel = new ActualDeliverySupplyChainEventModel.Builder()
                .occurrenceDateTime(this.occurrenceDateTime)
                .build();
    }

    @Test
    public void itShouldGetDateTimeByGetter() {
        assertEquals(this.occurrenceDateTime, this.deliverySupplyChainModel.occurrenceDateTime);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.deliverySupplyChainModel);

        assertEquals(this.expectedXML, xml);
    }
}
