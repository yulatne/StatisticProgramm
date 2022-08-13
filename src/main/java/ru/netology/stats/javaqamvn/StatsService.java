package ru.netology.stats.javaqamvn;

public class StatsService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum);

    }

    public long averageSale(long[] sales) {
        return (sumSales(sales) / sales.length);
    }

    public long maxSaleMonth(long[] sales) {
        int max = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > sales[max]) {
                max = (int) i;
            }

        }
        return max + 1;
    }

    public long minSaleMonth(long[] sales) {
        int min = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < sales[min]) {
                min = (int) i;
            }

        }
        return min + 1;
    }

    public int salesUnderAverage(long[] sales) {
        long avg = averageSale(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < avg) {
                count++;
            }

        }
        return count;
    }

    public int salesOverAverage(long[] sales) {
        long avg = averageSale(sales);
        int count = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > avg) {
                count++;
            }

        }
        return count;
    }
}
