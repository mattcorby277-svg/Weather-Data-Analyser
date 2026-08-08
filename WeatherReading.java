public class WeatherReading{

    //fields
    private double temperature;
    private String date;

    //Constructor
    public WeatherReading(double temperature, String date ){
        this.temperature= temperature;
        this.date= date;

    }

    //Getters
    public double getTemperature(){

        return temperature;
    }

    public String getDate(){

        return date;
    }

    //toString()
    @Override
    public String toString(){
        return date + ": " + temperature + "°C";

    }

}