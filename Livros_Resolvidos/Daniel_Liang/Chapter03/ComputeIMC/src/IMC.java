public class IMC
{
    public void getIMC(double weight, double height)
    {
        double IMC = weight/Math.pow(height,2.0);

        if (IMC > 40)
        {
            System.out.print("Obesity III");
        }
        else if (IMC >= 35 && IMC <= 39.9)
        {
            System.out.print("Obesity II");
        }
        else if (IMC >= 30.0 && IMC <= 34.9)
        {
            System.out.print("Obesity I");
        }
        else if (IMC >= 25.0 && IMC <= 29.9)
        {
            System.out.print("Average");
        }
        else if (IMC >= 18.6 && IMC <= 24.9)
        {
            System.out.print("Ideal");
        }
        else if (IMC < 18.5)
        {
            System.out.print("Danger");
        }
    }
}
