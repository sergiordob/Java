/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_12_01;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Sergio
 */
public class Exercise_12_01 {

    public static void main (String[] args){
      Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CustomNumberFormatException customNumberFormatException = new CustomNumberFormatException();


        String numberOne;
        String numberTwo;
        char operator;

        // number one
        try {
            System.out.print("Enter the number one: ");
            numberOne = scanner.next(); // Use next() em vez de nextLine()
            customNumberFormatException.setNumberOne(numberOne);
        } catch (NumberFormatException e) {
            System.out.printf("%s%n", e.getMessage());
            //return; // Encerra o programa em caso de exceção
        }

        // number two
        try {
            System.out.print("Enter the number two: ");
            numberTwo = scanner.next(); // Use next() em vez de nextLine()
            customNumberFormatException.setNumberTwo(numberTwo);
        } catch (NumberFormatException e) {
            System.out.printf("%s%n", e.getMessage());
            //return; // Encerra o programa em caso de exceção
        }
        
        /*Em Java, quando você lê entrada do usuário usando Scanner.nextInt() ou outras funções nextX() 
        (como nextLine(), nextDouble(), etc.), o scanner lê o valor fornecido pelo usuário, mas ele não 
        consome o caractere de nova linha (\n) que é digitado após a entrada. 
        Esse caractere de nova linha permanece no buffer de entrada.

        O problema que você estava enfrentando no seu código é que após ler um número com scanner.nextInt(), 
        você pressiona Enter. 
        Isso resulta em um caractere de nova linha no buffer de entrada que é consumido quando você lê o 
        operador com scanner.nextLine().charAt(0).

        Aqui está uma sequência de eventos que causam o problema:

        1. Você lê o número com scanner.nextInt().

        2. Você pressiona Enter.

        3. O Enter (nova linha) é lido pelo scanner.nextLine().charAt(0), resultando em uma string vazia ou 
        uma string com apenas o caractere de nova linha.

        Para resolver esse problema, você deve consumir explicitamente o caractere de nova linha do buffer de 
        entrada após ler um número com scanner.nextInt(). 
        É para isso que serve o scanner.nextLine(). Ele lê a linha em branco (o caractere de nova linha) e a descarta, 
        preparando o scanner para a próxima entrada.

        Portanto, ao adicionar scanner.nextLine() após scanner.nextInt(), você está certificando-se de que o buffer 
        de entrada está limpo antes de ler o operador com scanner.nextLine().charAt(0), 
        evitando comportamentos inesperados e erros relacionados ao caractere de nova linha.*/

        // Consume the newline character left in the input buffer
        scanner.nextLine();

        // operator
        try {
            System.out.print("Enter the operator: ");
            operator = scanner.next().charAt(0); // Use next() em vez de nextLine()
            customNumberFormatException.setOperator(operator);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s%n", e.getMessage());
        }
    }   
}


