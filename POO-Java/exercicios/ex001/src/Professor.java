//Criando a classe:
public class Professor {
    //Atributos:
    private int matricula;
    private String nome;
    private String departamento;

    //Construtor:
    public Professor(String nome, int matricula, String departamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    //Métodos getters e setters:
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

    //Método toString():
    public String toString() {
        return "Nome: " + this.getNome() + ", Matrícula: " + this.getMatricula() + ", Departamento: " + this.getDepartamento();
    }
}
