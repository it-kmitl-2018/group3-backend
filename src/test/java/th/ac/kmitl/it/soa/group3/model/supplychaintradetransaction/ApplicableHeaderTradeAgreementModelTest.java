package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Before;
import org.junit.Test;
import java.sql.Timestamp;
import th.ac.kmitl.it.soa.group3.model.TypeCode;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicableHeaderTradeAgreementModelTest {

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
    private TradePartyModel sellerTradeParty;
    private TradePartyModel buyerTradeParty;
    private TradeDeliveryTermsModel tradeDeliveryTerms;
    private BuyerOrderReferencedReferencedDocumentModel buyerOrderRefDoc;
    private BuyerOrderReferencedReferencedDocumentModel additionalRefDoc;
    private String deliveryTypeCode = "DDP";
    private String issueAssignedID = "ABC1254";
    private Timestamp issueDateTime = new Timestamp(1526199902438l);
    private TypeCode referenceTypeCode = TypeCode.RECEIPT;
    private ApplicableHeaderTradeAgreementModel headerTradeAgreement;
    private String expectedXML = "<rsm:ApplicableHeaderTradeAgreement>" +
            "<ram:SellerTradeParty>" +
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
            "</ram:SellerTradeParty>" +
            "<ram:BuyerTradeParty>" +
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
            "</ram:BuyerTradeParty>" +
            "<ram:ApplicableTradeDeliveryTerms/>" +
            "<ram:BuyerOrderReferencedReferencedDocument>" +
            "<ram:IssuerAssignedID>ABC1254</ram:IssuerAssignedID>" +
            "<ram:IssueDateTime>1526199902438</ram:IssueDateTime>" +
            "<ram:ReferenceTypeCode>RECEIPT</ram:ReferenceTypeCode>" +
            "</ram:BuyerOrderReferencedReferencedDocument>" +
            "<ram:AdditionalReferencedDocument>" +
            "<ram:IssuerAssignedID>ABC1254</ram:IssuerAssignedID>" +
            "<ram:IssueDateTime>1526199902438</ram:IssueDateTime>" +
            "<ram:ReferenceTypeCode>RECEIPT</ram:ReferenceTypeCode>" +
            "</ram:AdditionalReferencedDocument>" +
            "</rsm:ApplicableHeaderTradeAgreement>";

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

        this.sellerTradeParty = new TradePartyModel.Builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        this.buyerTradeParty = new TradePartyModel.Builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        this.tradeDeliveryTerms = new TradeDeliveryTermsModel.Builder()
                .deliveryTypeCode(this.deliveryTypeCode)
                .build();

        this.buyerOrderRefDoc = new BuyerOrderReferencedReferencedDocumentModel.Builder()
                .issueAssignedID(this.issueAssignedID)
                .issueDateTime(this.issueDateTime)
                .referenceTypeCode(this.referenceTypeCode)
                .build();

        this.additionalRefDoc = new BuyerOrderReferencedReferencedDocumentModel.Builder()
                .issueAssignedID(this.issueAssignedID)
                .issueDateTime(this.issueDateTime)
                .referenceTypeCode(this.referenceTypeCode)
                .build();

        this.headerTradeAgreement = new ApplicableHeaderTradeAgreementModel.Builder()
                .buyerTradeParty(this.buyerTradeParty)
                .sellerTradeParty(this.sellerTradeParty)
                .buyerOrderReferencedReferencedDocument(this.buyerOrderRefDoc)
                .additionalReferencedDocument(this.additionalRefDoc)
                .build();
    }

    @Test
    public void itShouldGetAllInfoByGetter() {
        assertEquals(this.buyerTradeParty, this.headerTradeAgreement.buyerTradeParty);
        assertEquals(this.sellerTradeParty, this.headerTradeAgreement.sellerTradeParty);
        assertEquals(this.buyerOrderRefDoc, this.headerTradeAgreement.buyerOrderReferencedReferencedDocument);
        assertEquals(this.additionalRefDoc, this.headerTradeAgreement.additionalReferencedDocument);
    }

    @Test
    public void itShouldGetXMLString() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(this.headerTradeAgreement);

        assertEquals(this.expectedXML, xml);
    }
}
