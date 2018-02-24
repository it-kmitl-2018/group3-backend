package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class TradePartyModel {

    private String id;
    private String globalID;
    private String name;
    private SpecifiedTaxRegistrationModel specifiedTaxRegistration;
    private DefinedTradeContactModel definedTradeContact;
    private PostalTradeAddressModel postalTradeAddress;

    private TradePartyModel(Builder builder) {
        this.id = builder.id;
        this.globalID = builder.globalID;
        this.name = builder.name;
        this.specifiedTaxRegistration = builder.specifiedTaxRegistration;
        this.definedTradeContact = builder.definedTradeContact;
        this.postalTradeAddress = builder.postalTradeAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalID() {
        return globalID;
    }

    public void setGlobalID(String globalID) {
        this.globalID = globalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpecifiedTaxRegistrationModel getSpecifiedTaxRegistration() {
        return specifiedTaxRegistration;
    }

    public void setSpecifiedTaxRegistration(
            SpecifiedTaxRegistrationModel specifiedTaxRegistration) {
        this.specifiedTaxRegistration = specifiedTaxRegistration;
    }

    public DefinedTradeContactModel getDefinedTradeContact() {
        return definedTradeContact;
    }

    public void setDefinedTradeContact(
            DefinedTradeContactModel definedTradeContact) {
        this.definedTradeContact = definedTradeContact;
    }

    public PostalTradeAddressModel getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(
            PostalTradeAddressModel postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }

    public static class Builder {

        private String id;
        private String globalID;
        private String name;
        private SpecifiedTaxRegistrationModel specifiedTaxRegistration;
        private DefinedTradeContactModel definedTradeContact;
        private PostalTradeAddressModel postalTradeAddress;

        public Builder withID(String id) {
            this.id = id;
            return this;
        }

        public Builder withGlobalID(String globalID) {
            this.globalID = globalID;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSpecifiedTaxRegistration(
                SpecifiedTaxRegistrationModel specifiedTaxRegistration) {
            this.specifiedTaxRegistration = specifiedTaxRegistration;
            return this;
        }

        public Builder withDefinedTradeContact(
                DefinedTradeContactModel definedTradeContact) {
            this.definedTradeContact = definedTradeContact;
            return this;
        }

        public Builder withPostalTradeAddress(
                PostalTradeAddressModel postalTradeAddress) {
            this.postalTradeAddress = postalTradeAddress;
            return this;
        }

        public TradePartyModel build() {
            return new TradePartyModel(this);
        }
    }
}
