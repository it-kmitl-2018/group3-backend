package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class PostalTradeAddressModel {

    public String postCode;
    public String buildingName;
    public String addressLine1;
    public String addressLine2;
    public String soi;
    public String village;
    public String moo;
    public String streetName;
    public String cityName;
    public String citySubDivisionName;
    public String countryID;
    public String countrySubDivisionID;
    public String buildingNumber;

    private PostalTradeAddressModel(Builder builder) {
        this.postCode = builder.postCode;
        this.buildingName = builder.buildingName;
        this.addressLine1 = builder.addressLine1;
        this.addressLine2 = builder.addressLine2;
        this.soi = builder.soi;
        this.village = builder.village;
        this.moo = builder.moo;
        this.streetName = builder.streetName;
        this.cityName = builder.cityName;
        this.citySubDivisionName = builder.citySubDivisionName;
        this.countryID = builder.countryID;
        this.countrySubDivisionID = builder.countrySubDivisionID;
        this.buildingNumber = builder.buildingNumber;
    }

    public static class Builder {

        private String postCode;
        private String buildingName;
        private String addressLine1;
        private String addressLine2;
        private String soi;
        private String village;
        private String moo;
        private String streetName;
        private String cityName;
        private String citySubDivisionName;
        private String countryID;
        private String countrySubDivisionID;
        private String buildingNumber;

        public Builder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public Builder withBuildingName(String buildingName) {
            this.buildingName = buildingName;
            return this;
        }

        public Builder withAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder withAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder withSoi(String soi) {
            this.soi = soi;
            return this;
        }

        public Builder withVillage(String village) {
            this.village = village;
            return this;
        }

        public Builder withMoo(String moo) {
            this.moo = moo;
            return this;
        }

        public Builder withStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder withCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder withCitySubDivisionName(String citySubDivisionName) {
            this.citySubDivisionName = citySubDivisionName;
            return this;
        }

        public Builder withCountryID(String countryID) {
            this.countryID = countryID;
            return this;
        }

        public Builder withCountrySubDivisionID(String countrySubDivisionID) {
            this.countrySubDivisionID = countrySubDivisionID;
            return this;
        }

        public Builder withBuildingNumber(String buildingNumber) {
            this.buildingNumber = buildingNumber;
            return this;
        }

        public PostalTradeAddressModel build() {
            return new PostalTradeAddressModel(this);
        }
    }
}
