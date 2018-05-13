package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import java.sql.Timestamp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@JacksonXmlRootElement(localName = "rsm:ActualDeliverySupplyChainEvent")
@Builder(builderClassName = "Builder")
public class ActualDeliverySupplyChainEventModel {

    @JacksonXmlProperty(localName = "ram:OccurrenceDateTime")
    public Timestamp occurrenceDateTime;
}
