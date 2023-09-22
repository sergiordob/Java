/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_01_atividade_01;

/**
 *
 * @author Sergio
 */
public class Veiculo {
    
    private String  placa;
    private String  marca;
    private String  modelo;
    private String  cor;
    private float   velocMax;
    private int     qtdRodas;
    private Motor   motor;
    
    //Construtor padrao
    public Veiculo(){
        this.placa      = " ";
        this.marca      = " ";
        this.modelo     = " ";
        this.cor        = " ";
        this.velocMax   = 0.0f;
        this.qtdRodas   = 0;
        this.motor      = new Motor();
    }
    
    //Construtor sobrecarregado
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia){
        this.placa      = placa;
        this.marca      = marca;
        this.modelo     = modelo;
        this.cor        = cor;
        this.velocMax   = velocMax;
        this.qtdRodas   = qtdRodas;
        this.motor      = new Motor(qtdPist, potencia);
    }
    
    //Metodos get
    public String getPlaca(){
        return this.placa;
    }
    
    public String getMarca(){
        return this.marca;
    }
            
    public String getModelo(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public float getVelocMax(){
        return this.velocMax;
    }
    
    public int getQtdRodas(){
        return this.qtdRodas;
    }
    
    public Motor getMotor(){
        return this.motor;
    }
    
    //Metodos set
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
            
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setVelocMax(float velocMax){
        this.velocMax = velocMax;
    }
    
    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    
    public void setMotor(int qtdPist, int potencia){
        this.motor = new Motor(qtdPist, potencia);
    }
    
}
    
