package br.com.classes;

public class WeatherStation {
    private double temperature;
    private double pressure;

    public WeatherStation(){
        this.temperature = 0;
        this.pressure = 1.0;
    }

    public WeatherStation(double temperature, double pressure){
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static void imperialConversion(WeatherStation weatherStation){
        weatherStation.temperature = ((weatherStation.temperature - 32) * (5)) / 9;
        weatherStation.pressure = 14.5038 * weatherStation.pressure;
    }

    double getImperialConversionTemperature(){
        return weatherStation.temperature;
    }


    double getTemperature(){
        return temperature;
    }

    double getPressure(){
        return pressure;
    }

}
