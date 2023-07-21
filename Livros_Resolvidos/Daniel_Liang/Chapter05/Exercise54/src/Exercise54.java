public class Exercise54 {
    public static void main(String[] args) {
        int n = 1;

        System.out.println("Inches       Centimeters");

        while (n <= 10)
        {
            System.out.printf("%-15d %.2f%n", n, n * 2.54); //-15d significa que o compilador reserva um espaco de 15 caracteres alinhado a esquerda

            n++;
        }
    }
}
