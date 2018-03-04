package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelephoneUniversalCommunicationModelTest {

    private final String phoneNumber = "0818574938";

    @Test
    public void itShouldBePhoneNumber() {
        TelephoneUniversalCommunicationModel.Builder builder = new TelephoneUniversalCommunicationModel.Builder();
        TelephoneUniversalCommunicationModel phoneNumberModel = builder.phoneNumber(phoneNumber).build();
        assertEquals(phoneNumber, phoneNumberModel.phoneNumber);
    }

}
