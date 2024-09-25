public class Livro {
    private String titulo, autor;
    private double preco;
    private int quantidade;

    public Livro(String tituloLivro, String autorLivro, double precoLivro, int quantidadeLivro) {
        this.titulo = tituloLivro;
        this.autor = autorLivro;
        this.preco =  precoLivro;
        this.quantidade = quantidadeLivro;
    }

    public String getInfoLivro() {
        return String.format(
            "-----------> Livro <-----------\n" +
            "Titulo: %s\n" +
            "Autor: %s\n" +
            "Preço: R$ %.2f\n" +
            "Quantidade de livros: %d\n\n" +
            "Valor total de livros no estoque: R$ %.2f\n\n",
            this.titulo, this.autor, this.preco, this.quantidade, calcularValorTotalEstoque());
    }

    public double calcularValorTotalEstoque() {
        return this.preco * this.quantidade;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
