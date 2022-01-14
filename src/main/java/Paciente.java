public class Paciente {

    private String nome;
    private boolean hasLeito;

    public Paciente(String nome, boolean hasLeito) {
        this.nome = nome;
        this.hasLeito = hasLeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getLeito() {
        return hasLeito;
    }

    public void setLeito(boolean hasLeito) {
        this.hasLeito = hasLeito;
    }
}