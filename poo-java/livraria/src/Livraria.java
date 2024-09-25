public class Livraria {
    private Livro[] livros = new Livro[5];
    private int espacoLivre;

    public String adicionarLivro(Livro livro) {
        if(espacoLivre == livros.length) return "O estoque da livraria está cheio!";
        if(espacoLivre >= 0) {
            livros[espacoLivre++] = livro;
            return "Livro adicionado com sucesso!";
        }
        return null;
    }

    public String listarLivros() {
        String str = "";
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] != null) {
                str += livros[i].getInfoLivro();
            }
        }
        if(str != "") return str;
        return "Não há livros cadastrados!";
    }

    public String buscarLivroPorTitulo(String titulo) {
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] != null) {
                if(livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                    String str = "Livro encontrado:\n" + livros[i].getInfoLivro();
                    return str;
                }
            }
        }
        return "Nenhum livro encontrado!";
    }

}
