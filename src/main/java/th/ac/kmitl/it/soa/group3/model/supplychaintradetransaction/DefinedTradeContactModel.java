package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class DefinedTradeContactModel {

    private String personName;
    private String departmentName;
    private EmailUriUniversalCommunicationModel emailUriUniversalCommunication;
    private TelephoneUniversalCommunicationModel telephoneUniversalCommunication;

    private DefinedTradeContactModel(Builder builder) {
        this.personName = builder.personName;
        this.departmentName = builder.departmentName;
        this.emailUriUniversalCommunication = builder.emailUriUniversalCommunication;
        this.telephoneUniversalCommunication = builder.telephoneUniversalCommunication;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public EmailUriUniversalCommunicationModel getEmailUriUniversalCommunication() {
        return emailUriUniversalCommunication;
    }

    public void setEmailUriUniversalCommunication(
            EmailUriUniversalCommunicationModel emailUriUniversalCommunication) {
        this.emailUriUniversalCommunication = emailUriUniversalCommunication;
    }

    public TelephoneUniversalCommunicationModel getTelephoneUniversalCommunication() {
        return telephoneUniversalCommunication;
    }

    public void setTelephoneUniversalCommunication(
            TelephoneUniversalCommunicationModel telephoneUniversalCommunication) {
        this.telephoneUniversalCommunication = telephoneUniversalCommunication;
    }

    public static class Builder {

        private String personName;
        private String departmentName;
        private EmailUriUniversalCommunicationModel emailUriUniversalCommunication;
        private TelephoneUniversalCommunicationModel telephoneUniversalCommunication;

        public Builder withPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public Builder withDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder withEmailUriUniversalCommunication(
                EmailUriUniversalCommunicationModel emailUriUniversalCommunication) {
            this.emailUriUniversalCommunication = emailUriUniversalCommunication;
            return this;
        }

        public Builder withTelephoneUniversalCommunication(
                TelephoneUniversalCommunicationModel telephoneUniversalCommunication) {
            this.telephoneUniversalCommunication = telephoneUniversalCommunication;
            return this;
        }

        public DefinedTradeContactModel build() {
            return new DefinedTradeContactModel(this);
        }
    }
}
