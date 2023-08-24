package classes;

/**
 *
 * @author Professor
 */
public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 
                8, "Caloi Cross", true, "Azul");
        
        System.out.println(caloiCross);
        
        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);
        
        System.out.println(caloiCross);
        
        System.out.println("-------------------------------------------------");
        
        Carro gol = new Carro("Gol", CorEnum.AZUL);
        Carro escort = new Carro("Escort", "Ford", CorEnum.CINZA, 1992, 4);
        
        gol.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        gol.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        gol.trocarDeMarcha(MarchaEnum.QUARTA_MARCHA);
        
        System.out.println(gol);
        System.out.println(escort);
        
        System.out.println("-------------------------------------------------");
        
        Aluno aluno01 = new Aluno("Aluno 01", "aluno01@gmail.com", "123b1");
        Aluno aluno02 = new Aluno("Aluno 02", "aluno02@gmail.com", "49845njf");
        
        System.out.println(aluno01);
        System.out.println(aluno02);
    }
}
