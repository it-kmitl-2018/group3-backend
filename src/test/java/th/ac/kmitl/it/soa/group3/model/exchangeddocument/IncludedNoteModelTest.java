package th.ac.kmitl.it.soa.group3.model.exchangeddocument;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

public class IncludedNoteModelTest {

    private String subject = "E-Tax Invoice";
    private String content = "This is a content of this subject.";

    @Test
    public void itShouldGetSubjectAndContentByGetter() {

        IncludedNoteModel.Builder builder = new IncludedNoteModel.Builder();
        IncludedNoteModel includedNoteModel = builder
                .withSubject(this.subject)
                .withContent(this.content)
                .build();

        assertEquals(subject, includedNoteModel.subject);
        assertEquals(content, includedNoteModel.content);
    }
}
