public class Main {
    public static void main(String[] args) throws Exception {
        Livraria livraria = new Livraria();
        Livro[] li = {
            new Livro("O Alquimista", "Paulo Coelho", 39.90, 3),
            new Livro("1984", "George Orwell", 42, 6),
            new Livro("Meu Café Esfriou e Eu Lembrei da Gente", "Lucas Lopes", 39.90, 10),
            new Livro("O Hobbit", "J.R.R. Tolkien", 45, 8),
            new Livro("A Menina que Roubava Livros", "Markus Zusak", 49.90, 4),
        };

        for(int i = 0; i < li.length; i++) {
            System.out.println(livraria.adicionarLivro(li[i]));
        }

        System.out.println(livraria.listarLivros());

        System.out.println(livraria.buscarLivroPorTitulo("o alquimista"));
    }
}
