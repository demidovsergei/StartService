package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }


    public int monthBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }


    public int monthHigherAverage(long[] sales) {
        long averageSale = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}



