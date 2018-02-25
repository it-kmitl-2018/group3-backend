package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class PhoneUniversalModel {

    // Telephone Universal Communication

    public String phoneNumber;

    public PhoneUniversalModel(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
        private String phoneNumber;

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PhoneUniversalModel build() {
            return new PhoneUniversalModel(this);
        }
    }
}