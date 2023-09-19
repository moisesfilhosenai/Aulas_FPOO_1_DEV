package heranca;

public enum PartidaEnum {
    ELETRICA("Partida elétrica"),
    PEDAL("Partida pedal");
    
    private String tipoPartida;
    
    private PartidaEnum(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
    
    public String getTipoPartida() {
        return this.tipoPartida;
    }
}
