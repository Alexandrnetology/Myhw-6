package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumsales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedsum = 180;
        int actualsum = service.sumSales(sales);

        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    public void averageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSalesAmount = 15;
        int actualAverageSalesAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSalesAmount, actualAverageSalesAmount);
    }

    @Test
    public void monthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmonthmax = 6;
        int actualmonthmax = service.monthMaxSales(sales);

        Assertions.assertEquals(expectedmonthmax, actualmonthmax);
    }

    @Test
    public void monthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmonthmin = 9;
        int actualmonthmin = service.monthMinSales(sales);

        Assertions.assertEquals(expectedmonthmin, actualmonthmin);
    }

    @Test
    public void monthsUnderAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmonthUnderAverage = 5;
        int actualmonthUnderAverage = service.monthsUnderAverageSales(sales);

        Assertions.assertEquals(expectedmonthUnderAverage, actualmonthUnderAverage);

    }

    @Test
    public void monthsOverAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedmonthOverAverage = 5;
        int actualmonthOverAverage = service.monthsOverAverageSales(sales);

        Assertions.assertEquals(expectedmonthOverAverage, actualmonthOverAverage);

    }
}
