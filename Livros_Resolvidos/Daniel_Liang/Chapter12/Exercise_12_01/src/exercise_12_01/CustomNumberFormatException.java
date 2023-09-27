/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_12_01;

/**
 *
 * @author Sergio
 */
public class CustomNumberFormatException {
    private int numberOne;
    private int numberTwo;
    private char operator;
   
    public CustomNumberFormatException() {
        this.numberOne = 0;
        this.numberTwo = 0;
        this.operator = 'n';
    }

    public CustomNumberFormatException(String numberOne, String numberTwo, char operator) throws NumberFormatException {
        setNumberOne(numberOne);
        setNumberTwo(numberTwo);
        setOperator(operator);
    }

    public void setNumberOne(String numberOne) throws NumberFormatException {
        try {
            // Tenta converter a string em um número inteiro
            this.numberOne = Integer.parseInt(numberOne);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not an integer number.");
        }
    }

    public void setNumberTwo(String numberTwo) throws NumberFormatException {
        try {
            // Tenta converter a string em um número inteiro
            this.numberTwo = Integer.parseInt(numberTwo);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not an integer number.");
        }
    }

    public void setOperator(char operator) throws IllegalArgumentException {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Not a valid operator.");
        } else {
            this.operator = operator;
        }
    }

    public int getNumberOne() {
        return this.numberOne;
    }

    public int getNumberTwo() {
        return this.numberTwo;
    }

    public char getOperator() {
        return this.operator;
    }
}

        





