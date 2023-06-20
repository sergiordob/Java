public class Triangle
{
    public double getArea(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        double rooting_side_one = ((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
        double side_one = Math.sqrt(rooting_side_one);
        double rooting_side_two = ((x3 - x2)*(x3 - x2) + (y3-y2)*(y3-y2));
        double side_two = Math.sqrt(rooting_side_two);
        double rooting_side_three = ((x3 - x1)*(x3 - x1) + (y3-y1)*(y3-y1));
        double side_three = Math.sqrt(rooting_side_three);
        double side = (side_one + side_two + side_three)/2;
        double rooting_side = side*(side-side_one)*(side-side_two)*(side-side_three);
        double area = Math.sqrt(rooting_side);

        return area;
    }
}
