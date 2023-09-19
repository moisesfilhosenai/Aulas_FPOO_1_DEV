package heranca;

public class Moto extends Veiculo {
    private String combustivel;
    private String tipoPartida;

    public Moto(String descricao, int ano, String cor, int km, double valor, 
            boolean zeroKm, boolean freioAbs, CombustivelEnum combustivelEnum, 
            PartidaEnum partidaEnum) {
        super(descricao, ano, cor, km, valor, zeroKm, freioAbs);
        this.combustivel = combustivelEnum.getCombustivel();
        this.tipoPartida = partidaEnum.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Moto{" + "combustivel=" + combustivel + ", tipoPartida=" + tipoPartida + '}';
    }
    
}
