/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_01_atividade_01;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */

//ESSA É A CLASSE DE TESTE.
//Optei por nao criar metodo toString e tratamento de dados, porque nao consta essa requisicao no PDF da atividade.
//A solucao dessa atividade seguiu o modelo do Exemplo da Atividade 01 e sua solucao, disponibilizado no Moodle.

public class Java_01_Atividade_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        /*--------------------------------------------------------------------*/
        
        //Instancia da classe para teste do construtor padrao.
        Veiculo veiculoPadrao = new Veiculo();
         
        System.out.print("Veiculo Padrao: Imprimindo os dados default do construtor.\n\n");
        System.out.printf("Placa: %s%n", veiculoPadrao.getPlaca());
        System.out.printf("Marca: %s%n", veiculoPadrao.getMarca());
        System.out.printf("Modelo: %s%n", veiculoPadrao.getModelo());
        System.out.printf("Cor: %s%n", veiculoPadrao.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoPadrao.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoPadrao.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoPadrao.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoPadrao.getMotor().getPotencia());
        
        /*--------------------------------------------------------------------*/
        
        //Instancias de classes fazendo uso do construtor sobrecarregado.
        
        //Instancia 01
        Veiculo veiculoUm = new Veiculo("Placa 01", "Marca 01", "Modelo 01", "Cor 01", 1.0f, 1, 1, 1);
        
        System.out.print("Veiculo Um: \n\n");
        System.out.printf("Placa: %s%n", veiculoUm.getPlaca());
        System.out.printf("Marca: %s%n", veiculoUm.getMarca());
        System.out.printf("Modelo: %s%n", veiculoUm.getModelo());
        System.out.printf("Cor: %s%n", veiculoUm.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoUm.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoUm.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoUm.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoUm.getMotor().getPotencia());
        
        //Instancia 02
        Veiculo veiculoDois = new Veiculo("Placa 02", "Marca 02", "Modelo 02", "Cor 02", 2.0f, 2, 2, 2);
        
        System.out.print("Veiculo Dois: \n\n");
        System.out.printf("Placa: %s%n", veiculoDois.getPlaca());
        System.out.printf("Marca: %s%n", veiculoDois.getMarca());
        System.out.printf("Modelo: %s%n", veiculoDois.getModelo());
        System.out.printf("Cor: %s%n", veiculoDois.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoDois.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoDois.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoDois.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoDois.getMotor().getPotencia());
        
        //Instancia 03
        Veiculo veiculoTres = new Veiculo("Placa 03", "Marca 03", "Modelo 03", "Cor 03", 3.0f, 3, 3, 3);
        
        System.out.print("Veiculo Tres: \n\n");
        System.out.printf("Placa: %s%n", veiculoTres.getPlaca());
        System.out.printf("Marca: %s%n", veiculoTres.getMarca());
        System.out.printf("Modelo: %s%n", veiculoTres.getModelo());
        System.out.printf("Cor: %s%n", veiculoTres.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoTres.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoTres.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoTres.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoTres.getMotor().getPotencia());
        
        //Instancia 04
        Veiculo veiculoQuatro = new Veiculo("Placa 04", "Marca 04", "Modelo 04", "Cor 04", 4.0f, 4, 4, 4);
        
        System.out.print("Veiculo Quatro: \n\n");
        System.out.printf("Placa: %s%n", veiculoQuatro.getPlaca());
        System.out.printf("Marca: %s%n", veiculoQuatro.getMarca());
        System.out.printf("Modelo: %s%n", veiculoQuatro.getModelo());
        System.out.printf("Cor: %s%n", veiculoQuatro.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoQuatro.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoQuatro.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoQuatro.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoQuatro.getMotor().getPotencia());
        
        //Instancia 05
        Veiculo veiculoCinco = new Veiculo("Placa 05", "Marca 05", "Modelo 05", "Cor 05", 5.0f, 5, 5, 5);
        
        System.out.print("Veiculo Cinco: \n\n");
        System.out.printf("Placa: %s%n", veiculoCinco.getPlaca());
        System.out.printf("Marca: %s%n", veiculoCinco.getMarca());
        System.out.printf("Modelo: %s%n", veiculoCinco.getModelo());
        System.out.printf("Cor: %s%n", veiculoCinco.getCor());
        System.out.printf("Velocidade maxima: %.2f%n", veiculoCinco.getVelocMax());
        System.out.printf("Quantidade de rodas: %d%n", veiculoCinco.getQtdRodas());
        System.out.printf("Motor (quantidade de pistoes): %d%n", veiculoCinco.getMotor().getQtdPist());
        System.out.printf("Motor (potencia do motor): %d%n%n", veiculoCinco.getMotor().getPotencia());
        
        scanner.close();
    }   
}
