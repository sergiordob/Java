public class Calculus
{
    public double getPay(double monthly_amount)
    {
        final double MONTHLY_INTEREST_RATE = 0.00417;

        double total_first_month, total_second_month, total_third_month, total_fourth_month, total_fifth_month;
        double total_sixth_month;
        double taxes_to_be_included_second_month;
        double taxes_to_be_included_third_month;

        total_first_month  = monthly_amount;
        taxes_to_be_included_second_month = monthly_amount*MONTHLY_INTEREST_RATE; //ok

        total_second_month = monthly_amount +  taxes_to_be_included_second_month; //ok
        taxes_to_be_included_third_month = (total_second_month*MONTHLY_INTEREST_RATE) + total_second_month;

        total_third_month  = (monthly_amount + total_second_month) +  taxes_to_be_included_third_month;

        total_fourth_month = monthly_amount + MONTHLY_INTEREST_RATE*total_third_month;
        total_fifth_month  = monthly_amount + MONTHLY_INTEREST_RATE*total_fourth_month;
        total_sixth_month  = monthly_amount + MONTHLY_INTEREST_RATE*total_fifth_month;


        return total_third_month;
    }
}
