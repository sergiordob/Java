public class IMC
{
    public double getIMC(double weight, double meters, double centimeters)
    {
        double centimeters_to_meters = centimeters/100;
        double height = meters + centimeters_to_meters;
        double imc = weight/(height*height);

        return imc;
    }

    public String getGrade(double weight, double meters, double centimeters)
    {
        double centimeters_to_meters = centimeters/100;
        double height = meters + centimeters_to_meters;
        double imc = weight/(height*height);
        String grade;

        if (imc >= 40)
        {
            grade = "Obesity III";
        }
        else if (imc >= 35 && imc <= 39.9)
        {
            grade = "Obesity II";
        }
        else if (imc >= 30 && imc <= 34.9)
        {
            grade = "Obesity I";
        }
        else if (imc >= 25 && imc <= 29.9)
        {
            grade = "Overweight";
        }
        else if (imc >= 18.5 && imc <= 24.9)
        {
            grade = "Normal";
        }
        else
        {
            grade = "Underweight";
        }
        return grade;
    }
}
