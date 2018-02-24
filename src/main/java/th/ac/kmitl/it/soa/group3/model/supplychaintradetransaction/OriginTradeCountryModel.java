package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.omg.CORBA.TypeCode;

public class OriginTradeCountryModel {

    private TypeCode id;

    private OriginTradeCountryModel(Builder builder) {
        this.id = builder.id;
    }

    public TypeCode getId() {
        return id;
    }

    public void setId(TypeCode id) {
        this.id = id;
    }

    public static class Builder {

        private TypeCode id;

        public Builder withID(TypeCode id) {
            this.id = id;
            return this;
        }

        public OriginTradeCountryModel build() {
            return new OriginTradeCountryModel(this);
        }
    }
}
