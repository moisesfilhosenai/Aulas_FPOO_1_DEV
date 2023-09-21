package atividaderevisao.atividade01;

import java.util.Scanner;


public class atividade01 {
    public static void main(String[] args) {
        /**
         * 1) Escreva um programa para calcular a área do círculo, 
         * o programa deverá pedir para o usuário digitar o raio.
         * PI * (r*r)
         */
        System.out.println("Digite o raio do circulo: ");
        
        Scanner entrada = new Scanner(System.in);        
        double raio = entrada.nextDouble();
        
        double PI = Math.PI;
        double resultado = PI * (raio * raio);
        System.out.println("A area do circulo e " + resultado);
        
        entrada.close();
    }
}






