public class Circle
{
    double radius;
    Circle ()
    {
        radius = 1.0;
    }

    Circle(double newRadius)
    {
        radius = newRadius;
    }

    double getArea()
    {
        return radius * radius * Math.PI;
    }

    double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}
