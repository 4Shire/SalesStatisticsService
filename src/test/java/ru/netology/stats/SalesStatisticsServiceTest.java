package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesStatisticsServiceTest {

    @Test
    void shouldCalculateSum() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumMaxMonthPeakInSales() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findNumMaxMonthPeakInSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumMinMonthInSales() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findNumMinMonthInSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthBelowAverageSales() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthBelowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMoreAverageSales() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthMoreAverageSales(sales);

        assertEquals(expected, actual);
    }

}
