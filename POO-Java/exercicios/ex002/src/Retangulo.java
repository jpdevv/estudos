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

    public String imprimir() {
        return String.format("-------[ Retângulo ]-------\nComprimento do retâgulo: %dm\nLargura do retângulo: %dm\nÁrea do retângulo: %dm²\nPerímetro do retângulo: %dm\n\n", this.comprimento, this.largura, this.calcularArea(), this.calcularPerimetro());
    }
}
