package th.ac.kmitl.it.soa.group3.model.exchangeddocumentcontext;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@JacksonXmlRootElement(localName = "ram:GuidelineSpecifiedDocumentContextParameter")
@Builder(builderClassName = "builder")
public class GuidelineSpecifiedDocumentContextParameterModel {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;
}
