package heranca.escola;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Escola {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Professor moises = new Professor("Moisés", 40, "moises@gmail.com", 
                AreaAtuacaoEnum.TECNOLOGIA, true);
        System.out.println(moises);
        
        System.out.println("-------------------------------------------------");
        
        Aluno antonio = new Aluno("Antonio", 17, "antonio@gmail.com", "4r512a", true);
        System.out.println(antonio);
        
    }
}
