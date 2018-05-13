package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicableHeaderTradeDeliveryModelTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String name = "บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด";
    private String taxID = "123456789012300000";
    private String personName = "Alice";
    private String departmentName = "Accounting";
    private String email = "example@mail.com";
    private String phoneNo = "(+66) 89-1234567";
    private String postCode = "10250";
    private String buildingName = "PrachasukCondoTown";
    private String houseNumber = "99/2546";
    private String suiteNumber = "Room 828 8th Floor";
    private String soi = "Nakkeeralamthong";
    private String village = "Nakkeera";
    private String moo = "16";
    private String streetName = "Krungthepkritha";
    private String cityName = "Sapansoong";
    private String citySubDivisionName = "Sapansoong";
    private String countryID = "TH";
    private String countrySubDivisionID = "10";
    private String buildingNumber = "3/34";
    private SpecifiedTaxRegistrationModel specifiedTaxRegistration;
    private DefinedTradeContactModel definedTradeContact;
    private PostalTradeAddressModel postalTradeAddress;
    private EmailUriUniversalCommunicationModel emailUriUniversal;
    private TelephoneUniversalCommunicationModel telephoneUniversal;
    private TradePartyModel shipToTradeParty;
    private TradePartyModel shipFormTradeParty;
    private ActualDeliverySupplyChainEventModel deliverySupplyChain;
    private Timestamp occurrenceDateTime = new Timestamp(1526201421814l);
    private ApplicableHeaderTradeDeliveryModel headerTradeDelivery;
    private String expectedXML = "<rsm:ApplicableHeaderTradeDelivery>" +
            "<ram:ShipToTradeParty>" +
            "<ram:ID>ABCDEFGHIJKLMNOPQRST123456789012345</ram:ID>" +
            "<ram:GlobalID>ABCDEFGHIJKLMNOPQRST123456789012345</ram:GlobalID>" +
            "<ram:Name>บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด</ram:Name>" +
            "<ram:SpecifiedTaxRegistration>" +
            "<ram:ID>123456789012300000</ram:ID>" +
            "</ram:SpecifiedTaxRegistration>" +
            "<ram:DefinedTradeContact>" +
            "<personName>Alice</personName>" +
            "<departmentName>Accounting</departmentName>" +
            "<emailUriUniversalCommunicationModel>" +
            "<uriID>example@mail.com</uriID>" +
            "</emailUriUniversalCommunicationModel>" +
            "<telephoneUniversalCommunicationModel>" +
            "<phoneNumber>(+66) 89-1234567</phoneNumber>" +
            "</telephoneUniversalCommunicationModel>" +
            "</ram:DefinedTradeContact>" +
            "<ram:PostalTradeAddress>" +
            "<ram:PostcodeCode>10250</ram:PostcodeCode>" +
            "<ram:BuildingName>PrachasukCondoTown</ram:BuildingName>" +
            "<ram:LineOne>99/2546</ram:LineOne>" +
            "<ram:LineTwo>Room 828 8th Floor</ram:LineTwo>" +
            "<ram:LineThree>Nakkeeralamthong</ram:LineThree>" +
            "<ram:LineFour>Nakkeera</ram:LineFour>" +
            "<ram:LineFive>16</ram:LineFive>" +
            "<ram:StreetName>Krungthepkritha</ram:StreetName>" +
            "<ram:CityName>Sapansoong</ram:CityName>" +
            "<ram:CitySubDivisionName>Sapansoong</ram:CitySubDivisionName>" +
            "<ram:CountryID>TH</ram:CountryID>" +
            "<ram:CountrySubDivisionID>10</ram:CountrySubDivisionID>" +
            "<ram:BuildingNumber>3/34</ram:BuildingNumber>" +
            "</ram:PostalTradeAddress>" +
            "</ram:ShipToTradeParty>" +
            "<ram:ShipFromTradePartys>" +
            "<ram:ID>ABCDEFGHIJKLMNOPQRST123456789012345</ram:ID>" +
            "<ram:GlobalID>ABCDEFGHIJKLMNOPQRST123456789012345</ram:GlobalID>" +
            "<ram:Name>บริษัทร่วมสมยัธุรกรรมอิเล็กทรอนิกส์จำกัด</ram:Name>" +
            "<ram:SpecifiedTaxRegistration>" +
            "<ram:ID>123456789012300000</ram:ID>" +
            "</ram:SpecifiedTaxRegistration>" +
            "<ram:DefinedTradeContact>" +
            "<personName>Alice</personName>" +
            "<departmentName>Accounting</departmentName>" +
            "<emailUriUniversalCommunicationModel>" +
            "<uriID>example@mail.com</uriID>" +
            "</emailUriUniversalCommunicationModel>" +
            "<telephoneUniversalCommunicationModel>" +
            "<phoneNumber>(+66) 89-1234567</phoneNumber>" +
            "</telephoneUniversalCommunicationModel>" +
            "</ram:DefinedTradeContact>" +
            "<ram:PostalTradeAddress>" +
            "<ram:PostcodeCode>10250</ram:PostcodeCode>" +
            "<ram:BuildingName>PrachasukCondoTown</ram:BuildingName>" +
            "<ram:LineOne>99/2546</ram:LineOne>" +
            "<ram:LineTwo>Room 828 8th Floor</ram:LineTwo>" +
            "<ram:LineThree>Nakkeeralamthong</ram:LineThree>" +
            "<ram:LineFour>Nakkeera</ram:LineFour>" +
            "<ram:LineFive>16</ram:LineFive>" +
            "<ram:StreetName>Krungthepkritha</ram:StreetName>" +
            "<ram:CityName>Sapansoong</ram:CityName>" +
            "<ram:CitySubDivisionName>Sapansoong</ram:CitySubDivisionName>" +
            "<ram:CountryID>TH</ram:CountryID>" +
            "<ram:CountrySubDivisionID>10</ram:CountrySubDivisionID>" +
            "<ram:BuildingNumber>3/34</ram:BuildingNumber>" +
            "</ram:PostalTradeAddress>" +
            "</ram:ShipFromTradePartys>" +
            "<ram:ActualDeliverySupplyChainEvent>" +
            "<ram:OccurrenceDateTime>1526201421814</ram:OccurrenceDateTime>" +
            "</ram:ActualDeliverySupplyChainEvent>" +
            "</rsm:ApplicableHeaderTradeDelivery>";

    @Before
    public void beforeEachTest() {
        this.specifiedTaxRegistration = new SpecifiedTaxRegistrationModel.Builder()
                .id(this.taxID)
                .build();

        this.emailUriUniversal = new EmailUriUniversalCommunicationModel.Builder()
                .uriID(this.email)
                .build();

        this.telephoneUniversal = new TelephoneUniversalCommunicationModel.Builder()
                .phoneNumber(this.phoneNo)
                .build();

        this.definedTradeContact = new DefinedTradeContactModel.Builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .emailUriUniversalCommunicationModel(this.emailUriUniversal)
                .telephoneUniversalCommunicationModel(this.telephoneUniversal)
                .build();

        this.postalTradeAddress = new PostalTradeAddressModel.Builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .houseNumber(this.houseNumber)
                .suiteNumber(this.suiteNumber)
                .soi(this.soi)
                .village(this.village)
                .moo(this.moo)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryID(this.countryID)
                .countrySubDivisionID(this.countrySubDivisionID)
                .buildingNumber(this.buildingNumber)
                .build();

        this.shipToTradeParty = new TradePartyModel.Builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        this.shipFormTradeParty = new TradePartyModel.Builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        this.deliverySupplyChain = new ActualDeliverySupplyChainEventModel.Builder()
                .occurrenceDateTime(this.occurrenceDateTime)
                .build();

        this.headerTradeDelivery = new ApplicableHeaderTradeDeliveryModel.Builder()
                .shipToTradeParty(this.shipToTradeParty)
                .shipFormTradeParty(this.shipFormTradeParty)
                .actualDeliverySupplyChainEvent(this.deliverySupplyChain)
                .build();
    }

    @Test
    public void itShouldGetDateTimeByGetter() {
        assertEquals(this.shipToTradeParty, this.headerTradeDelivery.shipToTradeParty);
        assertEquals(this.shipFormTradeParty, this.headerTradeDelivery.shipFormTradeParty);
        assertEquals(this.deliverySupplyChain, this.headerTradeDelivery.actualDeliverySupplyChainEvent);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.headerTradeDelivery);

        assertEquals(this.expectedXML, xml);
    }
}
