package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Before;
import org.junit.Test;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.exchangeddocument.IncludedNoteModel;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecifiedTradeProductModelTest {

    private String id = "PR00001";
    private String globalID = "12345678901234";
    private String name = "ดินสอเขียนคิ้ว";
    private String description = "ดินสอเขียนคิ้วแบบปลายแหลม";
    private String batchID = "1/8";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());
    private String classCode = "TE2031";
    private String className = "Test Expression 2031";
    private String countryID = "TH";
    private String subject = "E-Tax Invoice";
    private String content = "This is a content of this subject.";
    private IndividualTradeProductInstanceModel individualTradeProductInstance;
    private DesignatedProductClassificationModel designatedProductClassification;
    private OriginTradeCountryModel originTradeCountry;
    private IncludedNoteModel informationNote;

    @Before
    public void beforeEachTest() {
        this.individualTradeProductInstance = new IndividualTradeProductInstanceModel.Builder()
                .batchID(this.batchID)
                .expiryDateTime(this.expiryDateTime)
                .build();

        this.designatedProductClassification = new DesignatedProductClassificationModel.Builder()
                .classCode(this.classCode)
                .className(this.className)
                .build();

        this.originTradeCountry = new OriginTradeCountryModel.Builder()
                .id(this.countryID)
                .build();

        this.informationNote = IncludedNoteModel.builder()
                .subject(this.subject)
                .content(this.content)
                .build();
    }

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradeProductModel.Builder builder =  new SpecifiedTradeProductModel.Builder();
        SpecifiedTradeProductModel specifiedTradeProduct = builder
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .description(this.description)
                .individualTradeProductInstance(this.individualTradeProductInstance)
                .designatedProductClassification(this.designatedProductClassification)
                .originTradeCountry(this.originTradeCountry)
                .informationNote(this.informationNote)
                .build();

        assertEquals(this.id, specifiedTradeProduct.id);
        assertEquals(this.globalID, specifiedTradeProduct.globalID);
        assertEquals(this.name, specifiedTradeProduct.name);
        assertEquals(this.description, specifiedTradeProduct.description);
        assertEquals(this.individualTradeProductInstance, specifiedTradeProduct.individualTradeProductInstance);
        assertEquals(this.designatedProductClassification, specifiedTradeProduct.designatedProductClassification);
        assertEquals(this.originTradeCountry, specifiedTradeProduct.originTradeCountry);
        assertEquals(this.informationNote, specifiedTradeProduct.informationNote);
    }
}
