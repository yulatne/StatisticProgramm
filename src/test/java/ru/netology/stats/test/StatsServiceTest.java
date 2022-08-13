package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.javaqamvn.StatsService;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumSalesTest() {

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSaleTest() {

        long expected = 15;
        long actual = service.averageSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSaleMonthTest() {

        long expected = 6;
        long actual = service.maxSaleMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSaleMonthTest() {

        long expected = 9;
        long actual = service.minSaleMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesUnderAverageTest() {

        long expected = 5;
        long actual = service.salesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesOverAverageTest() {

        long expected = 5;
        long actual = service.salesOverAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
