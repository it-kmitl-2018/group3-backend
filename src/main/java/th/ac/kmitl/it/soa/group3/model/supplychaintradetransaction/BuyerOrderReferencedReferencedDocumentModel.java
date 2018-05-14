package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Builder(builderClassName = "Builder")
public class BuyerOrderReferencedReferencedDocumentModel {

    @JacksonXmlProperty(localName = "ram:IssuerAssignedID")
    public String issueAssignedID;

    @JacksonXmlProperty(localName = "ram:IssueDateTime")
    public Timestamp issueDateTime;

    @JacksonXmlProperty(localName = "ram:ReferenceTypeCode")
    public TypeCode referenceTypeCode;
}
