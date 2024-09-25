class Livraria {
    
    private Livro[] livros;
    private int contador;

    public Livraria() {
        livros = new Livro[5];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro adicionado: " + livro.getInfoLivro());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros cadastrados na livraria:");
        for (int i = 0; i < contador; i++) {
            System.out.println(livros[i].getInfoLivro());
        }
    }

   
    public void buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livros[i].getInfoLivro());
                return;
            }
        }
        System.out.println("Livro com título '" + titulo + "' não encontrado.");
    }
}