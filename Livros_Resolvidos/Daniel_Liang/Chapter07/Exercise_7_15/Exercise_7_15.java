import java.util.Scanner;

public class Exercise_7_15
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Enter the element %d: ", i+1);
            array[i] = input.nextInt();
        }

        System.out.println();

        printArray(eliminateDuplicate(array));
    }

    public static int[] copyArray(int[] array)
    {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] eliminateDuplicate(int[] array)
    {
       int[] trueArray = new int[array.length];
       int indexOfNotDuplicateElement = 0;

       for (int i = 0; i < array.length; i++) //vai percorrer o aray
       {
           boolean isDuplicate = false; //o estado falso eh armazenado

           for(int j = 0; j < indexOfNotDuplicateElement; j++) //esse for só comeca quando o index = 1
           {
               if (array[i] == trueArray[j])
               {
                   isDuplicate = true;
                   break; //quando ele verifica que o numero foi duplicado, o break interrompe o laco, e o codigo recomeca com o trimArray
               }
           }

           if (isDuplicate == false) //inicialmente o codigo vai comecar aqui, ignorando o for anterior
           {
               trueArray[indexOfNotDuplicateElement] = array[i];
               indexOfNotDuplicateElement++;
           }
       }

        int[] trimmedArray = new int[indexOfNotDuplicateElement]; //eh necessario criar um outro array e passar os valores nao duplicados, porque o true array tem celulas contendo zero, que nao foram preenchidas, ao retirar os duplicados

        for (int i = 0; i < indexOfNotDuplicateElement; i++)
        {
            trimmedArray[i] = trueArray[i];
        }

        return trueArray;
    }
    public static void printArray(int[] array)
    {
        int[] copy = copyArray(array);

        System.out.print("Array =");

        for(int i = 0; i < array.length; i++)
        {
            System.out.printf(" %d", copy[i]);
        }
    }
}
