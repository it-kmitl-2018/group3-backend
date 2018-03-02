package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecifiedTradeSettlementHeaderMonetarySummationModelTest {

    private double originalInformationAmount = 1234.50;
    private double lineTotalAmount = 63050;
    private double differenceSalesInformationAmount = 12345.75;
    private double allowanceTotalAmount = 2500;
    private double chargeTotalAmount = 69.50;
    private double taxBasisTotalAmount = 60550;
    private double taxTotalAmount = 4238.50;
    private double grandTotalAmount = 64788.50;

    @Test
    public void itShouldGetAllInfoByGetter() {
        SpecifiedTradeSettlementHeaderMonetarySummationModel.Builder builder =
                new SpecifiedTradeSettlementHeaderMonetarySummationModel.Builder();
        SpecifiedTradeSettlementHeaderMonetarySummationModel tradeSettlementHeaderModel = builder
                .originalInformationAmount(this.originalInformationAmount)
                .lineTotalAmount(this.lineTotalAmount)
                .differenceSalesInformationAmount(this.differenceSalesInformationAmount)
                .allowanceTotalAmount(this.allowanceTotalAmount)
                .chargeTotalAmount(this.chargeTotalAmount)
                .taxBasisTotalAmount(this.taxBasisTotalAmount)
                .taxTotalAmount(this.taxTotalAmount)
                .grandTotalAmount(this.grandTotalAmount)
                .build();

        assertEquals(this.originalInformationAmount, tradeSettlementHeaderModel.originalInformationAmount);
        assertEquals(this.lineTotalAmount, tradeSettlementHeaderModel.lineTotalAmount);
        assertEquals(this.differenceSalesInformationAmount,
                tradeSettlementHeaderModel.differenceSalesInformationAmount);
        assertEquals(this.allowanceTotalAmount, tradeSettlementHeaderModel.allowanceTotalAmount);
        assertEquals(this.chargeTotalAmount, tradeSettlementHeaderModel.chargeTotalAmount);
        assertEquals(this.taxBasisTotalAmount, tradeSettlementHeaderModel.taxBasisTotalAmount);
        assertEquals(this.taxTotalAmount, tradeSettlementHeaderModel.taxTotalAmount);
        assertEquals(this.grandTotalAmount, tradeSettlementHeaderModel.grandTotalAmount);
    }
}
