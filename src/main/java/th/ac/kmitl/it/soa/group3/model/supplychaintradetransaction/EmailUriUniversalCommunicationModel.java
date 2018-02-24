package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class EmailUriUniversalCommunicationModel {

    private String uriID;

    private EmailUriUniversalCommunicationModel(Builder builder) {
        this.uriID = uriID;
    }

    public String getUriID() {
        return uriID;
    }

    public void setUriID(String uriID) {
        this.uriID = uriID;
    }

    public static class Builder {

        private String uriID;

        public Builder withUriID(String uriID) {
            this.uriID = uriID;
            return this;
        }

        public EmailUriUniversalCommunicationModel build() {
            return new EmailUriUniversalCommunicationModel(this);
        }
    }
}
