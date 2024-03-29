package ru.netology.stats;


import java.util.Arrays;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumsales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumsales = sumsales + sales[i];
        }
        return sumsales;
    }

    public int averageSalesAmount(int[] sales) {
        int averageSalesAmount = 0;
        averageSalesAmount = sumSales(sales) / (sales.length);
        return averageSalesAmount;
    }

    public int monthMaxSales(int[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int monthMinSales(int[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int monthsUnderAverageSales(int[] sales) {
        int monthsUnderAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesAmount(sales)) {
                monthsUnderAverageSales++;
            }
        }
        return monthsUnderAverageSales;
    }

    public int monthsOverAverageSales(int[] sales) {
        int monthsOverAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesAmount(sales)) {
                monthsOverAverageSales++;
            }
        }
        return monthsOverAverageSales;
    }
}

