package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;

@Builder(builderClassName = "Builder")
public class SpecifiedTradeProductModel {

    public String id;
    public String globalID;
    public String name;
    public String description;
    public IndividualTradeProductInstanceModel individualTradeProductInstance;
    public DesignatedProductClassificationModel designatedProductClassification;
    public OriginTradeCountryModel originTradeCountry;
    public IncludedNoteModel informationNote;
}
