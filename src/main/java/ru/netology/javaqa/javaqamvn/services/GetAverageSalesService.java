package ru.netology.javaqa.javaqamvn.services;

public class GetAverageSalesService {
    public static int getAverage(int[] sales) {
        int sumSales = 0;
        for (int sum : sales) {
            sumSales += sum;
        }
                int average = sumSales / sales.length;
        return average;
    }
}
