
package classes;

/**
 *
 * @author Professor
 */
public class Carro {
    // Atributos
    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int rodas;
    private int marcha;
    private boolean estaEmRe;
    
    // Construtores
    public Carro(String modelo, CorEnum cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String modelo, String marca, CorEnum cor, int ano, int rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.rodas = rodas;
    }
    
    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
        
    }
    
    public void engatarRe(boolean re) {
        this.estaEmRe = re;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", rodas=" + rodas + ", marcha=" + marcha + ", estaEmRe=" + estaEmRe + '}';
    }
    
    
}
