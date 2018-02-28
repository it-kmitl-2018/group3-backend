package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class PostalTradeAddressModel {

    public String postCode;
    public String buildingName;
    public String houseNumber;
    public String suiteNumber;
    public String soi;
    public String village;
    public String moo;
    public String streetName;
    public String cityName;
    public String citySubDivisionName;
    public String countryID;
    public String countrySubDivisionID;
    public String buildingNumber;
}
