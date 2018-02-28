package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTaxRegistrationModelTest {

    private String id = "1234567890123";

    @Test
    public void itShouldGetIDByGetter() {
        SpecifiedTaxRegistrationModel.Builder builder = new SpecifiedTaxRegistrationModel.Builder();
        SpecifiedTaxRegistrationModel specTaxRegisModel = builder
                .withID(this.id)
                .build();

        assertEquals(this.id, specTaxRegisModel.id);
    }
}
