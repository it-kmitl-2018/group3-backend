package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class BuyerOrderReferencedReferencedDocumentModel {

    public String issueAssignedID;
    public Timestamp issueDateTime;
    public TypeCode referenceTypeCode;
}
