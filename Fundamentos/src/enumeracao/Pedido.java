package enumeracao;

public class Pedido {
    private String descricao;
    private double valor;
    private StatusEnum status;

    public Pedido(String descricao, double valor, StatusEnum status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String toString() {
        return "Descrição: " + this.descricao + " Valor: " + this.valor + " Status: " + this.status;
    }
}
