package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;
import java.sql.Timestamp;

@JacksonXmlRootElement(localName = "rsm:ExchangedDocument")
@Builder(builderClassName = "Builder")
public class ExchangedDocumentModel {

    @JacksonXmlProperty(localName = "ram:ID")
    public String id;

    @JacksonXmlProperty(localName = "ram:Name")
    public String name;

    @JacksonXmlProperty(localName = "ram:TypeCode")
    public String typeCode;

    @JacksonXmlProperty(localName = "ram:IssueDateTime")
    public Timestamp issueDateTime;

    @JacksonXmlProperty(localName = "ram:Purpose")
    public String purpose;

    @JacksonXmlProperty(localName = "ram:PurposeCode")
    public String purposeCode;

    @JacksonXmlProperty(localName = "ram:GlobalID")
    public String globalID;

    @JacksonXmlProperty(localName = "ram:CreationDateTime")
    public Timestamp creationDateTime;

    @JacksonXmlProperty(localName = "ram:IncludedNote")
    public IncludedNoteModel includedNote;
}
