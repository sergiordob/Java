import java.util.Scanner;

public class Exercise421
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String ssnNumber = null;

        System.out.print("Enter a SSN number(xxx-xx-xxxx): ");
        ssnNumber = input.nextLine();

       if (ssnNumber.charAt(0) >= 48 && ssnNumber.charAt(0) <= 57)
       {
            if (ssnNumber.charAt(1) >= 48 && ssnNumber.charAt(1) <= 57)
            {
            
                if (ssnNumber.charAt(2) >= 48 && ssnNumber.charAt(2) <= 57)
                {
                    if (ssnNumber.charAt(3) == 45)
                    {
                        if (ssnNumber.charAt(4) >= 48 && ssnNumber.charAt(4) <= 57)
                        {
                            if (ssnNumber.charAt(5) >= 48 && ssnNumber.charAt(5) <= 57)
                            {
                                if (ssnNumber.charAt(6) == 45)
                                {
                                     if (ssnNumber.charAt(7) >= 48 && ssnNumber.charAt(7) <= 57)
                                    {
                                         if (ssnNumber.charAt(8) >= 48 && ssnNumber.charAt(8) <= 57)
                                        {
                                            if (ssnNumber.charAt(9) >= 48 && ssnNumber.charAt(9) <= 57)
                                            {
                                                if (ssnNumber.charAt(10) >= 48 && ssnNumber.charAt(10) <= 57)
                                                {
                                                    System.out.print(ssnNumber + " is a valid number");
                                                }
                                                else
                                                {
                                                    System.out.print("Invalid");
                                                }
                                            }
                                            else
                                                {
                                                    System.out.print("Invalid");
                                                }
                                        }
                                        else
                                                {
                                                    System.out.print("Invalid");
                                                }
                                    }
                                    else
                                                {
                                                    System.out.print("Invalid");
                                                }
                                }
                                else
                                                {
                                                    System.out.print("Invalid");
                                                }
                            }
                            else
                                                {
                                                    System.out.print("Invalid");
                                                }
                        }
                        else
                                                {
                                                    System.out.print("Invalid");
                                                }
                    }
                    else
                                                {
                                                    System.out.print("Invalid");
                                                }
                }
                else
                                                {
                                                    System.out.print("Invalid");
                                                }
            }
            else
                                                {
                                                    System.out.print("Invalid");
                                                }
       }
       else
                                                {
                                                    System.out.print("Invalid");
                                                }
    }
}
