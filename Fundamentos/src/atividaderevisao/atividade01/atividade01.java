package atividaderevisao.atividade01;

import java.util.Scanner;
import java.lang.Math;

public class atividade01 {
    public static void main(String[] args) {
        /*
         * Escreva um programa para calcular a área do círculo, o programa deverá pedir para o usuário digitar o raio.
         */
        System.out.println("--- Caluladora de Círculos ---");
        System.out.print("Por favor digite o raio do círculo: ");
        
        Scanner entrada = new Scanner(System.in);
        int raio = entrada.nextInt();
        entrada.close();

        double resultado = raio * Math.PI;
        String mensagem = String.format("O raio do círculo é: %.2f", resultado);
        System.out.println(mensagem);
    }
}
