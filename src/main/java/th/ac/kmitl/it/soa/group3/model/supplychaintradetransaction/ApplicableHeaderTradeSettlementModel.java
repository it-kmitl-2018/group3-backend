package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;

public class ApplicableHeaderTradeSettlementModel {

    private TypeCode invoiceCurrencyCode;
    private ApplicableTradeTaxModel applicableTradeTax;
    private SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge;
    private SpecifiedTradePaymentTermsModel specifiedTradePaymentTerms;
    private SpecifiedTradeSettlementHeaderMonetarySummationModel specifiedTradeSettlementHeaderMonetarySummation;
    private TradePartyModel invoicerTradeParty;
    private TradePartyModel invoiceeTradeParty;
    private TradePartyModel payerTradeParty;
    private TradePartyModel payeeTradeParty;

    public ApplicableHeaderTradeSettlementModel(Builder builder) {
        this.invoiceCurrencyCode = builder.invoiceCurrencyCode;
        this.applicableTradeTax = builder.applicableTradeTax;
        this.specifiedTradeAllowanceCharge = builder.specifiedTradeAllowanceCharge;
        this.specifiedTradePaymentTerms = builder.specifiedTradePaymentTerms;
        this.specifiedTradeSettlementHeaderMonetarySummation =
                builder.specifiedTradeSettlementHeaderMonetarySummation;
        this.invoicerTradeParty = builder.invoicerTradeParty;
        this.invoiceeTradeParty = builder.invoiceeTradeParty;
        this.payerTradeParty = builder.payerTradeParty;
        this.payeeTradeParty = builder.payeeTradeParty;
    }

    public TypeCode getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(TypeCode invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    public ApplicableTradeTaxModel getApplicableTradeTax() {
        return applicableTradeTax;
    }

    public void setApplicableTradeTax(ApplicableTradeTaxModel applicableTradeTax) {
        this.applicableTradeTax = applicableTradeTax;
    }

    public SpecifiedTradeAllowanceChargeModel getSpecifiedTradeAllowanceCharge() {
        return specifiedTradeAllowanceCharge;
    }

    public void setSpecifiedTradeAllowanceCharge(
            SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge) {
        this.specifiedTradeAllowanceCharge = specifiedTradeAllowanceCharge;
    }

    public SpecifiedTradePaymentTermsModel getSpecifiedTradePaymentTerms() {
        return specifiedTradePaymentTerms;
    }

    public void setSpecifiedTradePaymentTerms(
            SpecifiedTradePaymentTermsModel specifiedTradePaymentTerms) {
        this.specifiedTradePaymentTerms = specifiedTradePaymentTerms;
    }

    public SpecifiedTradeSettlementHeaderMonetarySummationModel getSpecifiedTradeSettlementHeaderMonetarySummation() {
        return specifiedTradeSettlementHeaderMonetarySummation;
    }

    public void setSpecifiedTradeSettlementHeaderMonetarySummation(
            SpecifiedTradeSettlementHeaderMonetarySummationModel specifiedTradeSettlementHeaderMonetarySummation) {
        this.specifiedTradeSettlementHeaderMonetarySummation = specifiedTradeSettlementHeaderMonetarySummation;
    }

    public TradePartyModel getInvoicerTradeParty() {
        return invoicerTradeParty;
    }

    public void setInvoicerTradeParty(TradePartyModel invoicerTradeParty) {
        this.invoicerTradeParty = invoicerTradeParty;
    }

    public TradePartyModel getInvoiceeTradeParty() {
        return invoiceeTradeParty;
    }

    public void setInvoiceeTradeParty(TradePartyModel invoiceeTradeParty) {
        this.invoiceeTradeParty = invoiceeTradeParty;
    }

    public TradePartyModel getPayerTradeParty() {
        return payerTradeParty;
    }

    public void setPayerTradeParty(TradePartyModel payerTradeParty) {
        this.payerTradeParty = payerTradeParty;
    }

    public TradePartyModel getPayeeTradeParty() {
        return payeeTradeParty;
    }

    public void setPayeeTradeParty(TradePartyModel payeeTradeParty) {
        this.payeeTradeParty = payeeTradeParty;
    }

    public static class Builder {

        private TypeCode invoiceCurrencyCode;
        private ApplicableTradeTaxModel applicableTradeTax;
        private SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge;
        private SpecifiedTradePaymentTermsModel specifiedTradePaymentTerms;
        private SpecifiedTradeSettlementHeaderMonetarySummationModel specifiedTradeSettlementHeaderMonetarySummation;
        private TradePartyModel invoicerTradeParty;
        private TradePartyModel invoiceeTradeParty;
        private TradePartyModel payerTradeParty;
        private TradePartyModel payeeTradeParty;

        public Builder withInvoiceCurrencyCode(TypeCode invoiceCurrencyCode) {
            this.invoiceCurrencyCode = invoiceCurrencyCode;
            return this;
        }

        public Builder withApplicableTradeTax(ApplicableTradeTaxModel applicableTradeTax) {
            this.applicableTradeTax = applicableTradeTax;
            return this;
        }

        public Builder withSpecifiedTradeAllowanceCharge(
                SpecifiedTradeAllowanceChargeModel specifiedTradeAllowanceCharge) {
            this.specifiedTradeAllowanceCharge = specifiedTradeAllowanceCharge;
            return this;
        }

        public Builder withSpecifiedTradeSettlementHeaderMonetarySummation(
                SpecifiedTradeSettlementHeaderMonetarySummationModel
                        specifiedTradeSettlementHeaderMonetarySummation) {
            this.specifiedTradeSettlementHeaderMonetarySummation = specifiedTradeSettlementHeaderMonetarySummation;
            return this;
        }

        public Builder withInvoicerTradeParty(TradePartyModel invoicerTradeParty) {
            this.invoicerTradeParty = invoicerTradeParty;
            return this;
        }

        public Builder withInvoiceeTradeParty(TradePartyModel invoiceeTradeParty) {
            this.invoiceeTradeParty = invoiceeTradeParty;
            return this;
        }

        public Builder withPayerTradeParty(TradePartyModel payerTradeParty) {
            this.payerTradeParty = payerTradeParty;
            return this;
        }

        public Builder withPayeeTradeParty(TradePartyModel payeeTradeParty) {
            this.payeeTradeParty = payeeTradeParty;
            return this;
        }

        public ApplicableHeaderTradeSettlementModel build() {
            return new ApplicableHeaderTradeSettlementModel(this);
        }
    }
}
