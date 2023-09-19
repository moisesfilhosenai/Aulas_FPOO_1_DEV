package heranca.estacionamento;

public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    FLEX("Flex"),
    DIESEL("Diesel");
    
    private String combustivel;
    
    private CombustivelEnum(String combustivel) {
        this.combustivel = combustivel;
    }
    
    public String getCombustivel() {
        return this.combustivel;
    }
}
