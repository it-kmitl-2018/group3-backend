package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

import lombok.Builder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ram:IncludedNote")
@Builder(builderClassName = "Builder")
public class IncludedNoteModel {

    @JacksonXmlProperty(localName = "ram:Subject")
    public String subject;

    @JacksonXmlProperty(localName = "ram:Content")
    public String content;
}
