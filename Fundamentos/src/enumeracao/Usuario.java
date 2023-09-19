package enumeracao;

public class Usuario {
    private String nome;
    private String email;
    private boolean ativo;
    // private int tipo; // 0 comum, 1 tecnico, 2 administrador
    private TipoUsuarioEnum tipo; // 0 comum, 1 tecnico, 2 administrador

    public Usuario(String nome, String email, boolean ativo, TipoUsuarioEnum tipo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
        this.tipo = tipo;
    }

    public String toString() {
        return "Nome: " + this.nome + " Email: " + this.email + " Ativo: " + this.ativo + " Tipo: " + this.tipo;
    }
}
