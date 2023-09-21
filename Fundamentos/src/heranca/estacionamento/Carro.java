package heranca.estacionamento;

public class Carro extends Veiculo {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(String descricao, int ano, String cor, int km, double valor, boolean zeroKm, 
            boolean freioAbs, int qtdePortas, CambioEnum cambioEnum, 
            CombustivelEnum combustivelEnum) {
        super(descricao, ano, cor, km, valor, zeroKm, freioAbs);
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getModelo();
        this.combustivel = combustivelEnum.getCombustivel();
    }

    @Override
    public String toString() {        
        return super.toString() + "\n" + "Carro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }    
}
