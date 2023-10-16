package br.com.classes;

public class Rational {
    private int numerator;
    private int denominator;

    Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }
}
