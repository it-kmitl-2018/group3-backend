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
}
