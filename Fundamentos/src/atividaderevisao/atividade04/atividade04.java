package atividaderevisao.atividade04;

import java.util.Scanner;

public class atividade04 {
    /**
     * 4) Escreva um programa que pergunte o salário 
     * do funcionário e calcule o valor do aumento, 
     * se o salário for superior a R$ 1350,00 o 
     * percentual de aumento será de 10%, caso o 
     * valor seja inferior percentual de aumento 
     * será de 15%.
     */
    public static void main(String[] args) {
        
        System.out.println("Qual é o salario do funcionario?");
        Scanner salarioScanner = new Scanner(System.in);
        double salario = salarioScanner.nextDouble();
        
        if (salario > 1350) {
            double aumento = salario * 0.10;
            double novoSalario = salario + aumento;
            System.out.println("Parabens :)");
            System.out.println("Voce foi promovido");
            System.out.println("Seu novo salario e " + novoSalario);
        }
    }
}
