package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class DefinedTradeContactModel {

    public String personName;
    public String departmentName;
    public EmailUriUniversalCommunicationModel emailUriUniversalCommunicationModel;
    public TelephoneUniversalCommunicationModel telephoneUniversalCommunicationModel;
}
