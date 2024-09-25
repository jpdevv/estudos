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
        return "A fita '" + this.titulo + "' foi alugada por " + numDiasAlugada + " dias, no valor total de R$" + alug + "\n";
    }

    public String toString() {
        return "Fita\nTítulo: " + this.titulo + "\n" + "Valor do aluguel: R$" + this.aluguel + "/dia" + "\n";
    }
}
