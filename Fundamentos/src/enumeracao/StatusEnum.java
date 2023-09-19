package enumeracao;

public enum StatusEnum {
    EM_PREPARACAO("Em preparação"),
    EM_TRANSPORTE("Em transporte"),
    ENTREGUE("Entregue ao cliente");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    }

    private String getStatus() {
        return this.status;
    }
}
