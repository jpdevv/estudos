public class Veiculo {
    private String modelo, marca;
    private double preco;
    private int quantidade;


    public Veiculo(String modeloVeiculo, String marcaVeiculo, double precoVeiculo, int quantidadeVeiculo) {
        this.modelo = modeloVeiculo;
        this.marca = marcaVeiculo;
        this.preco = precoVeiculo;
        this.quantidade = quantidadeVeiculo;
    }

    public String getInfoVeiculo() {
        return String.format(
            "----------> Veiculo <----------\n" + 
            "Modelo: %s\n" + 
            "Marca: %s\n" + 
            "Preço: R$%.2f\n" +
            "Quantidade em estoque: %d veiculo(s)\n\n" +
            "Valor total dos veículos no estoque: R$%.2f\n\n",
            this.modelo, this.marca, this.preco, this.quantidade, calcularValorTotalEstoque());
    }

    public double calcularValorTotalEstoque() {
        return (this.quantidade * this.preco);
    }

    public String getModelo() {
        return this.modelo;
    }
}
