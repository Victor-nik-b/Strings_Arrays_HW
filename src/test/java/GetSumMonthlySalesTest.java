import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.javaqa.javaqamvn.services.GetSumMonthlySales;
// import ru.netology.javaqa.javaqamvn.services.GetAverageSalesService;
import ru.netology.javaqa.javaqamvn.services.*;

public class GetSumMonthlySalesTest {

    String[] monthList = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    int[] salesNumMonthly = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void ShouldGetSumSales() {
        int expected = 180;
        GetSumMonthlySales service = new GetSumMonthlySales();
        int actual = service.getSum(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldGetAverageSalesService() {
        int expected = 15;
        GetAverageSalesService service = new GetAverageSalesService();
        int actual = service.getAverage(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldGetMinSales() {
        int expected = 8;
        GetMinSalesService service = new GetMinSalesService();
        int actual = service.getMinMonth(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldGetMaxMonthSales() {
        int expected = 7;
        GetMaxSalesService service = new GetMaxSalesService();
        int actual = service.getMaxMonth(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldGetMonthsBelowAverageSales() {
        int expected = 5;
        GetBelowAverageService service = new GetBelowAverageService();
        int actual = service.getBelowNum(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldGetMonthsAboveAverageSales() {
        int expected = 5;
        GetAboveAverageService service = new GetAboveAverageService();
        int actual = service.getAboveNum(salesNumMonthly);
        Assertions.assertEquals(expected, actual);
    }

}
