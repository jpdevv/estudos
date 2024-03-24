public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(12);
        Retangulo r = new Retangulo(10, 10);
        Circulo c = new Circulo(15);
        Fita f = new Fita("Vingadores", 12.5f);

        
        System.out.println(q.imprimir());
        System.out.println(r.imprimir());
        System.out.println(c.imprimir());
        System.out.println(f.toString());
        System.out.println("Valor do aluguel em 5 dias: R$" + f.getValorAluguel(5));
    }
}

