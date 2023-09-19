package heranca.estacionamento;


public class Veiculo {
    private String descricao;
    private int ano;
    private String cor;
    private int km;
    private double valor;
    private boolean zeroKm;
    private boolean freioAbs;

    public Veiculo(String descricao, int ano, String cor, int km, double valor, 
            boolean zeroKm, boolean freioAbs) {
        this.descricao = descricao;
        this.ano = ano;
        this.cor = cor;
        this.km = km;
        this.valor = valor;
        this.zeroKm = zeroKm;
        this.freioAbs = freioAbs;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "descricao=" + descricao + ", ano=" + ano + ", cor=" + cor + ", km=" + km + ", valor=" + valor + ", zeroKm=" + zeroKm + ", freioAbs=" + freioAbs + '}';
    }
    
}
