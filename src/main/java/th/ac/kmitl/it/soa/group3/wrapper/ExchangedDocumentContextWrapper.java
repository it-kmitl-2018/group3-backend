package th.ac.kmitl.it.soa.group3.wrapper;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.exchangeddocumentcontext.ExchangedDocumentContextModel;
import th.ac.kmitl.it.soa.group3.model.exchangeddocumentcontext.GuidelineSpecifiedDocumentContextParameterModel;

@Builder(builderClassName = "builder")
public class ExchangedDocumentContextWrapper {

    public String guidelineDocumentId;

    public ExchangedDocumentContextWrapper() {
    }

    public ExchangedDocumentContextWrapper(String guidelineDocumentId) {
        this.guidelineDocumentId = guidelineDocumentId;
    }

    public ExchangedDocumentContextModel getModel() {
        GuidelineSpecifiedDocumentContextParameterModel contextParameterModel =
                GuidelineSpecifiedDocumentContextParameterModel.builder()
                .id(this.guidelineDocumentId)
                .build();

        ExchangedDocumentContextModel documentContextModel =
                ExchangedDocumentContextModel.builder()
                .guidelineSpecifiedDocumentContextParameterModel(contextParameterModel)
                .build();

        return documentContextModel;
    }
}
