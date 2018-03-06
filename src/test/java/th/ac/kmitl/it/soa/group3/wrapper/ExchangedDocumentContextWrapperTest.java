package th.ac.kmitl.it.soa.group3.wrapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExchangedDocumentContextWrapperTest {

    private String id = "AER123";

    @Test
    void itShouldGetIdByWrapper() {
        ExchangedDocumentContextWrapper wrapper = ExchangedDocumentContextWrapper.builder()
                .guidelineDocumentId(this.id)
                .build();

        assertNotNull(wrapper.getModel());
        assertNotNull(wrapper.getModel().guidelineSpecifiedDocumentContextParameterModel);
        assertEquals(this.id, wrapper.getModel().guidelineSpecifiedDocumentContextParameterModel.id);
    }
}