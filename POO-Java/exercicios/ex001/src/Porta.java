//Criando a classe:
public class Porta {
    //Atributos:
    private String cor;
    private float altura;
    private float largura;
    private boolean estaAberta;

    //Construtor:
    public Porta(String cor, float altura, float largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    //Métodos getters e setters:
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
    
    //Método toString()
    public String toString() {
        return "Cor da porta: " + this.getCor() + ", Altura: " + this.getAltura() + ", Largura: " + this.getLargura() + ", Está aberta? " + this.isEstaAberta();
    }
}
