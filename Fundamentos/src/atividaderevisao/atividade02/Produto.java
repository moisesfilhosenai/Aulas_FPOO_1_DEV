package atividaderevisao.atividade02;


public class Produto {
    private String nome;
    private double valor;
    private int qtde;
    private double total;

    public Produto(String nome, double valor, int qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
        this.total = this.valor * this.qtde;
    }

    public double getTotal() {
        return total;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
    
    
    
}
