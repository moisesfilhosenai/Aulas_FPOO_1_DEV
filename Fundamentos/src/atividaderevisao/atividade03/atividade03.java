package atividaderevisao.atividade03;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        /**
         * Escreve um programa que pergunte a velocidade do carro, caso 
         * ultrapasse 80km/h mostre uma mensagem dizendo que o 
         * motorista foi multado. Nesse caso mostrar o valor 
         * da multa cobrando R$ 5,00 por km acima de 80 km/h.
         */
        
        Scanner velocidadeScanner = new Scanner(System.in);
        
        System.out.println("Qual a velocidade do carro? ");
        int velocidade = velocidadeScanner.nextInt();
        
        if (velocidade > 80) {
            
           int velocidadeUltrapassada = velocidade - 80;
           int valorMulta = velocidadeUltrapassada * 5;
           System.out.println("Você foi multado >:( \nMulta: " + valorMulta);
        } else {
            System.out.println("Voce não foi multado!Boa viagem");
        }
        
    }
}
