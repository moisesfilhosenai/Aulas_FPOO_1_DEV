package heranca.escola;

public class Professor extends Pessoa {
    private String areaAtuacao;
    private boolean dedicacaoExclusiva;

    public Professor(String nome, int idade, String email, 
            AreaAtuacaoEnum areaAtuacaoEnum, boolean dedicacaoExclusiva) {
        super(nome, idade, email);
        this.areaAtuacao = areaAtuacaoEnum.getAreaAtuacao();
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "areaAtuacao=" + areaAtuacao + ", dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
    
}
