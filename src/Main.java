public class Main {
    public static void main ( String[] args ) {

        /*Create all variables to store the data
        //today's temp
        //tomorrow's temp
        //city etc. at least 6 variables*/

        int todaysTemperature = 102;
        int tomorrowsTemperature = 105;
        String location = "Tempe, Arizona";
        String heatWarning = "true";
        int humidity = 10;
        int currentWindMph = 3;

        System.out.println("Weather Report for " + location + ":");
        System.out.println("Heat Warning: " + heatWarning);
        System.out.println("Today's Temperature Is: " + todaysTemperature);
        System.out.println("Tomorrow's Temperature Is: " + tomorrowsTemperature);
        System.out.println("Current Wind MPH Is: " + currentWindMph);
        System.out.println("Humidity Percentage:" + humidity);
    }
}
//This is the weather app!