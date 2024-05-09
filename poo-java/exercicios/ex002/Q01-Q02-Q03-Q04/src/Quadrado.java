public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return this.lado * this.lado;
    }
    
    public int calcularPerimetro() {
        return 4 * this.lado;
    }

    public void imprimir() {
        System.out.println("Quadrado\nLados: " + this.lado);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro() + "\n");
    }
}
