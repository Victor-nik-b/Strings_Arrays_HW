package ru.netology.javaqa.javaqamvn.services;

public class GetSumMonthlySales {
    public static int getSum(int[] sales) {
        int sumSales = 0;
        for (int sum : sales) {
            sumSales += sum;
        }
        return sumSales;
    }
}
