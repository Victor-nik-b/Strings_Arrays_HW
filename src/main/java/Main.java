import ru.netology.javaqa.javaqamvn.services.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // сумму всех продаж;
        // среднюю сумму продаж в месяц;
        // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
        // количество месяцев, в которых продажи были ниже среднего (см. п.2);
        // количество месяцев, в которых продажи были выше среднего (см. п.2).
        //
        // *Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.
        System.out.println("Data to analyze>");
        String[] monthList = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] salesNumMonthly = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(Arrays.toString(monthList));
        System.out.println(Arrays.toString(salesNumMonthly));

        GetSumMonthlySales sum = new GetSumMonthlySales();
        int sumSalesMonthly = GetSumMonthlySales.getSum(salesNumMonthly);
        System.out.println("1. Sum of monthly sales: " + sumSalesMonthly);

        GetAverageSalesService average = new GetAverageSalesService();
        int salesAverage = GetAverageSalesService.getAverage(salesNumMonthly);
        System.out.println("2. Monthly sales average: " + salesAverage);

        GetMinSalesService minimum = new GetMinSalesService();
        int minMonthNum = GetMinSalesService.getMinMonth(salesNumMonthly);
        System.out.println("3. Last month of lowest sales: " + monthList[minMonthNum]);

        GetMaxSalesService maximum = new GetMaxSalesService();
        int maxMonthNum = GetMaxSalesService.getMaxMonth(salesNumMonthly);
        System.out.println("4. Last month of highest sales: " + monthList[maxMonthNum]);

        GetBelowAverageService below = new GetBelowAverageService();
        int countBelow = GetBelowAverageService.getBelowNum(salesNumMonthly);
        System.out.println("5. Number of months below average: " + countBelow);

        GetAboveAverageService above = new GetAboveAverageService();
        int countAbove = GetAboveAverageService.getAboveNum(salesNumMonthly);
        System.out.println("5. Number of months above average: " + countAbove);
    }
}
