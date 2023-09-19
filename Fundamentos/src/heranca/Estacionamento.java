package heranca;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Estacionamento {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Carro gol = new Carro("Gol muito conservado", 1999, 
                "Azul", 78900, 15900, false, false, 2, 
                CambioEnum.MANUAL, CombustivelEnum.GASOLINA);
        System.out.println(gol);
        
        System.out.println("-------------------------------------------------");
        
        Moto titan = new Moto("CG Titan", 2005, "Vermelha", 
                570, 12300, false, true, 
                CombustivelEnum.FLEX, PartidaEnum.ELETRICA);
        System.out.println(titan);
        
        System.out.println("-------------------------------------------------");
        Scooter scooter = new Scooter("Scooter Elétrica Nova", 2023, 
                "Cinza", 0, 15000, true, false, 2200);
        System.out.println(scooter);
    }
}
