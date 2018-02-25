package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneUniversalModelTest {

    private final String phoneNumber = "0818574938";

    @Test
    public void itShouldBePhoneNumber() {

        PhoneUniversalModel phoneModel = new PhoneUniversalModel(phoneNumber);
        assertEquals(phoneNumber, phoneModel.phoneNumber);

    }

}
