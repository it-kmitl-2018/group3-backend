package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;

public class ApplicableTradeDeliveryTermsModel {

    private TypeCode deliveryTypeCode;

    private ApplicableTradeDeliveryTermsModel(Builder builder) {
        this.deliveryTypeCode = deliveryTypeCode;
    }

    public TypeCode getDeliveryTypeCode() {
        return deliveryTypeCode;
    }

    public void setDeliveryTypeCode(TypeCode deliveryTypeCode) {
        this.deliveryTypeCode = deliveryTypeCode;
    }

    public static class Builder {

        private TypeCode deliveryTypeCode;

        public Builder withDeliveryTypeCode(TypeCode deliveryTypeCode) {
            this.deliveryTypeCode = deliveryTypeCode;
            return this;
        }

        public ApplicableTradeDeliveryTermsModel build() {
            return new ApplicableTradeDeliveryTermsModel(this);
        }
    }
}
