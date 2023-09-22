/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*1)_ Construa um programa que permita ao usuário entrar com determinada
frase, depois permita “escolher” uma letra qualquer e: caso a letra escolhida
esteja na frase (seja maiúscula ou minúscula) diga quantas vezes ela
apareceu e em que posição da frase. Senão, apareça uma frase informando
que esta letra não existe na frase.*/

import java.util.Scanner;
import java.util.Locale;

public class Name {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String name = "";
        char letter;
        int count = 0;

        System.out.print("Enter a string: ");
        name = scanner.nextLine();
        System.out.print("Enter a letter: ");
        letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);

        int[] position = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            if ( Character.toLowerCase(name.charAt(i)) == letter)
            {
                count++;
                position[i] = i;
            }
        }
        System.out.printf("%d%n", count);

        System.out.printf("Position(s): ");
        for(int i = 0; i < name.length(); i++){
            if (position[i] != 0){
                System.out.printf("%d  ", position[i]);
            }
        }
    }
}