package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import java.sql.Timestamp;
import lombok.Builder;

@Builder(builderClassName = "Builder")
public class ActualDeliverySupplyChainEventModel {

    public Timestamp occurrenceDateTime;
}
