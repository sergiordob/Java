public class Polygon
{
    final double PI = 3.14;

    public double getArea(double radius)
    {
        return (radius*radius*PI);
    }

    public double getVolume(double area, double length)
    {
        return(area*length);
    }
}
