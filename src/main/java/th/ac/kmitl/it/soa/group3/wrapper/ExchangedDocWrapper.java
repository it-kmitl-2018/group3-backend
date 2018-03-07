package th.ac.kmitl.it.soa.group3.wrapper;

import th.ac.kmitl.it.soa.group3.forms.TaxInvoiceForm;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.ExchangedDocumentModel;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

public class ExchangedDocWrapper {

    public TaxInvoiceForm taxInvoiceForm;

    public ExchangedDocWrapper(TaxInvoiceForm taxInvoiceForm) {
        this.taxInvoiceForm = taxInvoiceForm;
    }

    public ExchangedDocumentModel getModelClass() {
        IncludedNoteModel includedNote = IncludedNoteModel.builder()
                .subject(this.taxInvoiceForm.subject)
                .content(this.taxInvoiceForm.content)
                .build();
        ExchangedDocumentModel exchangedDocument = ExchangedDocumentModel.builder()
                .id(this.taxInvoiceForm.subject)
                .name(this.taxInvoiceForm.name)
                .typeCode(this.taxInvoiceForm.typeCode)
                .issueDateTime(this.taxInvoiceForm.issueDateTime)
                .purpose(this.taxInvoiceForm.purpose)
                .purposeCode(this.taxInvoiceForm.purposeCode)
                .globalID(this.taxInvoiceForm.globalID)
                .creationDateTime(this.taxInvoiceForm.creationDateTime)
                .includedNote(includedNote)
                .build();

        return exchangedDocument;
    }
}
