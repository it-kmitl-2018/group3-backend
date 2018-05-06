package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.GrossPriceProductTradePriceModel;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedLineTradeDeliveryModel;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.SpecifiedTradeProductModel;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.TradeTaxModel;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemJsonConverterTest {

    private String description = "Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้";
    private int quantity = 1;
    private double pricePerItem = 3990000;
    private double vatRate = 0.07;
    private SpecifiedTradeProductModel tradeProduct;
    private GrossPriceProductTradePriceModel grossPriceProduct;
    private SpecifiedLineTradeDeliveryModel lineTradeDelivery;
    private TradeTaxModel tradeTax;
    private ArrayList<ItemJsonConverter> items = new ArrayList<>();

    @Test
    public void itShouldGetCorrectJsonString() throws JsonProcessingException {
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

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(items);
        System.out.println(result);

        assertNotNull(result);
    }
}
