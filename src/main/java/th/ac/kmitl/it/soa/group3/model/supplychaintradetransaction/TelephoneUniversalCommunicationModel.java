package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class TelephoneUniversalCommunicationModel {

    private String phoneNumber;

    private TelephoneUniversalCommunicationModel(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static class Builder {

        private String phoneNumber;

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public TelephoneUniversalCommunicationModel build() {
            return new TelephoneUniversalCommunicationModel(this);
        }
    }
}
