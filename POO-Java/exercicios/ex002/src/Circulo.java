public class Circulo {
    private int raio;
    private double pi = 3.141516;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (this.pi * (Math.pow(this.raio, 2)));
    }

    public double calcularPerimetro() {
        return (2 * this.pi * this.raio);
    }

    public String imprimir() {
        return String.format("-------[ Circulo ]-------\nRaio do circulo: %dm\nÁrea do circulo: %fm²\nPerímetro do circulo: %fm\n\n", this.raio, this.calcularArea(), this.calcularPerimetro());
    }
}
