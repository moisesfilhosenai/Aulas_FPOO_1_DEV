package atividaderevisao;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que pergunte ao usuário o nome, valor, quantidade de um determinado produto e calcule o 
         * valor total. Também deverá perguntar ao usuário a forma de pagamento, considere "D" sendo débito e "C" sendo crédito. 
         * Caso a compra seja no débito aplicar desconto de 5% se o valor total da compra for até R$ 100,00. 
         * Caso o valor total da compra for mais que R$ 100,00 aplicar desconto de 3%. 
         * Se a compra foi parcelada perguntar o número de parcelas e ao final exibir as 
         * informações: nome, valor, qtde e total do produto, para venda á vista colocar o valor com desconto, 
         * para venda a prazo colocar o valor da parcela.
         */
        System.out.println("--- Caluladora de Desconto de Produtos ---");
        System.out.println("Por favor digite as informações do Produto: ");

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nomeProduto = entrada.next();
        
        System.out.print("Valor: ");
        double valorProduto = entrada.nextDouble();

        System.out.print("Quantidade: ");
        int qtdeProduto = entrada.nextInt();

        double valorTotal = qtdeProduto * valorProduto;

        System.out.print("Qual a forma de pagamento, utilize D ou d (débito), C ou c (crédito): ");
        String formaPagamento = entrada.next();

        if (formaPagamento.equalsIgnoreCase("C")) {

            int qtdeParcelas = 1;

            System.out.println("Deseja parcelar sua compra ? S ou s (Sim), N ou n (Não): ");
            String parcelar = entrada.next();

            if (parcelar.equalsIgnoreCase("S")) {

                System.out.println("Qual a quantidade de parcelas ? ");
                qtdeParcelas = entrada.nextInt();
            }

            // Cálculo para pagamento no crédito
            double valorParcela = valorTotal / qtdeParcelas;

            System.out.println("Segue um resumo da sua compra no Crédito");

            String resumoCredito = "";

            if (qtdeParcelas == 1) {
                // Crédito a vista
                resumoCredito = String.format("Produto: %s, Valor: %2.f, Qtde: %d, Total: %2.f", 
                            nomeProduto, valorProduto, qtdeProduto, valorTotal);
            } else if (qtdeParcelas > 1) {
                // Crédito parcelado
                resumoCredito = String.format("Produto: %s, Valor: %2.f, Qtde: %d, Total: %2.f, Qtde parcelas: %d, Valor por parcela: %2.f", 
                            nomeProduto, valorProduto, qtdeProduto, valorTotal, qtdeParcelas, valorParcela);
            }

            System.out.println(resumoCredito);

        }else if (formaPagamento.equalsIgnoreCase("D")) {
            
            double desconto = 0;

            if (valorTotal <= 100) {
                // desconto 3%
                desconto = valorTotal * (3 / 100);
            } else if (valorTotal > 100) {
                // desconto 5%
                desconto = valorTotal * (5 / 100);
            }

            // Cálculo para pagamento no débito
            double valorFinalProduto = valorTotal - desconto;

            String resumoDebito = String.format("Produto: %s, Valor: %2.f, Qtde: %d, Total: %2.f, Total com Desconto: %2.f", 
                            nomeProduto, valorProduto, qtdeProduto, valorTotal, valorFinalProduto);

            System.out.println("Segue um resumo da sua compra no Débito");
            System.out.println(resumoDebito);
        }
        entrada.close();
    }
}
