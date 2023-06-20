public class Distance
{
    public double getDistance(double x1, double x2, double y1, double y2)
    {
        double x_minus = (x2 - x1)*(x2 - x1);
        double y_minus = (y2 - y1)*(y2 - y1);
        double distance = x_minus + y_minus;
        double IMC = Math.pow(distance,0.5);

        return IMC;
    }
}
