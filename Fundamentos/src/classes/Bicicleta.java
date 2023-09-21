package classes;

/**
 *
 * @author Professor
 */
public class Bicicleta {
    // atributos, são as características da bicicleta
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    // construtor sem argumentos
    public Bicicleta() {
    }
    
    // construtor com argumentos
    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas, 
            String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    // Ações da bicicleta
    public void andar(int velocidade) {
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }
    
    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
    
    
    
    
}













