package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailUriUniversalCommunicationModelTest {
    private String uriID = "2312ZXS13";

    @Test
    public void itShouldGetUriIdInfoByGetter() {
        EmailUriUniversalCommunicationModel.Builder builder = EmailUriUniversalCommunicationModel.builder();
        EmailUriUniversalCommunicationModel emailUriUniversalCommunicationModel = builder
                .uriID(this.uriID)
                .build();

        assertEquals(this.uriID, emailUriUniversalCommunicationModel.uriID);
    }
}
