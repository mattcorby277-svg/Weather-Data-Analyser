import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        //Create a list of readings
        List<WeatherReading> readings = new ArrayList<>();
        readings.add(new WeatherReading(12.5, "2026-08-01"));
        readings.add(new WeatherReading(14.0, "2026-08-02"));
        readings.add(new WeatherReading(15.2, "2026-08-03"));
        readings.add(new WeatherReading(16.8, "2026-08-04"));
        readings.add(new WeatherReading(18.1, "2026-08-05"));

        

        //Create analyser
        WeatherAnalyser analyser = new WeatherAnalyser();

        analyser.printReport(readings);
    }
}