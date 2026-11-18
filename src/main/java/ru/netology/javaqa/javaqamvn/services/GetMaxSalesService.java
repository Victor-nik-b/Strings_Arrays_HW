package ru.netology.javaqa.javaqamvn.services;

public class GetMaxSalesService {

    public static int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;

    }
}
