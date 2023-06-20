public class Calculus
{
    double getGratuity(double subtotal, double gratuity_rate)
    {
        double gratuity = (subtotal*gratuity_rate)/100;
        return gratuity;
    }

    double getTotal(double subtotal, double gratuity_rate)
    {
        double total = (subtotal*gratuity_rate)/100 + subtotal;
        return total;
    }
}
