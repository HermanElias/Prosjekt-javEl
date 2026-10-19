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
        
            
        double sum = DailyPower.computePowerUsage(powerusage_day);
        
        if (Math.abs(sum - 27.68) < 0.000001){
            System.out.print(sum + " kWd ");
            System.out.println("test godkjent");
        }

        else {
            System.out.println("Feil i test" + sum);
        }
        System.out.println();
        
        System.out.println("==");
        System.out.println("1d");
        System.out.println("==");
        System.out.println();

/*test 1d */

        double forventet = 0;
        for (int i = 0; i <powerusage_day.length; i++){
            
            forventet += powerusage_day[i] * powerprices_day[i];
        }

        double priser = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        if (Math.abs(priser - forventet) <  0.000001) {
            System.out.println(priser + " NOK dagen ");
            System.out.println("Test godkjent");
            
        }

        else{
            System.out.println("Feil test " + priser);
        }

//TODO - test fra e og videre
    }
        
}

