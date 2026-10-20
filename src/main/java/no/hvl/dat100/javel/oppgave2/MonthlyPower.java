package no.hvl.dat100.javel.oppgave2;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        
for (int day = 0; day < usage.length; day++) {

    System.out.print("Day " + (day + 1) + ": ");

    for (int hour = 0; hour < usage[day].length; hour++) {

        System.out.printf("%.2f kWh ", usage[day][hour]);

    }

    System.out.println();
}


    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        
for (int day = 0; day < prices.length; day++) {

    System.out.print("Day " + (day + 1) + ": ");

    for (int hour = 0; hour < prices[day].length; hour++) {

        System.out.printf("%.2f kr ", prices[day][hour]);

    }

    System.out.println();
}


    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        
for (int day = 0; day < usage.length; day++) {

    for (int hour = 0; hour < usage[day].length; hour++) {

        sum += usage[day][hour];

    }
}


        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        
int day = 0;

while (day < powerusage.length && !exceeded) {

    int hour = 0;

    while (hour < powerusage[day].length && !exceeded) {

        usage += powerusage[day][hour];

        if (usage > threshold) {
            exceeded = true;
        }

        hour++;
    }

    day++;
}


        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        
for (int day = 0; day < usage.length; day++) {

    for (int hour = 0; hour < usage[day].length; hour++) {

        price += usage[day][hour] * prices[day][hour];

    }
}


        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        
for (int day = 0; day < usage.length; day++) {

    for (int hour = 0; hour < usage[day].length; hour++) {

        if (prices[day][hour] > 0.9375) {

            support += usage[day][hour]
                    * (prices[day][hour] - 0.9375)
                    * 0.90;

        }
    }
}


        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        
for (double[] day : usage) {

    for (double hour : day) {

        price += hour * 0.50;

    }
}


        return price;
    }
}
