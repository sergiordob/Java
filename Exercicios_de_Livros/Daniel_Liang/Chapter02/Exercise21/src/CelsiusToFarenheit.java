public class CelsiusToFarenheit
{
    private double TemperatureInFarenheit;
    public double getFarenheit(double TemperatureInCelsius)
    {
        TemperatureInFarenheit = ( (9.0/5.0) * TemperatureInCelsius + 32.0 );
        return (TemperatureInFarenheit);
    }
}
