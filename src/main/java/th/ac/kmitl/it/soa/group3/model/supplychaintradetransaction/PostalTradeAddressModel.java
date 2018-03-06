package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Builder;

@JacksonXmlRootElement(localName = "ram:PostalTradeAddress")
@Builder(builderClassName = "Builder")
public class PostalTradeAddressModel {

    @JacksonXmlProperty(localName = "ram:PostcodeCode")
    public String postCode;

    @JacksonXmlProperty(localName = "ram:BuildingName")
    public String buildingName;

    @JacksonXmlProperty(localName = "ram:LineOne")
    public String houseNumber;

    @JacksonXmlProperty(localName = "ram:LineTwo")
    public String suiteNumber;

    @JacksonXmlProperty(localName = "ram:LineThree")
    public String soi;

    @JacksonXmlProperty(localName = "ram:LineFour")
    public String village;

    @JacksonXmlProperty(localName = "ram:LineFive")
    public String moo;

    @JacksonXmlProperty(localName = "ram:StreetName")
    public String streetName;

    @JacksonXmlProperty(localName = "ram:CityName")
    public String cityName;

    @JacksonXmlProperty(localName = "ram:CitySubDivisionName")
    public String citySubDivisionName;

    @JacksonXmlProperty(localName = "ram:CountryID")
    public String countryID;

    @JacksonXmlProperty(localName = "ram:CountrySubDivisionID")
    public String countrySubDivisionID;

    @JacksonXmlProperty(localName = "ram:BuildingNumber")
    public String buildingNumber;

    public PostalTradeAddressModel() {
    }

    public PostalTradeAddressModel(String postCode,
                                   String buildingName,
                                   String houseNumber,
                                   String suiteNumber,
                                   String soi,
                                   String village,
                                   String moo,
                                   String streetName,
                                   String cityName,
                                   String citySubDivisionName,
                                   String countryID,
                                   String countrySubDivisionID,
                                   String buildingNumber) {
        this.postCode = postCode;
        this.buildingName = buildingName;
        this.houseNumber = houseNumber;
        this.suiteNumber = suiteNumber;
        this.soi = soi;
        this.village = village;
        this.moo = moo;
        this.streetName = streetName;
        this.cityName = cityName;
        this.citySubDivisionName = citySubDivisionName;
        this.countryID = countryID;
        this.countrySubDivisionID = countrySubDivisionID;
        this.buildingNumber = buildingNumber;
    }
}
