class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int quantidade;

    public Livro(String titulo, String autor, double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getInfoLivro() {
        return "Título: " + titulo + ", Autor: " + autor + 
               ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }

    public double calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    public String getTitulo() {
        return titulo;
    }
}