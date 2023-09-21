package aulaestruturadecisao;

public class ifelse2 {
    public static void main(String[] args) {
        int temperatura = 15;

        if (temperatura == 15) {
            System.out.println("esta ficando frio");
        } else if (temperatura == 20) {
            System.out.println("Está ficando agradável");
        } else if (temperatura == 30) {
            System.out.println("Esta ficando calor");
        }

        switch (temperatura) {
            case 15:
                System.out.println("Está ficando frio");
                break;
            case 20:
                System.out.println("Está ficando agradável");
                break;
            case 30:
                System.out.println("Está ficando calor");
                break;    
            default:
                System.out.println("Não identifiquei a temperatura");
                break;
        }






    }






}
