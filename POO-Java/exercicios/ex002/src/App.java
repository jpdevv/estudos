public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(12);
        Retangulo r = new Retangulo(10, 10);
        Circulo c = new Circulo(15);

        System.out.println(q.imprimir());
        System.out.println(r.imprimir());
        System.out.println(c.imprimir());
    }
}

