package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import java.sql.Timestamp;

@Builder
public class BuyerOrderReferencedReferencedDocumentModel {

    private String issueAssignedID;
    private Timestamp issueDateTime;
    private TypeCode referenceTypeCode;
}
