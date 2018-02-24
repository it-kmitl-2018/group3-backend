package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedLineTradeDeliveryModel {

    private int billedQuantity;
    private int perPackageUnitQuantity;

    private SpecifiedLineTradeDeliveryModel(Builder builder) {
        this.billedQuantity = builder.billedQuantity;
        this.perPackageUnitQuantity = builder.perPackageUnitQuantity;
    }

    public int getBilledQuantity() {
        return billedQuantity;
    }

    public void setBilledQuantity(int billedQuantity) {
        this.billedQuantity = billedQuantity;
    }

    public int getPerPackageUnitQuantity() {
        return perPackageUnitQuantity;
    }

    public void setPerPackageUnitQuantity(int perPackageUnitQuantity) {
        this.perPackageUnitQuantity = perPackageUnitQuantity;
    }

    public static class Builder {

        private int billedQuantity;
        private int perPackageUnitQuantity;

        public Builder withBilledQuantity(int billedQuantity) {
            this.billedQuantity = billedQuantity;
            return this;
        }

        public Builder withPerPackageUnitQuantity(int perPackageUnitQuantity) {
            this.perPackageUnitQuantity = perPackageUnitQuantity;
            return this;
        }

        public SpecifiedLineTradeDeliveryModel build() {
            return new SpecifiedLineTradeDeliveryModel(this);
        }
    }
}
