package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "rsm:SpecifiedTradeAllowanceCharge")
@Builder(builderClassName = "Builder")
public class SpecifiedTradeAllowanceChargeModel {

    @JacksonXmlProperty(localName = "ram:ChargeIndicator")
    public boolean chargeIndicator;

    @JacksonXmlProperty(localName = "ram:ActualAmount")
    public double actualAmount;

    @JacksonXmlProperty(localName = "ram:ReasonCode")
    public String reasonCode;

    @JacksonXmlProperty(localName = "ram:Reason")
    public String reason;
}
