public class Fature
{
    double getFature(double investment_amount, double annual_interest_rate_porcentage, double number_of_years)
    {
        double monthlyInterestRate = (annual_interest_rate_porcentage/100)/12; //Para resolver esse quesito, eh necessario converter o valor de porcentagem para decimal. Se faz isso dividindo por 100.
        double exponent = (number_of_years*12);
        double base = (1.0+monthlyInterestRate);
        double aux = Math.pow(base, exponent);
        double futureInvestmentValue = investment_amount*aux;

        return futureInvestmentValue;
    }
}
