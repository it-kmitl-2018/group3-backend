package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

public class DesignatedProductClassificationModel {

    private String classCode;
    private String className;

    private DesignatedProductClassificationModel(Builder builder) {
        this.classCode = builder.classCode;
        this.className = builder.className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static class Builder {

        private String classCode;
        private String className;

        public Builder withClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }

        public Builder withClassName(String className) {
            this.className = className;
            return this;
        }

        public DesignatedProductClassificationModel build() {
            return new DesignatedProductClassificationModel(this);
        }
    }
}
