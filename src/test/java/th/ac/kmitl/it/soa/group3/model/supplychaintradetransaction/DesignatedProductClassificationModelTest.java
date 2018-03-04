package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignatedProductClassificationModelTest {

    private String classCode = "TE2031";
    private String className = "Test Expression 2031";

    @Test
    public void itShouldGetAllInfoByGetter() {
        DesignatedProductClassificationModel.Builder builder = DesignatedProductClassificationModel.builder();
        DesignatedProductClassificationModel productClassificationModel = builder
                .classCode(this.classCode)
                .className(this.className)
                .build();

        assertEquals(this.classCode, productClassificationModel.classCode);
        assertEquals(this.className, productClassificationModel.className);
    }
}
