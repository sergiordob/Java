public class Calculus
{
    public double getEnergy(double amount_of_water, double initial_temperature, double final_temperature)
    {
        return (amount_of_water*(final_temperature - initial_temperature)*4184);
    }
}
