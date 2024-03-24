public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return (int) (Math.pow(this.lado, 2));
    }
    
    public int calcularPerimetro() {
        return (4 * this.lado);
    }

    public String imprimir() {
        return String.format("Metragem dos lados do quadrado: %dm\nÁrea do quadrado: %dm²\nPerímetro do quadrado: %dm\n", this.lado, this.calcularArea(), this.calcularPerimetro());
    }
}
