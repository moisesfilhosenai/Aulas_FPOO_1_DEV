package classes;

/**
 *
 * @author Professor
 */
public class Aluno {
    // Atributos
    private String nome;
    private String email;
    private String ra;
    private boolean estudando;
    private boolean aprovado;
    
    // Construtor

    public Aluno(String nome, String email, String ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
    }
    
    public void estaEstudando(boolean estudando) {
        this.estudando = estudando;
    }
    
    public void aprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", estudando=" + estudando + ", aprovado=" + aprovado + '}';
    }
    
    
    
}
