package th.ac.kmitl.it.soa.group3.mock;

import th.ac.kmitl.it.soa.group3.converter.ItemJsonConverter;
import th.ac.kmitl.it.soa.group3.converter.JsonExportConverter;
import th.ac.kmitl.it.soa.group3.converter.TradeEntityJsonConverter;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.*;

import java.util.ArrayList;

public class JsonExportConverterMock {

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
    private TradePartyModel testEntity;

    private String description = "Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้";
    private int quantity = 1;
    private double pricePerItem = 3990000;
    private double vatRate = 0.07;
    private SpecifiedTradeProductModel tradeProduct;
    private GrossPriceProductTradePriceModel grossPriceProduct;
    private SpecifiedLineTradeDeliveryModel lineTradeDelivery;
    private TradeTaxModel tradeTax;
    private ArrayList<ItemJsonConverter> items = new ArrayList<>();

    public JsonExportConverter getJsonExportConverterMock() {
        this.specifiedTaxRegistration = SpecifiedTaxRegistrationModel.builder()
                .id(this.taxID)
                .build();

        this.emailUriUniversal = EmailUriUniversalCommunicationModel.builder()
                .uriID(this.email)
                .build();

        this.telephoneUniversal = TelephoneUniversalCommunicationModel.builder()
                .phoneNumber(this.phoneNo)
                .build();

        this.definedTradeContact = DefinedTradeContactModel.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .emailUriUniversalCommunicationModel(this.emailUriUniversal)
                .telephoneUniversalCommunicationModel(this.telephoneUniversal)
                .build();

        this.postalTradeAddress = PostalTradeAddressModel.builder()
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

        TradePartyModel.Builder builder = TradePartyModel.builder();
        this.testEntity = builder
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .specifiedTaxRegistration(this.specifiedTaxRegistration)
                .definedTradeContact(this.definedTradeContact)
                .postalTradeAddress(this.postalTradeAddress)
                .build();

        TradeEntityJsonConverter sellerJsonConverter = new TradeEntityJsonConverter(testEntity);
        TradeEntityJsonConverter buyerJsonConverter = new TradeEntityJsonConverter(testEntity);

        this.tradeProduct = SpecifiedTradeProductModel.builder()
                .description(this.description)
                .build();

        this.grossPriceProduct = GrossPriceProductTradePriceModel.builder()
                .chargeAmount(this.pricePerItem)
                .build();

        this.lineTradeDelivery = SpecifiedLineTradeDeliveryModel.builder()
                .billedQuantity(this.quantity)
                .build();

        this.tradeTax = TradeTaxModel.builder()
                .calculatedRate(this.vatRate)
                .build();

        ItemJsonConverter itemJsonConverter = new ItemJsonConverter(this.tradeProduct,
                this.grossPriceProduct,
                this.lineTradeDelivery,
                this.tradeTax);

        items.add(itemJsonConverter);


        JsonExportConverter jsonExportConverter = JsonExportConverter.builder()
                .buyer(buyerJsonConverter)
                .seller(sellerJsonConverter)
                .serialNumber("AEFF15745")
                .transactionDate("2018-04-01 12:12:12")
                .items(items)
                .build();

        return jsonExportConverter;
    }
}
