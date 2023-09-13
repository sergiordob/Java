public class Rectangle
{
    double width;
    double height;

    Rectangle()
    {
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    double getArea()
    {
        return (width*height);
    }

    double getPerimeter()
    {
        return (width+width+height+height);
    }
}
