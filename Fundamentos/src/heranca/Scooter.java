package heranca;

public class Scooter extends Veiculo {
    private int potenciaBateria;

    public Scooter(String descricao, int ano, String cor, int km, double valor, 
            boolean zeroKm, boolean freioAbs, int potenciaBateria) {
        super(descricao, ano, cor, km, valor, zeroKm, freioAbs);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
}
