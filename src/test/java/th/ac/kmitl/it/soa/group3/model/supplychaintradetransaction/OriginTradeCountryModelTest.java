package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OriginTradeCountryModelTest {

    private String id = "TH";

    @Test
    public void itShouldGetDateTimeByGetter() {
        OriginTradeCountryModel.Builder builder = new OriginTradeCountryModel.Builder();
        OriginTradeCountryModel originTradeCountryModel = builder
                .id(this.id)
                .build();

        assertEquals(this.id, originTradeCountryModel.id);
    }
}
