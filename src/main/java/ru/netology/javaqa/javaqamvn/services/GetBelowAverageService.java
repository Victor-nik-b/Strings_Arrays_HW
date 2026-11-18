package ru.netology.javaqa.javaqamvn.services;

public class GetBelowAverageService {
    public static int getBelowNum(int[] sales) {
        int sumSales = 0;
        for (int sum : sales) {
            sumSales += sum;
        }
        int num = 12;
        int average = sumSales / num;

        int belowCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowCount++;
            }
        }
        return belowCount;
    }
}
