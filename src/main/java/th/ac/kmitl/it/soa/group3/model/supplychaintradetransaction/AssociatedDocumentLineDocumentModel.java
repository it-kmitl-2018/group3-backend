package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class AssociatedDocumentLineDocumentModel {

    private String lineID;

    private AssociatedDocumentLineDocumentModel(Builder builder) {
        this.lineID = builder.lineID;
    }

    public String getLineID() {
        return lineID;
    }

    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    public static class Builder {

        private String lineID;

        public Builder withLineID(String lineID) {
            this.lineID = lineID;
            return this;
        }

        public AssociatedDocumentLineDocumentModel build() {
            return new AssociatedDocumentLineDocumentModel(this);
        }
    }
}
