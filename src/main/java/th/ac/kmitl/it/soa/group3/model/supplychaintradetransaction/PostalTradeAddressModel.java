package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class PostalTradeAddressModel {

    public String postCode;
    public String buildingName;
    public String line1;
    public String line2;
    public String line3;
    public String line4;
    public String line5;
    public String streetName;
    public String cityName;
    public String citySubDivisionName;
    public String countryID;
    public String countrySubDivisionID;
    public String buildingNumber;

    private PostalTradeAddressModel(Builder builder) {
        this.postCode = builder.postCode;
        this.buildingName = builder.buildingName;
        this.line1 = builder.line1;
        this.line2 = builder.line2;
        this.line3 = builder.line3;
        this.line4 = builder.line4;
        this.line5 = builder.line5;
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
        private String line1;
        private String line2;
        private String line3;
        private String line4;
        private String line5;
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

        public Builder withLine1(String line1) {
            this.line1 = line1;
            return this;
        }

        public Builder withLine2(String line2) {
            this.line2 = line2;
            return this;
        }

        public Builder withLine3(String line3) {
            this.line3 = line3;
            return this;
        }

        public Builder withLine4(String line4) {
            this.line4 = line4;
            return this;
        }

        public Builder withLine5(String line5) {
            this.line5 = line5;
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
