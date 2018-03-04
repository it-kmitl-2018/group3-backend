package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefinedTradeContactModelTest {

    private String personName = "Alice";
    private String departmentName = "Accounting";
    private String email = "example@mail.com";
    private String phoneNo = "(+66) 89-1234567";

    private EmailUriUniversalCommunicationModel emailUri = new EmailUriUniversalCommunicationModel.Builder()
            .uriID(this.email)
            .build();

    private TelephoneUniversalCommunicationModel phoneNumber = new TelephoneUniversalCommunicationModel.Builder()
            .phoneNumber(this.phoneNo)
            .build();

    @Test
    public void expectTradeContactInfo() {
        DefinedTradeContactModel.Builder builder = new DefinedTradeContactModel.Builder();
        DefinedTradeContactModel definedTradeContactModel = builder
                .personName(this.personName)
                .departmentName(this.departmentName)
                .emailUriUniversalCommunicationModel(this.emailUri)
                .telephoneUniversalCommunicationModel(this.phoneNumber)
                .build();

        assertEquals(this.personName, definedTradeContactModel.personName);
        assertEquals(this.departmentName, definedTradeContactModel.departmentName);
        assertEquals(this.emailUri, definedTradeContactModel.emailUriUniversalCommunicationModel);
        assertEquals(this.phoneNumber, definedTradeContactModel.telephoneUniversalCommunicationModel);
    }
}
