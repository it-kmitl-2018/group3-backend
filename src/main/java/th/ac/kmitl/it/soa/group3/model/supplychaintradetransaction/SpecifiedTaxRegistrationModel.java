package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedTaxRegistrationModel {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;
}
