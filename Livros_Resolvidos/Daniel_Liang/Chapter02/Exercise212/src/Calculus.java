public class Calculus
{
    double length;
    public double getLength(double speed, double acceleration)
    {
        length = ( (Math.pow(speed,2)) / (2*acceleration) );
        return length;
    }
}
