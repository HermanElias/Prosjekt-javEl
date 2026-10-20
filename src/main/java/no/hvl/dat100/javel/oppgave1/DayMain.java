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
            System.out.printf("%.2f kWd%n", sum);
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
            System.out.printf("%.2f NOK%n" , priser);
            System.out.println("Test godkjent");
            
        }

        else{
            System.out.println("Feil test " + priser);
        }
        
        System.out.println();
        
        System.out.println("==");
        System.out.println("1e");
        System.out.println("==");
        System.out.println();


/*test 1e tester med en ferdigsatt mindre siiden metoden er privat og ikke kan kalles fra DayMain*/
/*test av en time */
        double[] testbruk = {2.0};
        double[] testpris = {1.0};

        double resultat = DailyPower.computePowerSupport(testbruk, testpris);

        double timehjelp = 0.1125;

        if (Math.abs(resultat - timehjelp)< 0.000001) {
            System.out.println("Test godkjent");

        }
        else {
            System.out.print("Test feil");
        }
        System.out.printf("Støtte for time: %.2f NOK%n", resultat);

        System.out.println();
        
        System.out.println("==");
        System.out.println("1f");
        System.out.println("==");
        System.out.println();

/*test 1f */


        double support = DailyPower.computePowerSupport(DayPowerData.powerusage_day, DayPowerData.powerprices_day);

        System.out.printf("Strømstøtte blir for dagen blir %.2f NOK%n" , support);
        
        double forventethjelp = 0;
        for (int i = 0; i < DayPowerData.powerusage_day.length; i++){
            double usage = DayPowerData.powerusage_day[i];
            double price = DayPowerData.powerprices_day[i];
            if (price > 0.9375){
                forventethjelp += (price - 0.9375) * usage * 0.9;
            }
        }
        System.out.printf("Forventet støtte: %.2f NOK%n", forventethjelp);
        if (Math.abs(support - forventethjelp) < 0.000001) {
            System.out.println("Test godkjent");
            
        }
        else {
            System.out.println("Test feil");
        }


        System.out.println();
        
        System.out.println("==");
        System.out.println("1g");
        System.out.println("==");
        System.out.println();

/*test 1g */

        double norgespris = DailyPower.computeNorgesPrice(DayPowerData.powerusage_day);
        System.out.printf("Norgespris for dagen blir %.2f NOK%n", norgespris);

/* test av g med tall som i e */
        double[] testnorgespris = {2.0, 1.0};
        double norgesresultat = DailyPower.computeNorgesPrice(testnorgespris);


        if (Math.abs(1.5 - norgesresultat)< 0.000001)/*bruker 0.000001 for å gi resultatet noe toleranse */ {
            System.out.println("Test godkjent");

        }
        else {
            System.out.print("Test feil");
        }
        System.out.printf("norgespris eksempel: %.2f NOK%n", norgesresultat);


        System.out.println();
        
        System.out.println("==");
        System.out.println("1h");
        System.out.println("==");
        System.out.println();


/*test 1h */


        double testpeak = DailyPower.findPeakUsage(powerusage_day);

        double forventetpeak = 2.78;
        System.out.printf("Største forbruk %.2f kWh%n", testpeak);
        if (Math.abs(testpeak - forventetpeak)< 0.00001) {
            System.out.println("Test godkjent");
        }
        else {
            System.out.println("Test feilet");
        }


System.out.println();
        
        System.out.println("==");
        System.out.println("1i");
        System.out.println("==");
        System.out.println();


/*test 1i */

        double gjennomsnitt = DailyPower.findAvgPower(powerusage_day);
        
        System.out.println("Nøyaktig gjennomsnitt: " + gjennomsnitt);

        double forventetsnitt = 27.68/24; 
        /* stjeler tallet for sum fra 1c */
        System.out.printf("snitt forbruk %.2f kWh%n", gjennomsnitt);
        if (Math.abs(gjennomsnitt - forventetsnitt)< 0.00001) {
            System.out.println("Test godkjent");
        }
        else {
            System.out.println("Test feilet");
        }



    }
        
}

