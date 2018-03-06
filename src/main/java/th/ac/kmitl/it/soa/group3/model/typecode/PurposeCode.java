package th.ac.kmitl.it.soa.group3.model.typecode;

public enum PurposeCode {

    INCORRECT_NAME("TIVC01", "ชื่อผิด"),
    INCORRECT_ADDRESS("TIVC02", "ที่อยู่ผิด"),
    ANOTHER_PURPOSE("TIVC99", "เหตุอื่น (ระบุสาเหตุ)");

    private String typeCode;
    private String description;

    PurposeCode(String typeCode, String description) {
        this.typeCode = typeCode;
        this.description = description;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getDescription() {
        return description;
    }
}
