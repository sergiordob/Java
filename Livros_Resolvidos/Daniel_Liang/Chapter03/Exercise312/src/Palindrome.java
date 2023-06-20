public class Palindrome
{
    public static boolean getCheck(int number)
    {
        int a, b, c;

        a = number/100;
        b = (number%100)/10;
        c = (number%100)%10;

        if (a == c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
