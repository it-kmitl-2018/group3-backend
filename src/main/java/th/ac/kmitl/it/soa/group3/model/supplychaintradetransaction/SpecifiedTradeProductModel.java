package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

public class SpecifiedTradeProductModel {

    private String id;
    private String globalID;
    private String name;
    private String description;
    private IndividualTradeProductInstanceModel individualTradeProductInstance;
    private DesignatedProductClassificationModel designatedProductClassification;
    private OriginTradeCountryModel originTradeCountry;
    private IncludedNoteModel informationNote;

    private SpecifiedTradeProductModel(Builder builder) {
        this.id = builder.id;
        this.globalID = builder.globalID;
        this.name = builder.name;
        this.description = builder.description;
        this.individualTradeProductInstance = builder.individualTradeProductInstance;
        this.designatedProductClassification = builder.designatedProductClassification;
        this.originTradeCountry = builder.originTradeCountry;
        this.informationNote = builder.informationNote;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IndividualTradeProductInstanceModel getIndividualTradeProductInstance() {
        return individualTradeProductInstance;
    }

    public void setIndividualTradeProductInstance(IndividualTradeProductInstanceModel individualTradeProductInstance) {
        this.individualTradeProductInstance = individualTradeProductInstance;
    }

    public DesignatedProductClassificationModel getDesignatedProductClassification() {
        return designatedProductClassification;
    }

    public void setDesignatedProductClassification(DesignatedProductClassificationModel designatedProductClassification) {
        this.designatedProductClassification = designatedProductClassification;
    }

    public OriginTradeCountryModel getOriginTradeCountry() {
        return originTradeCountry;
    }

    public void setOriginTradeCountry(OriginTradeCountryModel originTradeCountry) {
        this.originTradeCountry = originTradeCountry;
    }

    public IncludedNoteModel getInformationNote() {
        return informationNote;
    }

    public void setInformationNote(IncludedNoteModel informationNote) {
        this.informationNote = informationNote;
    }

    public static class Builder {

        private String id;
        private String globalID;
        private String name;
        private String description;
        private IndividualTradeProductInstanceModel individualTradeProductInstance;
        private DesignatedProductClassificationModel designatedProductClassification;
        private OriginTradeCountryModel originTradeCountry;
        private IncludedNoteModel informationNote;

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

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withIndividualTradeProductInstance(
                IndividualTradeProductInstanceModel individualTradeProductInstance) {
            this.individualTradeProductInstance = individualTradeProductInstance;
            return this;
        }

        public Builder withDesignatedProductClassification(
                DesignatedProductClassificationModel designatedProductClassification) {
            this.designatedProductClassification = designatedProductClassification;
            return this;
        }

        public Builder withOriginTradeCountry(OriginTradeCountryModel originTradeCountry) {
            this.originTradeCountry = originTradeCountry;
            return this;
        }

        public Builder withInformationNote(IncludedNoteModel informationNote) {
            this.informationNote = informationNote;
            return this;
        }

        public SpecifiedTradeProductModel build() {
            return new SpecifiedTradeProductModel(this);
        }
    }
}
