public class Porta {
    private String cor;
    private float altura;
    private float largura;
    private boolean estaAberta;

    public Porta(String cor, float altura, float largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public boolean isEstaAberta() {
        return estaAberta;
    }
    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }
    
    @Override
    public String toString() {
        return String.format("Cor da porta: %s\nAltura: %.1fm\nLargura: %.1fm\nEstá aberta? %s\n", this.getCor(), this.getAltura(), this.getLargura(), this.isEstaAberta());
    }
}
