package th.ac.kmitl.it.soa.group3.converter;

import com.fasterxml.jackson.annotation.JsonProperty;
import th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction.*;

public class ItemJsonConverter {

    @JsonProperty("description")
    private String description;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price_per_item")
    private double pricePerItem;

    @JsonProperty("have_vat")
    private boolean haveVat;

    @JsonProperty("vat_rate")
    private double vatRate;

    public ItemJsonConverter(SpecifiedTradeProductModel specifiedTradeProduct,
                             GrossPriceProductTradePriceModel grossPriceProductTradePrice,
                             SpecifiedLineTradeDeliveryModel specifiedLineTradeDelivery,
                             TradeTaxModel tradeTax) {
        this.description = specifiedTradeProduct.description;
        this.quantity = specifiedLineTradeDelivery.billedQuantity;
        this.pricePerItem = grossPriceProductTradePrice.chargeAmount;
        this.vatRate = tradeTax.calculatedRate;
        if (this.vatRate == 0) {
            this.haveVat = false;
        } else {
            this.haveVat = true;
        }
    }
}
