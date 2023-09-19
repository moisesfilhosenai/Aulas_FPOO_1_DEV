package atividaderevisao.atividade02;

import java.util.Scanner;


public class atividade02 {
    public static void main(String[] args) {
        /**
         * 2) Escreva um programa que pergunte ao usuário o nome, 
         * valor, quantidade de um determinado produto e calcule 
         * o valor total. Também deverá perguntar ao usuário a 
         * forma de pagamento, considere "D" sendo débito e "C" 
         * sendo crédito. Caso a compra seja no débito aplicar 
         * desconto de 5% se o valor total da compra for até 
         * R$ 100,00. Caso o valor total da compra for mais que 
         * R$ 100,00 aplicar desconto de 3%. Se a compra foi 
         * parcelada perguntar o número de parcelas e ao final 
         * exibir as informações: nome, valor, qtde e total do 
         * produto, para venda á vista colocar o valor com 
         * desconto, para venda a prazo colocar o valor da parcela.
         */
        System.out.println("Boa tarde vendedor preciso do produto");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        
        System.out.println("Digite o valor ");
        double valor = entrada.nextDouble();
        
        System.out.println("Digite a qtde ");
        int qtde = entrada.nextInt();
        
        Produto celular = new Produto(nome, 
                valor, qtde);
        System.out.println("Qual forma de pagamento 1-credito ou 2-debito ");
        int formaPagamento = entrada.nextInt();
        
        if (formaPagamento == 2) {
            // tem desconto
            double totalComDesconto = 0.0;
            
            if (celular.getTotal() <= 100.00) {
                // desconto de 5%
                totalComDesconto = celular.getTotal() - (celular.getTotal() * 0.05);
            } else {
                // desconto de 3%
                totalComDesconto = celular.getTotal() - (celular.getTotal() * 0.03);
            }
            System.out.println("Informacoes da compra");
            System.out.println("Nome do produto: " + celular.getNome());
            System.out.println("Valor unitario do produto " + celular.getValor());
            System.out.println("Total sem desconto " + celular.getTotal());
            System.out.println("Total com desconto " + totalComDesconto);
            
        } else if (formaPagamento == 1) {
            int numeroDeParcelas = 3;
            double valorParcela = celular.getTotal() / numeroDeParcelas;
            
            System.out.println("Informacoes da compra");
            System.out.println("Nome do produto: " + celular.getNome());
            System.out.println("Valor unitario do produto " + celular.getValor());
            System.out.println("Total sem desconto " + celular.getTotal());
            System.out.println("Qtde de parcelas " + numeroDeParcelas);
            System.out.println("Valor Parcela " + valorParcela);
        } else {
            System.out.println("Forma de pagamento nao identificada");
        }
        entrada.close();
    }
}









