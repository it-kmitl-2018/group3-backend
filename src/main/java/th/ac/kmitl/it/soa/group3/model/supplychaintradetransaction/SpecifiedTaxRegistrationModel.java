package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class SpecifiedTaxRegistrationModel {

    private String id;

    private SpecifiedTaxRegistrationModel(Builder builder) {
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class Builder {

        private String id;

        public Builder withID(String id) {
            this.id = id;
            return this;
        }

        public SpecifiedTaxRegistrationModel build() {
            return new SpecifiedTaxRegistrationModel(this);
        }
    }
}
