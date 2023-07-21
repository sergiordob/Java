public class Main
{
    public static void main(String[] args)
    {
        int cont = 0;
        int numberA = 2;

        while (numberA <= 1200)
        {
            int numberB = 0;

            for (numberB = 2; numberB <= numberA/2; numberB++)
            {
                if (numberA % numberB == 0)
                {
                    break; //quando o numero eh primo, ele quebra o laco e sai dele
                }
            }

            if (numberB > numberA/2) //quando a quebra acontece, ocorreu um numero primo, mas para o compilador entender que numero selecionar eh preciso do if
            {
                cont++;
                System.out.printf("%d ", numberA);

                if (cont % 8 == 0)
                {
                    System.out.println();
                }
            }
            numberA++;
        }
    }
}