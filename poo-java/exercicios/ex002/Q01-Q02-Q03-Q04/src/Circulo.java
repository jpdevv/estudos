public class Circulo {
    private int raio;
    private double pi = 3.141516;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return (pi * (this.raio * this.raio));
    }

    public double calcularPerimetro() {
        return (2 * pi * this.raio);
    }

    public void imprimir() {
        System.out.println("Circulo\nRaio: " + this.raio);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro() + "\n");
    }
}
