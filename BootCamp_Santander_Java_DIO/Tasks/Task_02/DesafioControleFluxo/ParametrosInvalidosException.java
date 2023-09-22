public class ParametrosInvalidosException extends Exception
{
    public ParametrosInvalidosException()
    {
        super("The first number must be smaller than the second!");
    }
}
