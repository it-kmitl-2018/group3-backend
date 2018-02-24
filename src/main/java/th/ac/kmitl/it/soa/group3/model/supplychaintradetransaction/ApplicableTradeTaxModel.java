package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;

public class ApplicableTradeTaxModel {

    private TypeCode typeCode;
    private float calculatedRate;
    private double basicAmount;
    private double calculatedAmout;

    private ApplicableTradeTaxModel(Builder builder) {
        this.typeCode = builder.typeCode;
        this.calculatedRate = builder.calculatedRate;
        this.basicAmount = builder.basicAmount;
        this.calculatedAmout = builder.calculatedAmout;
    }

    public TypeCode getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(TypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public float getCalculatedRate() {
        return calculatedRate;
    }

    public void setCalculatedRate(float calculatedRate) {
        this.calculatedRate = calculatedRate;
    }

    public double getBasicAmount() {
        return basicAmount;
    }

    public void setBasicAmount(double basicAmount) {
        this.basicAmount = basicAmount;
    }

    public double getCalculatedAmout() {
        return calculatedAmout;
    }

    public void setCalculatedAmout(double calculatedAmout) {
        this.calculatedAmout = calculatedAmout;
    }

    public static class Builder {

        private TypeCode typeCode;
        private float calculatedRate;
        private double basicAmount;
        private double calculatedAmout;

        public Builder withTypeCode(TypeCode typeCode) {
            this.typeCode = typeCode;
            return this;
        }

        public Builder withCalculatedRate(float calculatedRate) {
            this.calculatedRate = calculatedRate;
            return this;
        }

        public Builder withBasicAmount(double basicAmount) {
            this.basicAmount = basicAmount;
            return this;
        }

        public Builder withCalculatedAmout(double calculatedAmout) {
            this.calculatedAmout = calculatedAmout;
            return this;
        }

        public ApplicableTradeTaxModel build() {
            return new ApplicableTradeTaxModel(this);
        }
    }
}
