public class Imc
{
    public double getIMC(double weight, double height)
    {
        double weight_in_kg = weight*0.45359237;
        double height_in_meters = height*0.0254;

        return (weight_in_kg / Math.pow(height_in_meters,2));
    }
}
