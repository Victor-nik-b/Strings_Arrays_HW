package ru.netology.javaqa.javaqamvn.services;

public class GetMinSalesService {

    public static int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }
}
