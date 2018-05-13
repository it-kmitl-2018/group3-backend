package th.ac.kmitl.it.soa.group3.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import th.ac.kmitl.it.soa.group3.converter.ItemJsonConverter;
import th.ac.kmitl.it.soa.group3.converter.TradeEntityJsonConverter;

import java.util.ArrayList;
import java.util.Date;

@Builder(builderClassName = "builder")
public class JsonExportWrapper {

    @JsonProperty("number")
    public String serialNumber;

    @JsonProperty("seller")
    public TradeEntityJsonConverter seller;

    @JsonProperty("buyer")
    public TradeEntityJsonConverter buyer;

    @JsonProperty("transaction_date")
    public String transactionDate;

    @JsonProperty("items")
    public ArrayList<ItemJsonConverter> items;

}
