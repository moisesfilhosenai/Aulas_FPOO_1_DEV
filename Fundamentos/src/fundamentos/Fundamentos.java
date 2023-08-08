package fundamentos;


public class Fundamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaração de variáveis de tipos primitivos
        String nome = "Moisés";
        int idade = 40;
        boolean estudando = true;
        double media = 5.5; 
        
        String bairro = new String("Centro");
        
        // Declaração de Wrappers
        int nota1 = Integer.parseInt("8");
        double mediaF = Double.parseDouble("5.5");
        boolean aprovado = Boolean.parseBoolean("true");

        System.out.println("Aluno: " + nome + " Idade: " + idade + " Estudando: "+ estudando);
        System.out.println("Média: " + media + " Bairro: " + bairro + " Nota 1: " + nota1 + " Media: " + media);
        System.out.println("Média Final: " + mediaF +  "Aprovado: " + aprovado);
    }
    
}
