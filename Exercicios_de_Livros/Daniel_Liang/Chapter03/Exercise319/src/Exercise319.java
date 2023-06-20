import java.util.Scanner;

public class Exercise319
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int cont = 0;
        double a,b,c;
        double perimeter;

        System.out.print("Enter sides a,b,c: "); //Triangulo valido = 5,7,10. Nao valido = 3,4,9
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (c < a + b)
        {
            cont++;
        }
        if (b < a + c)
        {
            cont++;
        }
        if (a < b + c)
        {
            cont++;
        }

        if (cont == 3)
        {
            perimeter = a+b+c;
            System.out.printf("Perimeter = %.2f", perimeter);
        }
        else
        {
            System.out.printf("Not a valid triangle");
        }
    }
}
