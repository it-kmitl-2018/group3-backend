package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

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
    private Timestamp occurrenceDateTime = new Timestamp(System.currentTimeMillis());

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
    }

    @Test
    public void itShouldGetDateTimeByGetter() {
        ApplicableHeaderTradeDeliveryModel headerTradeDelivery = new ApplicableHeaderTradeDeliveryModel.Builder()
                .shipToTradeParty(this.shipToTradeParty)
                .shipFormTradeParty(this.shipFormTradeParty)
                .actualDeliverySupplyChainEvent(this.deliverySupplyChain)
                .build();

        assertEquals(this.shipToTradeParty, headerTradeDelivery.shipToTradeParty);
        assertEquals(this.shipFormTradeParty, headerTradeDelivery.shipFormTradeParty);
        assertEquals(this.deliverySupplyChain, headerTradeDelivery.actualDeliverySupplyChainEvent);
    }
}
