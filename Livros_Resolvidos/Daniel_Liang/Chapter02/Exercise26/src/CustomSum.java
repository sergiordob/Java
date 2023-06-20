public class CustomSum
{
    int result;
    public int getSum(int number)
    {
        if (number <= 9)
        {
            result = number;
        }
        else if (number >= 10 && number <= 99)
        {
            result = ((number%10) + (number/10));
        }
        else if (number >= 100 && number <= 999)
        {
            result = ( (number%10) + (number/10)%10 + (number/10)/10 );
        }
        else if (number == 1000)
        {
            result = 1;
        }
        return result;
    }
}
