import java.util.List;

public class WeatherAnalyser {

    //Minimum temperature
    public double minTemp(List<WeatherReading> readings){
        double min = readings.get(0).getTemperature();
        for(WeatherReading r : readings){
            if(r.getTemperature() < min){
                min=r.getTemperature();
            }
        }

        return min;
    }

    //Maximum temperature
    public double maxTemp(List<WeatherReading> readings){
        double max = readings.get(0).getTemperature();
        for(WeatherReading r : readings){
            if(r.getTemperature() > max){
                max= r.getTemperature();
            }
        }

        return max;
    }

    //Average temperature
    public double averageTemp(List<WeatherReading> readings){
        double sum=0;
        for(WeatherReading r : readings){
            sum += r.getTemperature();
        }


        return sum/readings.size();
    }

    //Detect trend (rising, falling, stable)
    public Trend detectTrend(List<WeatherReading> readings){
        double first = readings.get(0).getTemperature();
        double last = readings.get(readings.size()-1).getTemperature();

        if(last > first) return Trend.RISING;
        if(last < first) return Trend.FALLING;
        return Trend.STABLE;
    }

    //Detect heatwave (3+ days above threshold)
    public boolean heatwave(List<WeatherReading> readings){
        int count =0;
        for(WeatherReading r : readings){
            if(r.getTemperature() >=25){
                count++;
                if (count >=3) return true;
            } else{
                count =0;
            }

        }

        return false;
    }

    //Detect cold spell
    public boolean coldSpell(List<WeatherReading> readings){
        int count=0;
        for(WeatherReading r : readings){
            if (r.getTemperature() <=0){
                count++;
                if(count >=3) return true;
            } else {
                count = 0;
            }
        }
        return false;
    }

    //Print a full report
    public void printReport (List <WeatherReading> readings){
    System.out.println("=== Weather Report ===");
    System.out.println("Min Temp: " + minTemp(readings));
    System.out.println("Max Temp: " + maxTemp(readings));
    System.out.println("Average Temp: " + averageTemp(readings));
    System.out.println("Trend: " + detectTrend(readings));
    System.out.println("Heatwave: " + heatwave(readings));
    System.out.println("Cold Spell: " + coldSpell(readings));
    }
}