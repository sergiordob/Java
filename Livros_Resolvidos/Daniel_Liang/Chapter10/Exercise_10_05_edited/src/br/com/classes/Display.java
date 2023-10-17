package br.com.classes;

public class Display {
    private int number;
    private int size;
    private int[] divisors;

    public Display(int number) {
        this.number = number;
        this.size = 0;
        calculateSize();
        divisors = new int[size]; //aqui, o valor de size foi atualizado em calculateSize()
        fillArray();
    }

    private void calculateSize() {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                size++;
            }
        }
    }
    private void fillArray() {
        int index = 0;
        for (int i = 1; i < number; i++) {
            if ((number) % i == 0) {
                divisors[index] = i; //Ao final, index sera igual a size
                index++;
            }
        }
    }
    public int[] returnArray() {
        return divisors;
    }
    public int getNumber() {
        return this.number;
    }
    public int getSize() {
        return this.size;
    }
}
