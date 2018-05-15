package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradeTaxModel;

@JacksonXmlRootElement(localName = "rsm:ApplicableTradeTax")
public class TradeTaxXMLConverter {

    @JacksonXmlProperty(localName = "ram:TypeCode")
    private String typeCode;

    @JacksonXmlProperty(localName = "ram:CalculatedRate")
    private double calculatedRate;

    @JacksonXmlProperty(localName = "ram:BasisAmount")
    private double basisAmount;

    @JacksonXmlProperty(localName = "ram:CalculatedAmount")
    private double calculatedAmount;

    public TradeTaxXMLConverter(TradeTaxModel tradeTax) {
        this.typeCode = tradeTax.typeCode;
        this.calculatedRate = tradeTax.calculatedRate;
        this.basisAmount = tradeTax.basisAmount;
        this.calculatedAmount = tradeTax.calculatedAmount;
    }
}
