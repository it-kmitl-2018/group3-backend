package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedLineTradeAgreementModel {

    private GrossPriceProductTradePriceModel grossPriceProductTradePrice;

    private SpecifiedLineTradeAgreementModel(Builder builder) {
        this.grossPriceProductTradePrice = builder.grossPriceProductTradePrice;
    }

    public GrossPriceProductTradePriceModel getGrossPriceProductTradePrice() {
        return grossPriceProductTradePrice;
    }

    public void setGrossPriceProductTradePrice(GrossPriceProductTradePriceModel grossPriceProductTradePrice) {
        this.grossPriceProductTradePrice = grossPriceProductTradePrice;
    }

    public static class Builder {

        private GrossPriceProductTradePriceModel grossPriceProductTradePrice;

        public Builder withGrossPriceProductTradePrice(
                GrossPriceProductTradePriceModel grossPriceProductTradePrice) {
            this.grossPriceProductTradePrice = grossPriceProductTradePrice;
            return this;
        }

        public SpecifiedLineTradeAgreementModel build() {
            return new SpecifiedLineTradeAgreementModel(this);
        }
    }
}
