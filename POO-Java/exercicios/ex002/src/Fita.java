public class Fita {
    private String titulo;
    private float aluguel;

    public Fita(String titulo, float aluguel) {
        this.titulo = titulo;
        this.aluguel = aluguel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public float getAluguel() {
        return this.aluguel;
    }

    public float getValorAluguel(int numDiasAlugada) {
        return this.aluguel * numDiasAlugada;
    }

    public String toString() {
        return String.format("-------[ Fita ]-------\nTitulo da fita: %s\nValor do aluguel: R$%.2f/dia\n", this.getTitulo(), this.getAluguel());
    }
}