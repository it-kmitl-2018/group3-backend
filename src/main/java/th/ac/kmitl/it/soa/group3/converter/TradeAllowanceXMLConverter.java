package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedTradeAllowanceChargeModel;

@JacksonXmlRootElement(localName = "rsm:SpecifiedTradeAllowanceCharge")
public class TradeAllowanceXMLConverter {

    @JacksonXmlProperty(localName = "ram:ChargeIndicator")
    private boolean chargeIndicator;

    @JacksonXmlProperty(localName = "ram:ActualAmount")
    private double actualAmount;

    @JacksonXmlProperty(localName = "ram:ReasonCode")
    private String reasonCode;

    @JacksonXmlProperty(localName = "ram:Reason")
    private String reason;

    public TradeAllowanceXMLConverter(SpecifiedTradeAllowanceChargeModel tradeAllowanceCharge) {
        this.chargeIndicator = tradeAllowanceCharge.chargeIndicator;
        this.actualAmount = tradeAllowanceCharge.actualAmount;
        this.reasonCode = tradeAllowanceCharge.reasonCode;
        this.reason = tradeAllowanceCharge.reason;
    }
}
