public class Index
{
    double getWindChill(double temperature, double wind_speed)
    {
        double wind_speed_after_pow = Math.pow(wind_speed, 0.16);
        double result = (35.74) + (0.6215*temperature) - (35.75*wind_speed_after_pow) + (0.4275*temperature*wind_speed_after_pow);

        return result;
    }
}
