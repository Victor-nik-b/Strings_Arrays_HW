package ru.netology.javaqa.javaqamvn.services;

public class GetAboveAverageService {
    public static int getAboveNum(int[] sales) {
        int sumSales = 0;
        for (int sum : sales) {
            sumSales += sum;
        }
        int num = 12;
        int average = sumSales / num;

        int aboveCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveCount++;
            }
        }
        return aboveCount;
    }
}
