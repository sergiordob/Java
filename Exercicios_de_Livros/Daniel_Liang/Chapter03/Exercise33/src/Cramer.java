public class Cramer
{
    static public double getDeterminant(double a, double b, double c, double d, double e, double f)
    {
       double determinant = (a*d - b*c);
       return determinant;
    }

    static public double getFirstVariable(double a, double b, double c, double d, double e, double f)
    {
        double determinant = (a*d - b*c);
        double determinantX = (e*d - b*f);
        return determinantX/determinant;
    }

    static public double getSecondVariable(double a, double b, double c, double d, double e, double f)
    {
        double determinant = (a*d - b*c);
        double determinantY = (a*f - c*e);
        return determinantY/determinant;
    }
}
