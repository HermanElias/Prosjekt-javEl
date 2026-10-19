package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1a");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        /*Test av oppgave 1 a */
        DailyPower.printPowerPrices(powerprices_day);
        if (powerprices_day.length == 24) {
            System.out.println();
            System.out.println("Test godkjent");
        
        }
        else {
            System.out.println();
            System.out.println("Test feilet");
        }
        System.out.println();

        System.out.println("==");
        System.out.println("1b");
        System.out.println("==");
        System.out.println();


        /*1b Test */
        DailyPower.printPowerUsage(powerusage_day);
        
        if (powerusage_day.length == 24) {
            System.out.println();
            System.out.println("Test godkjent");
        
        }
        else {
            System.out.println();
            System.out.println("Test feilet");
        }
        System.out.println();
        
        System.out.println("==");
        System.out.println("1c");
        System.out.println("==");
        System.out.println();

        /*1c test */
        
        
    }
}
