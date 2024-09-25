public class Retangulo {
    private int comprimento, largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea() {
        return (this.comprimento * this.largura);
    }

    public int calcularPerimetro() {
        return ((2 * this.comprimento) + (2 * this.largura));
    }

    public void imprimir() {
        System.out.println("Retângulo\nLargura: " + this.largura);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro() + "\n");
    }
}
