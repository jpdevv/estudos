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

    public String getValorAluguel(int numDiasAlugada) {
        float alug = (this.aluguel * numDiasAlugada);
        return String.format("A fita '%s' foi alugada por %d dias, o valor total é de R$%.2f\n\n", this.getTitulo(), numDiasAlugada, alug);
    }

    public String toString() {
        return String.format("-------[ Fita ]-------\nTitulo da fita: %s\nValor do aluguel: R$%.2f/dia", this.getTitulo(), this.getAluguel());
    }
}
