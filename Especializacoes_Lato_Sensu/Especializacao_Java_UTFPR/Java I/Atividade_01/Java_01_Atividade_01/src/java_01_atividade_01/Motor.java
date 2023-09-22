/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_01_atividade_01;

/**
 *
 * @author Sergio
 */
public class Motor {
    
    private int qtdPist;
    private int potencia;
    
    //Construtor default
    public Motor(){
        this.qtdPist    = 0;
        this.potencia   = 0;
    }
    
    //Construtor sobrecarregado
    public Motor(int qtdPist, int potencia){
        this.qtdPist    = qtdPist;
        this.potencia   = potencia;
    }
    
    //Metodos get
    public int getQtdPist(){
        return this.qtdPist;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    //Metodos set
    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}
