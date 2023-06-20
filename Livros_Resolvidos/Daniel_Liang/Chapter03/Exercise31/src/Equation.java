public class Equation
{
    public double getDelta(double a, double b, double c)
    {
        double delta = Math.pow(b,2.0) - 4*a*c;
        return delta;
    }
    public double getRoot1(double a, double b, double c)
    {
        double aux = Math.pow(b,2.0) - 4*a*c;
        double radix = Math.sqrt(aux);
        double root1 = (-b + radix)/(2*a);

        return root1;
    }
    public double getRoot2(double a, double b, double c)
    {
        double aux = Math.pow(b,2.0) - 4*a*c;
        double radix = Math.sqrt(aux);
        double root2 = (-b - radix)/(2*a);

        return root2;
    }
}
