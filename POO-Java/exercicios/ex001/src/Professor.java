public class Professor {
    private int matricula;
    private String nome;
    private String departamento;

    public Professor(String nome, int matricula, String departamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nMatrícula: %d\nDepartamento: %s\n", this.getNome(), this.getMatricula(), this.getDepartamento());
    }
}
