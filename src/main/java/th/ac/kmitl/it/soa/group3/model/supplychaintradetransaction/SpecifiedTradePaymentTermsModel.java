package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class SpecifiedTradePaymentTermsModel {

    public String typeCode;
    public String description;
    public Timestamp dueDateTime;
}
