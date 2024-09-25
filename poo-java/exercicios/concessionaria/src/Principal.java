public class Principal {
    public static void main(String[] args) {
       
        Livraria livraria = new Livraria();

        
        Livro livro1 = new Livro("Java para Iniciantes", "John Doe", 59.90, 10);
        Livro livro2 = new Livro("Estruturas de Dados", "Jane Smith", 79.90, 5);
        Livro livro3 = new Livro("Programação Avançada", "Alan Turing", 99.90, 3);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);

       
        livraria.listarLivros();

        livraria.buscarLivroPorTitulo("Java para Iniciantes");

      
        System.out.println("\nValor total em estoque:");
        System.out.println("Livro 1: R$" + livro1.calcularValorTotalEstoque());
        System.out.println("Livro 2: R$" + livro2.calcularValorTotalEstoque());
        System.out.println("Livro 3: R$" + livro3.calcularValorTotalEstoque());
    }
}
