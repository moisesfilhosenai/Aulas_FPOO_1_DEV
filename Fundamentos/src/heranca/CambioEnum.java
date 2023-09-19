package heranca;

public enum CambioEnum {
    AUTOMATICO("Automático"),
    MANUAL("Manual");
    
    private String modelo;
    
    private CambioEnum(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
}
