package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "rsm:ApplicableHeaderTradeDelivery")
@Builder(builderClassName = "Builder")
public class TradeTaxModel {

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public String typeCode;

    @JacksonXmlProperty(localName = "ram:CalculatedRate")
    public double calculatedRate;

    @JacksonXmlProperty(localName = "ram:BasisAmount")
    public double basisAmount;

    @JacksonXmlProperty(localName = "ram:CalculatedAmount")
    public double calculatedAmount;
}
