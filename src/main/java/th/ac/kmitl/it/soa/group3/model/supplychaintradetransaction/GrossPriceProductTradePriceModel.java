package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class GrossPriceProductTradePriceModel {

    private double chargeAmount;

    public GrossPriceProductTradePriceModel(Builder builder) {
        this.chargeAmount = builder.chargeAmount;
    }

    public double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public static class Builder {

        private double chargeAmount;

        public Builder withChargeAmount(double chargeAmount) {
            this.chargeAmount = chargeAmount;
            return this;
        }

        public GrossPriceProductTradePriceModel build() {
            return new GrossPriceProductTradePriceModel(this);
        }
    }
}
