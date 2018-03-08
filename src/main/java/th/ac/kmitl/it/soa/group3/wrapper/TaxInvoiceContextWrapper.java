package th.ac.kmitl.it.soa.group3.wrapper;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.taxinvoicecontext.TaxInvoiceContextModel;
import th.ac.kmitl.it.soa.group3.model.taxinvoicecontext.TaxInvoiceContextSpecModel;

@Builder(builderClassName = "builder")
public class TaxInvoiceContextWrapper {

    public String contextId;

    public TaxInvoiceContextWrapper() {
    }

    public TaxInvoiceContextWrapper(String contextId) {
        this.contextId = contextId;
    }

    public TaxInvoiceContextModel getModel() {
        TaxInvoiceContextSpecModel contextParameterModel =
                TaxInvoiceContextSpecModel.builder()
                .id(this.contextId)
                .build();

        TaxInvoiceContextModel documentContextModel =
                TaxInvoiceContextModel.builder()
                .taxInvoiceContextSpecModel(contextParameterModel)
                .build();

        return documentContextModel;
    }
}
