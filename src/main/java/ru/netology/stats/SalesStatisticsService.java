package ru.netology.stats;

public class SalesStatisticsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findNumMaxMonthPeakInSales(int[] sales) {
        int numMaxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[numMaxMonth]) {
                numMaxMonth = month;
            }
            month += 1;
        }
        return numMaxMonth + 1;
    }

    public int findNumMinMonthInSales(int[] sales) {
        int numMinMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[numMinMonth]) {
                numMinMonth = month;
            }
            month += 1;
        }
        return numMinMonth + 1;
    }

    public int countMonthBelowAverageSales(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)) {
                count++;
            }
        }
        return count;
    }

    public int countMonthMoreAverageSales(int[] sales) {
        int count = 0;
        for (int sale : sales) {
            if (sale > calculateAverage(sales)) {
                count++;
            }
        }
        return count;
    }
}



