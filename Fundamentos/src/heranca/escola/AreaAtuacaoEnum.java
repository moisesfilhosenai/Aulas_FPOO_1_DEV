package heranca.escola;

public enum AreaAtuacaoEnum {
    ADMINISTRACAO("Cursos de administração"),
    TECNOLOGIA("Cursos de tecnologia da informação"),
    METALURGIA("Cursos de calderaria e solda");
    
    private String areaAtuacao;
    
    private AreaAtuacaoEnum(String area) {
        this.areaAtuacao = area;
    }
    
    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }
}
