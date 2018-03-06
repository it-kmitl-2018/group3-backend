package th.ac.kmitl.it.soa.group3.model.exchangeddocumentcontext;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@JacksonXmlRootElement(localName = "rsm:ExchangedDocumentContext")
@Builder(builderClassName = "builder")
public class ExchangedDocumentContextModel {

    @JacksonXmlProperty
    public GuidelineSpecifiedDocumentContextParameterModel  guidelineSpecifiedDocumentContextParameterModel;
}
