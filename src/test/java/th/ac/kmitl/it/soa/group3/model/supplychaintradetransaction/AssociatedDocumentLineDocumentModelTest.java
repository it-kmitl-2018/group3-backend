package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssociatedDocumentLineDocumentModelTest {

    private final String lineID = "8080";

    @Test
    public void expectLineID() {
        AssociatedDocumentLineDocumentModel.Builder builder = new AssociatedDocumentLineDocumentModel.Builder();
        AssociatedDocumentLineDocumentModel associatedDocLineDocModel = builder
                .lineID(this.lineID)
                .build();

        assertEquals(this.lineID, associatedDocLineDocModel.lineID);
    }
}
