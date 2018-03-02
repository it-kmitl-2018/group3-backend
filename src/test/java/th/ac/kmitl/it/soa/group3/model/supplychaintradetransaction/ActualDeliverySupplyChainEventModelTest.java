package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class ActualDeliverySupplyChainEventModelTest {

    private Timestamp occurrenceDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void itShouldGetDateTimeByGetter() {
        ActualDeliverySupplyChainEventModel.Builder builder = new ActualDeliverySupplyChainEventModel.Builder();
        ActualDeliverySupplyChainEventModel deliverySupplyChainModel = builder
                .occurrenceDateTime(this.occurrenceDateTime)
                .build();

        assertEquals(this.occurrenceDateTime, deliverySupplyChainModel.occurrenceDateTime);
    }
}
