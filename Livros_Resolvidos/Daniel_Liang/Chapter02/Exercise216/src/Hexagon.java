public class Hexagon
{
    double getArea(double length)
    {
        double number = 3;
        double numerator = 3*Math.sqrt(number);
        double s_squared = length*length;
        double area = 0.5*(numerator*s_squared);

        return (area);
    }
}
