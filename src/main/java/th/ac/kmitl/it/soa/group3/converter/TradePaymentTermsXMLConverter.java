package th.ac.kmitl.it.soa.group3.converter;

import java.sql.Timestamp;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedTradePaymentTermsModel;

@JacksonXmlRootElement(localName = "rsm:SpecifiedTradePaymentTerms")
public class TradePaymentTermsXMLConverter {

    @JacksonXmlProperty(localName = "ram:TypeCode")
    private String typeCode;

    @JacksonXmlProperty(localName = "ram:Description")
    private String description;

    @JacksonXmlProperty(localName = "ram:DueDateDateTime")
    private Timestamp dueDateTime;

    public TradePaymentTermsXMLConverter(SpecifiedTradePaymentTermsModel tradePaymentTerms) {
        this.typeCode = tradePaymentTerms.typeCode;
        this.description = tradePaymentTerms.description;
        this.dueDateTime = tradePaymentTerms.dueDateTime;
    }
}
